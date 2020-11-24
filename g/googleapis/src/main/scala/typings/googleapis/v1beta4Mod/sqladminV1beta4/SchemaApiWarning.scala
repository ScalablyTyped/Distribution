package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Admin API warning message.
  */
@js.native
trait SchemaApiWarning extends js.Object {
  
  /**
    * Code to uniquely identify the warning type.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The warning message.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaApiWarning {
  
  @scala.inline
  def apply(): SchemaApiWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiWarning]
  }
  
  @scala.inline
  implicit class SchemaApiWarningOps[Self <: SchemaApiWarning] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
