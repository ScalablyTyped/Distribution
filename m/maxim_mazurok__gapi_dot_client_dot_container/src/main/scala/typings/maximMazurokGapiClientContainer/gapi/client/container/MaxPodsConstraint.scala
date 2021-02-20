package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxPodsConstraint extends StObject {
  
  /** Constraint enforced on the max num of pods per node. */
  var maxPodsPerNode: js.UndefOr[String] = js.native
}
object MaxPodsConstraint {
  
  @scala.inline
  def apply(): MaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPodsConstraint]
  }
  
  @scala.inline
  implicit class MaxPodsConstraintMutableBuilder[Self <: MaxPodsConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxPodsPerNode(value: String): Self = StObject.set(x, "maxPodsPerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPodsPerNodeUndefined: Self = StObject.set(x, "maxPodsPerNode", js.undefined)
  }
}
