package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1beta1RemoveVisibilityLabelsResponse extends StObject {
  
  /**
    * The updated set of visibility labels for this consumer on this service.
    */
  var labels: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaV1beta1RemoveVisibilityLabelsResponse {
  
  inline def apply(): SchemaV1beta1RemoveVisibilityLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1beta1RemoveVisibilityLabelsResponse]
  }
  
  extension [Self <: SchemaV1beta1RemoveVisibilityLabelsResponse](x: Self) {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
