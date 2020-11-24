package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionRequest extends js.Object {
  
  /**
    * Input to be passed to the function.
    */
  var data: js.UndefOr[String] = js.native
}
object SchemaCallFunctionRequest {
  
  @scala.inline
  def apply(): SchemaCallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionRequest]
  }
  
  @scala.inline
  implicit class SchemaCallFunctionRequestOps[Self <: SchemaCallFunctionRequest] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
