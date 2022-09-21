package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadIdentityConfig extends StObject {
  
  /**
    * The workload pool to attach all Kubernetes service accounts to.
    */
  var workloadPool: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkloadIdentityConfig {
  
  inline def apply(): SchemaWorkloadIdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadIdentityConfig]
  }
  
  extension [Self <: SchemaWorkloadIdentityConfig](x: Self) {
    
    inline def setWorkloadPool(value: String): Self = StObject.set(x, "workloadPool", value.asInstanceOf[js.Any])
    
    inline def setWorkloadPoolNull: Self = StObject.set(x, "workloadPool", null)
    
    inline def setWorkloadPoolUndefined: Self = StObject.set(x, "workloadPool", js.undefined)
  }
}
