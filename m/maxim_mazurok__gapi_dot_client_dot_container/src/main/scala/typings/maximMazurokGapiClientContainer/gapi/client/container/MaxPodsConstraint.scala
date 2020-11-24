package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxPodsConstraint extends js.Object {
  
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
  implicit class MaxPodsConstraintOps[Self <: MaxPodsConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxPodsPerNode(value: String): Self = this.set("maxPodsPerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPodsPerNode: Self = this.set("maxPodsPerNode", js.undefined)
  }
}
