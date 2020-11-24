package typings.googleapis.playcustomappV1Mod.playcustomappV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This resource represents a custom app.
  */
@js.native
trait SchemaCustomApp extends js.Object {
  
  /**
    * Default listing language in BCP 47 format.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Title for the Android app.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaCustomApp {
  
  @scala.inline
  def apply(): SchemaCustomApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomApp]
  }
  
  @scala.inline
  implicit class SchemaCustomAppOps[Self <: SchemaCustomApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
