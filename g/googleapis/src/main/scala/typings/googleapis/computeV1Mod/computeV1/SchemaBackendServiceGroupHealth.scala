package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceGroupHealth extends StObject {
  
  /**
    * Health state of the backend instances or endpoints in requested instance
    * or network endpoint group, determined based on configured health checks.
    */
  var healthStatus: js.UndefOr[js.Array[SchemaHealthStatus]] = js.undefined
  
  /**
    * [Output Only] Type of resource. Always compute#backendServiceGroupHealth
    * for the health of backend services.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBackendServiceGroupHealth {
  
  @scala.inline
  def apply(): SchemaBackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceGroupHealth]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceGroupHealthMutableBuilder[Self <: SchemaBackendServiceGroupHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: js.Array[SchemaHealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    @scala.inline
    def setHealthStatusVarargs(value: SchemaHealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
