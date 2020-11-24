package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic Links warning messages.
  */
@js.native
trait SchemaDynamicLinkWarning extends js.Object {
  
  /**
    * The warning code.
    */
  var warningCode: js.UndefOr[String] = js.native
  
  /**
    * The document describing the warning, and helps resolve.
    */
  var warningDocumentLink: js.UndefOr[String] = js.native
  
  /**
    * The warning message to help developers improve their requests.
    */
  var warningMessage: js.UndefOr[String] = js.native
}
object SchemaDynamicLinkWarning {
  
  @scala.inline
  def apply(): SchemaDynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkWarning]
  }
  
  @scala.inline
  implicit class SchemaDynamicLinkWarningOps[Self <: SchemaDynamicLinkWarning] (val x: Self) extends AnyVal {
    
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
    def setWarningCode(value: String): Self = this.set("warningCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningCode: Self = this.set("warningCode", js.undefined)
    
    @scala.inline
    def setWarningDocumentLink(value: String): Self = this.set("warningDocumentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningDocumentLink: Self = this.set("warningDocumentLink", js.undefined)
    
    @scala.inline
    def setWarningMessage(value: String): Self = this.set("warningMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningMessage: Self = this.set("warningMessage", js.undefined)
  }
}
