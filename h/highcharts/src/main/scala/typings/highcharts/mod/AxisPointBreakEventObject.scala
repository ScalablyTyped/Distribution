package typings.highcharts.mod

import typings.highcharts.highchartsStrings.pointBreak
import typings.highcharts.highchartsStrings.pointInBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisPointBreakEventObject extends js.Object {
  
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
  implicit class AxisPointBreakEventObjectOps[Self <: AxisPointBreakEventObject] (val x: Self) extends AnyVal {
    
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
    def setBrk(value: Dictionary[Double]): Self = this.set("brk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: SVGElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pointBreak | pointInBreak): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
