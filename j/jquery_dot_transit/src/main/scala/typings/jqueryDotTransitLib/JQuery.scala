package typings
package jqueryDotTransitLib

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
  def css(propertyName: java.lang.String, value: js.Array[scala.Double]): JQuery = js.native
  def transition(options: JQueryTransitOptions): JQuery = js.native
  def transition(options: JQueryTransitOptions, complete: js.Function0[scala.Unit]): JQuery = js.native
  def transition(options: JQueryTransitOptions, duration: scala.Double): JQuery = js.native
  def transition(options: JQueryTransitOptions, duration: scala.Double, easing: java.lang.String): JQuery = js.native
  def transition(
    options: JQueryTransitOptions,
    duration: scala.Double,
    easing: java.lang.String,
    complete: js.Function0[scala.Unit]
  ): JQuery = js.native
  def transition(options: JQueryTransitOptions, easing: java.lang.String): JQuery = js.native
}

