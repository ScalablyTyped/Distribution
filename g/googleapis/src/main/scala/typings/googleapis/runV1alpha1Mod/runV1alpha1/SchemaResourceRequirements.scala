package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceRequirements extends StObject {
  
  /**
    * (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var requests: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaResourceRequirements {
  
  inline def apply(): SchemaResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRequirements]
  }
  
  extension [Self <: SchemaResourceRequirements](x: Self) {
    
    inline def setLimits(value: StringDictionary[String]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsNull: Self = StObject.set(x, "limits", null)
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequests(value: StringDictionary[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsNull: Self = StObject.set(x, "requests", null)
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
