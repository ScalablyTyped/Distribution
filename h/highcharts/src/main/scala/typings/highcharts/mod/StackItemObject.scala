package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackItemObject extends js.Object {
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
}

