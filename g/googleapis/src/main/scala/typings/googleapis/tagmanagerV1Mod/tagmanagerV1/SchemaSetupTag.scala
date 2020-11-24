package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSetupTag extends js.Object {
  
  /**
    * If true, fire the main tag if and only if the setup tag fires
    * successfully. If false, fire the main tag regardless of setup tag firing
    * status.
    */
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the setup tag.
    */
  var tagName: js.UndefOr[String] = js.native
}
object SchemaSetupTag {
  
  @scala.inline
  def apply(): SchemaSetupTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupTag]
  }
  
  @scala.inline
  implicit class SchemaSetupTagOps[Self <: SchemaSetupTag] (val x: Self) extends AnyVal {
    
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
    def setStopOnSetupFailure(value: Boolean): Self = this.set("stopOnSetupFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnSetupFailure: Self = this.set("stopOnSetupFailure", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
