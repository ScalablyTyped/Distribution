package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constraints applied to pods.
  */
trait SchemaMaxPodsConstraint extends StObject {
  
  /**
    * Constraint enforced on the max num of pods per node.
    */
  var maxPodsPerNode: js.UndefOr[String] = js.undefined
}
object SchemaMaxPodsConstraint {
  
  @scala.inline
  def apply(): SchemaMaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaxPodsConstraint]
  }
  
  @scala.inline
  implicit class SchemaMaxPodsConstraintMutableBuilder[Self <: SchemaMaxPodsConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxPodsPerNode(value: String): Self = StObject.set(x, "maxPodsPerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPodsPerNodeUndefined: Self = StObject.set(x, "maxPodsPerNode", js.undefined)
  }
}
