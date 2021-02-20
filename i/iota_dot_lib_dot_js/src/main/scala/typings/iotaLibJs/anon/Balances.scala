package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Balances extends StObject {
  
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
  implicit class BalancesMutableBuilder[Self <: Balances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalances(value: js.Array[Double]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalancesVarargs(value: Double*): Self = StObject.set(x, "balances", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestone(value: String): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneIndex(value: Double): Self = StObject.set(x, "milestoneIndex", value.asInstanceOf[js.Any])
  }
}
