package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balances extends StObject {
  
  var balances: js.Array[Double]
  
  var duration: Double
  
  var milestone: String
  
  var milestoneIndex: Double
}
object Balances {
  
  inline def apply(balances: js.Array[Double], duration: Double, milestone: String, milestoneIndex: Double): Balances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], milestoneIndex = milestoneIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Balances] (val x: Self) extends AnyVal {
    
    inline def setBalances(value: js.Array[Double]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    inline def setBalancesVarargs(value: Double*): Self = StObject.set(x, "balances", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMilestone(value: String): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneIndex(value: Double): Self = StObject.set(x, "milestoneIndex", value.asInstanceOf[js.Any])
  }
}
