package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNamespacesJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Cloud Run currently ignores this parameter.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Cloud Run currently ignores this parameter.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the job to delete. Replace {namespace\} with the project ID or number. It takes the form namespaces/{namespace\}. For example: namespaces/PROJECT_ID
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies the propagation policy of delete. Cloud Run currently ignores this setting, and deletes in the background. Please see kubernetes.io/docs/concepts/workloads/controllers/garbage-collection/ for more information.
    */
  var propagationPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceNamespacesJobsDelete {
  
  inline def apply(): ParamsResourceNamespacesJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesJobsDelete]
  }
  
  extension [Self <: ParamsResourceNamespacesJobsDelete](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPropagationPolicy(value: String): Self = StObject.set(x, "propagationPolicy", value.asInstanceOf[js.Any])
    
    inline def setPropagationPolicyUndefined: Self = StObject.set(x, "propagationPolicy", js.undefined)
  }
}
