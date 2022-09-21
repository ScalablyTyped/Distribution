package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationPolicyLocationConstraints extends StObject {
  
  /**
    * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
    */
  var maxCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLocationPolicyLocationConstraints {
  
  inline def apply(): SchemaLocationPolicyLocationConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPolicyLocationConstraints]
  }
  
  extension [Self <: SchemaLocationPolicyLocationConstraints](x: Self) {
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountNull: Self = StObject.set(x, "maxCount", null)
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
  }
}
