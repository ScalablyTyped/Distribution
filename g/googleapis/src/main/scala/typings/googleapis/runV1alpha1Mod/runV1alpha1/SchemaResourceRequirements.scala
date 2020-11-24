package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRequirements describes the compute resource requirements.
  */
@js.native
trait SchemaResourceRequirements extends js.Object {
  
  /**
    * Limits describes the maximum amount of compute resources allowed. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Limits describes the maximum amount of compute resources allowed. This is
    * a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; limits field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of limits field.
    */
  var limitsInMap: js.UndefOr[StringDictionary[SchemaQuantity]] = js.native
  
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. The
    * values of the map is string form of the &#39;quantity&#39; k8s type:
    * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var requests: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Requests describes the minimum amount of compute resources required. If
    * Requests is omitted for a container, it defaults to Limits if that is
    * explicitly specified, otherwise to an implementation-defined value. This
    * is a temporary field created to migrate away from the map&lt;string,
    * Quantity&gt; requests field. This is done to become compliant with k8s
    * style API. This field is deprecated in favor of requests field.
    */
  var requestsInMap: js.UndefOr[StringDictionary[SchemaQuantity]] = js.native
}
object SchemaResourceRequirements {
  
  @scala.inline
  def apply(): SchemaResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceRequirements]
  }
  
  @scala.inline
  implicit class SchemaResourceRequirementsOps[Self <: SchemaResourceRequirements] (val x: Self) extends AnyVal {
    
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
    def setLimits(value: StringDictionary[String]): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setLimitsInMap(value: StringDictionary[SchemaQuantity]): Self = this.set("limitsInMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitsInMap: Self = this.set("limitsInMap", js.undefined)
    
    @scala.inline
    def setRequests(value: StringDictionary[String]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setRequestsInMap(value: StringDictionary[SchemaQuantity]): Self = this.set("requestsInMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsInMap: Self = this.set("requestsInMap", js.undefined)
  }
}
