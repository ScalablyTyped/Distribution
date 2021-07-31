package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRequirements describes the compute resource requirements.
  */
trait SchemaResourceRequirements extends StObject {
  
  /**
    * Limits describes the maximum amount of compute resources allowed. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Limits describes the maximum amount of compute resources allowed. This is
    * a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; limits field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of limits field.
    */
  var limitsInMap: js.UndefOr[StringDictionary[SchemaQuantity]] = js.undefined
  
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var requests: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. This
    * is a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; requests field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of requests field.
    */
  var requestsInMap: js.UndefOr[StringDictionary[SchemaQuantity]] = js.undefined
}
object SchemaResourceRequirements {
  
  @scala.inline
  def apply(): SchemaResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRequirements]
  }
  
  @scala.inline
  implicit class SchemaResourceRequirementsMutableBuilder[Self <: SchemaResourceRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimits(value: StringDictionary[String]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsInMap(value: StringDictionary[SchemaQuantity]): Self = StObject.set(x, "limitsInMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsInMapUndefined: Self = StObject.set(x, "limitsInMap", js.undefined)
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setRequests(value: StringDictionary[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsInMap(value: StringDictionary[SchemaQuantity]): Self = StObject.set(x, "requestsInMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsInMapUndefined: Self = StObject.set(x, "requestsInMap", js.undefined)
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
