package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Balances extends js.Object {
  
  var balances: js.Array[Double] = js.native
  
  var duration: Double = js.native
  
  var milestone: String = js.native
  
  var milestoneIndex: Double = js.native
}
object Balances {
  
  @scala.inline
  def apply(balances: js.Array[Double], duration: Double, milestone: String, milestoneIndex: Double): Balances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], milestoneIndex = milestoneIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balances]
  }
  
  @scala.inline
  implicit class BalancesOps[Self <: Balances] (val x: Self) extends AnyVal {
    
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
    def setBalancesVarargs(value: Double*): Self = this.set("balances", js.Array(value :_*))
    
    @scala.inline
    def setBalances(value: js.Array[Double]): Self = this.set("balances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestone(value: String): Self = this.set("milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneIndex(value: Double): Self = this.set("milestoneIndex", value.asInstanceOf[js.Any])
  }
}
