package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance operation error.
  */
@js.native
trait SchemaOperationError extends js.Object {
  
  /**
    * Identifies the specific error that occurred.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#operationError.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Additional information about the error encountered.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaOperationError {
  
  @scala.inline
  def apply(): SchemaOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationError]
  }
  
  @scala.inline
  implicit class SchemaOperationErrorOps[Self <: SchemaOperationError] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
