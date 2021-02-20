package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drillupall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrillupAllEventObject extends StObject {
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  
  /**
    * The event type.
    */
  var `type`: drillupall = js.native
}
object DrillupAllEventObject {
  
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_, `type`: drillupall): DrillupAllEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupAllEventObject]
  }
  
  @scala.inline
  implicit class DrillupAllEventObjectMutableBuilder[Self <: DrillupAllEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drillupall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
