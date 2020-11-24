package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of errors returned by a failed batch entry.
  */
@js.native
trait SchemaErrors extends js.Object {
  
  /**
    * The HTTP status of the first error in errors.
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
  
  /**
    * The message of the first error in errors.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaErrors {
  
  @scala.inline
  def apply(): SchemaErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrors]
  }
  
  @scala.inline
  implicit class SchemaErrorsOps[Self <: SchemaErrors] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
