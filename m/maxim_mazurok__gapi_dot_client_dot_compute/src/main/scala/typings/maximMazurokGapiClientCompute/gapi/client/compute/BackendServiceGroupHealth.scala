package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceGroupHealth extends StObject {
  
  /** Metadata defined as annotations on the network endpoint group. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks. */
  var healthStatus: js.UndefOr[js.Array[HealthStatus]] = js.undefined
  
  /** [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services. */
  var kind: js.UndefOr[String] = js.undefined
}
object BackendServiceGroupHealth {
  
  inline def apply(): BackendServiceGroupHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceGroupHealth]
  }
  
  extension [Self <: BackendServiceGroupHealth](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setHealthStatus(value: js.Array[HealthStatus]): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setHealthStatusVarargs(value: HealthStatus*): Self = StObject.set(x, "healthStatus", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
