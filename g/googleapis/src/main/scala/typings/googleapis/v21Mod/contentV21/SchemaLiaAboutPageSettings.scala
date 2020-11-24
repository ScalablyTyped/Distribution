package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiaAboutPageSettings extends js.Object {
  
  /**
    * The status of the verification process for the About page.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The URL for the About page.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaLiaAboutPageSettings {
  
  @scala.inline
  def apply(): SchemaLiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaAboutPageSettings]
  }
  
  @scala.inline
  implicit class SchemaLiaAboutPageSettingsOps[Self <: SchemaLiaAboutPageSettings] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
