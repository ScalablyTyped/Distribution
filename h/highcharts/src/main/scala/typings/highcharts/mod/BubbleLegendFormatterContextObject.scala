package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleLegendFormatterContextObject extends StObject {
  
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
  implicit class BubbleLegendFormatterContextObjectMutableBuilder[Self <: BubbleLegendFormatterContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
