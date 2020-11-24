package typings.googleapis.cloudshellV1Mod.cloudshellV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message included in the response field of operations returned from
  * StartEnvironment once the operation is complete.
  */
@js.native
trait SchemaStartEnvironmentResponse extends js.Object {
  
  /**
    * Environment that was started.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
}
object SchemaStartEnvironmentResponse {
  
  @scala.inline
  def apply(): SchemaStartEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartEnvironmentResponse]
  }
  
  @scala.inline
  implicit class SchemaStartEnvironmentResponseOps[Self <: SchemaStartEnvironmentResponse] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: SchemaEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
  }
}
