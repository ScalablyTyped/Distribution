package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance failover request.
  */
@js.native
trait SchemaInstancesFailoverRequest extends js.Object {
  
  /**
    * Failover Context.
    */
  var failoverContext: js.UndefOr[SchemaFailoverContext] = js.native
}
object SchemaInstancesFailoverRequest {
  
  @scala.inline
  def apply(): SchemaInstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesFailoverRequest]
  }
  
  @scala.inline
  implicit class SchemaInstancesFailoverRequestOps[Self <: SchemaInstancesFailoverRequest] (val x: Self) extends AnyVal {
    
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
    def setFailoverContext(value: SchemaFailoverContext): Self = this.set("failoverContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverContext: Self = this.set("failoverContext", js.undefined)
  }
}
