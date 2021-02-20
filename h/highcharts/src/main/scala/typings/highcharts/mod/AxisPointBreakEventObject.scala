package typings.highcharts.mod

import typings.highcharts.highchartsStrings.pointBreak
import typings.highcharts.highchartsStrings.pointInBreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisPointBreakEventObject extends StObject {
  
  var brk: Dictionary[Double] = js.native
  
  var point: Point = js.native
  
  var preventDefault: js.Function = js.native
  
  var target: SVGElement = js.native
  
  var `type`: pointBreak | pointInBreak = js.native
}
object AxisPointBreakEventObject {
  
  @scala.inline
  def apply(
    brk: Dictionary[Double],
    point: Point,
    preventDefault: js.Function,
    target: SVGElement,
    `type`: pointBreak | pointInBreak
  ): AxisPointBreakEventObject = {
    val __obj = js.Dynamic.literal(brk = brk.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPointBreakEventObject]
  }
  
  @scala.inline
  implicit class AxisPointBreakEventObjectMutableBuilder[Self <: AxisPointBreakEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrk(value: Dictionary[Double]): Self = StObject.set(x, "brk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: SVGElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pointBreak | pointInBreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
