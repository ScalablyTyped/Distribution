package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosVMMembershipState extends StObject {
  
  /**
    * State of the local PE-controller inside the cluster
    */
  var localControllerState: js.UndefOr[SchemaLocalControllerState] = js.undefined
  
  /**
    * List of AnthosVM subfeature states
    */
  var subfeatureState: js.UndefOr[js.Array[SchemaAnthosVMSubFeatureState]] = js.undefined
}
object SchemaAnthosVMMembershipState {
  
  inline def apply(): SchemaAnthosVMMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosVMMembershipState]
  }
  
  extension [Self <: SchemaAnthosVMMembershipState](x: Self) {
    
    inline def setLocalControllerState(value: SchemaLocalControllerState): Self = StObject.set(x, "localControllerState", value.asInstanceOf[js.Any])
    
    inline def setLocalControllerStateUndefined: Self = StObject.set(x, "localControllerState", js.undefined)
    
    inline def setSubfeatureState(value: js.Array[SchemaAnthosVMSubFeatureState]): Self = StObject.set(x, "subfeatureState", value.asInstanceOf[js.Any])
    
    inline def setSubfeatureStateUndefined: Self = StObject.set(x, "subfeatureState", js.undefined)
    
    inline def setSubfeatureStateVarargs(value: SchemaAnthosVMSubFeatureState*): Self = StObject.set(x, "subfeatureState", js.Array(value*))
  }
}
