package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceSubresourceScale extends StObject {
  
  /**
    * LabelSelectorPath defines the JSON path inside of a CustomResource that corresponds to Scale.Status.Selector. Only JSON paths without the array notation are allowed. Must be a JSON Path under .status. Must be set to work with HPA. If there is no value under the given path in the CustomResource, the status label selector value in the /scale subresource will default to the empty string. +optional
    */
  var labelSelectorPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SpecReplicasPath defines the JSON path inside of a CustomResource that corresponds to Scale.Spec.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON Path under .spec. If there is no value under the given path in the CustomResource, the /scale subresource will return an error on GET.
    */
  var specReplicasPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * StatusReplicasPath defines the JSON path inside of a CustomResource that corresponds to Scale.Status.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON Path under .status. If there is no value under the given path in the CustomResource, the status replica value in the /scale subresource will default to 0.
    */
  var statusReplicasPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomResourceSubresourceScale {
  
  inline def apply(): SchemaCustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceSubresourceScale]
  }
  
  extension [Self <: SchemaCustomResourceSubresourceScale](x: Self) {
    
    inline def setLabelSelectorPath(value: String): Self = StObject.set(x, "labelSelectorPath", value.asInstanceOf[js.Any])
    
    inline def setLabelSelectorPathNull: Self = StObject.set(x, "labelSelectorPath", null)
    
    inline def setLabelSelectorPathUndefined: Self = StObject.set(x, "labelSelectorPath", js.undefined)
    
    inline def setSpecReplicasPath(value: String): Self = StObject.set(x, "specReplicasPath", value.asInstanceOf[js.Any])
    
    inline def setSpecReplicasPathNull: Self = StObject.set(x, "specReplicasPath", null)
    
    inline def setSpecReplicasPathUndefined: Self = StObject.set(x, "specReplicasPath", js.undefined)
    
    inline def setStatusReplicasPath(value: String): Self = StObject.set(x, "statusReplicasPath", value.asInstanceOf[js.Any])
    
    inline def setStatusReplicasPathNull: Self = StObject.set(x, "statusReplicasPath", null)
    
    inline def setStatusReplicasPathUndefined: Self = StObject.set(x, "statusReplicasPath", js.undefined)
  }
}
