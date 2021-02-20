package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProximityData extends StObject {
  
  var cm: Double = js.native
  
  var in: Double = js.native
}
object ProximityData {
  
  @scala.inline
  def apply(cm: Double, in: Double): ProximityData = {
    val __obj = js.Dynamic.literal(cm = cm.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityData]
  }
  
  @scala.inline
  implicit class ProximityDataMutableBuilder[Self <: ProximityData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCm(value: Double): Self = StObject.set(x, "cm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn(value: Double): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
  }
}
