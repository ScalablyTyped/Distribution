package typings.jqueryDotTransit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////
@js.native
trait JQuery extends js.Object {
  /**
    * Set one or more CSS properties for the set of matched elements.
    *
    * @param propertyName A CSS property name.
    * @param value A value to set for the property.
    */
  def css(propertyName: String, value: js.Array[Double]): JQuery = js.native
  def transition(options: JQueryTransitOptions): JQuery = js.native
  def transition(options: JQueryTransitOptions, complete: js.Function0[Unit]): JQuery = js.native
  def transition(options: JQueryTransitOptions, duration: Double): JQuery = js.native
  def transition(options: JQueryTransitOptions, duration: Double, easing: String): JQuery = js.native
  def transition(options: JQueryTransitOptions, duration: Double, easing: String, complete: js.Function0[Unit]): JQuery = js.native
  def transition(options: JQueryTransitOptions, easing: String): JQuery = js.native
}

