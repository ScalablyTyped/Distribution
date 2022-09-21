package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFleetLifecycleState extends StObject {
  
  /**
    * Output only. The current state of the Fleet resource.
    */
  var code: js.UndefOr[String | Null] = js.undefined
}
object SchemaFleetLifecycleState {
  
  inline def apply(): SchemaFleetLifecycleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFleetLifecycleState]
  }
  
  extension [Self <: SchemaFleetLifecycleState](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
