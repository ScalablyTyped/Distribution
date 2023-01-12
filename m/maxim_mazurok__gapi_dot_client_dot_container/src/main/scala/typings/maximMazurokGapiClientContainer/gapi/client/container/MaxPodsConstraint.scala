package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxPodsConstraint extends StObject {
  
  /** Constraint enforced on the max num of pods per node. */
  var maxPodsPerNode: js.UndefOr[String] = js.undefined
}
object MaxPodsConstraint {
  
  inline def apply(): MaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPodsConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxPodsConstraint] (val x: Self) extends AnyVal {
    
    inline def setMaxPodsPerNode(value: String): Self = StObject.set(x, "maxPodsPerNode", value.asInstanceOf[js.Any])
    
    inline def setMaxPodsPerNodeUndefined: Self = StObject.set(x, "maxPodsPerNode", js.undefined)
  }
}
