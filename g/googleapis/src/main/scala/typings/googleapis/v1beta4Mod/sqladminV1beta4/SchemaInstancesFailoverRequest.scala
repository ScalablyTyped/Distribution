package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance failover request.
  */
@js.native
trait SchemaInstancesFailoverRequest extends StObject {
  
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
  implicit class SchemaInstancesFailoverRequestMutableBuilder[Self <: SchemaInstancesFailoverRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverContext(value: SchemaFailoverContext): Self = StObject.set(x, "failoverContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverContextUndefined: Self = StObject.set(x, "failoverContext", js.undefined)
  }
}
