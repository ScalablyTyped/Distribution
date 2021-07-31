package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackItemObject extends StObject {
  
  /**
    * Alignment settings
    */
  var alignOptions: AlignObject
  
  /**
    * Related axis
    */
  var axis: Axis
  
  /**
    * Cumulative value of the stacked data points
    */
  var cumulative: Double
  
  /**
    * True if on the negative side
    */
  var isNegative: Boolean
  
  /**
    * Related SVG element
    */
  var label: SVGElement
  
  /**
    * Related stack options
    */
  var options: YAxisStackLabelsOptions
  
  /**
    * Total value of the stacked data points
    */
  var total: Double
  
  /**
    * Shared x value of the stack
    */
  var x: Double
}
object StackItemObject {
  
  @scala.inline
  def apply(
    alignOptions: AlignObject,
    axis: Axis,
    cumulative: Double,
    isNegative: Boolean,
    label: SVGElement,
    options: YAxisStackLabelsOptions,
    total: Double,
    x: Double
  ): StackItemObject = {
    val __obj = js.Dynamic.literal(alignOptions = alignOptions.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], cumulative = cumulative.asInstanceOf[js.Any], isNegative = isNegative.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackItemObject]
  }
  
  @scala.inline
  implicit class StackItemObjectMutableBuilder[Self <: StackItemObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignOptions(value: AlignObject): Self = StObject.set(x, "alignOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulative(value: Double): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNegative(value: Boolean): Self = StObject.set(x, "isNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: SVGElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: YAxisStackLabelsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
