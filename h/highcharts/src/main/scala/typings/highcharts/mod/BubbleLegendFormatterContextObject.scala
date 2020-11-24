package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleLegendFormatterContextObject extends js.Object {
  
  /**
    * The center y position of the range.
    */
  var center: Double = js.native
  
  /**
    * The radius of the bubble range.
    */
  var radius: Double = js.native
  
  /**
    * The bubble value.
    */
  var value: Double = js.native
}
object BubbleLegendFormatterContextObject {
  
  @scala.inline
  def apply(center: Double, radius: Double, value: Double): BubbleLegendFormatterContextObject = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleLegendFormatterContextObject]
  }
  
  @scala.inline
  implicit class BubbleLegendFormatterContextObjectOps[Self <: BubbleLegendFormatterContextObject] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Double): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
