package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaxPodsConstraint extends StObject {
  
  /**
    * Constraint enforced on the max num of pods per node.
    */
  var maxPodsPerNode: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaxPodsConstraint {
  
  inline def apply(): SchemaMaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaxPodsConstraint]
  }
  
  extension [Self <: SchemaMaxPodsConstraint](x: Self) {
    
    inline def setMaxPodsPerNode(value: String): Self = StObject.set(x, "maxPodsPerNode", value.asInstanceOf[js.Any])
    
    inline def setMaxPodsPerNodeNull: Self = StObject.set(x, "maxPodsPerNode", null)
    
    inline def setMaxPodsPerNodeUndefined: Self = StObject.set(x, "maxPodsPerNode", js.undefined)
  }
}
