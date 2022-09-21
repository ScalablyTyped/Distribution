package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Cloud Run currently ignores this parameter.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the server should validate the request and populate default values without persisting the request. Supported values: `all`
    */
  var dryRun: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Run currently ignores this parameter.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service to delete. For Cloud Run (fully managed), replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    */
  var propagationPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesDelete](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setDryRun(value: String): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPropagationPolicy(value: String): Self = StObject.set(x, "propagationPolicy", value.asInstanceOf[js.Any])
    
    inline def setPropagationPolicyUndefined: Self = StObject.set(x, "propagationPolicy", js.undefined)
  }
}
