package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV1PolicyDelta extends StObject {
  
  /**
    * The delta for Bindings between two policies.
    */
  var bindingDeltas: js.UndefOr[js.Array[SchemaGoogleIamV1BindingDelta]] = js.undefined
}
object SchemaGoogleIamV1PolicyDelta {
  
  inline def apply(): SchemaGoogleIamV1PolicyDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1PolicyDelta]
  }
  
  extension [Self <: SchemaGoogleIamV1PolicyDelta](x: Self) {
    
    inline def setBindingDeltas(value: js.Array[SchemaGoogleIamV1BindingDelta]): Self = StObject.set(x, "bindingDeltas", value.asInstanceOf[js.Any])
    
    inline def setBindingDeltasUndefined: Self = StObject.set(x, "bindingDeltas", js.undefined)
    
    inline def setBindingDeltasVarargs(value: SchemaGoogleIamV1BindingDelta*): Self = StObject.set(x, "bindingDeltas", js.Array(value*))
  }
}
