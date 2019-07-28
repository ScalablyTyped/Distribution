package typings.heremaps.HNs.utilNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This mamespace contains easing functions used for Animation class.
  */
@JSGlobal("H.util.animation.ease")
@js.native
class ease () extends js.Object

/* static members */
@JSGlobal("H.util.animation.ease")
@js.native
object ease extends js.Object {
  /**
    * This function defines ease in and out with slope.
    * @param val {number} - A value in range [0..1] to translate
    * @returns {number} - the translated value
    */
  def EASE_IN_OUT_QUINT(`val`: Double): Double = js.native
  /**
    * This function defines quadratic ease in.
    * @param val {number} - A value in range [0..1] to translate
    * @returns {number} - the translated value
    */
  def EASE_IN_QUAD(`val`: Double): Double = js.native
  /**
    * This function defines ease out with circ function.
    * @param val {number} - A value in range [0..1] to translate
    * @returns {number} - the translated value
    */
  def EASE_OUT_CIRC(`val`: Double): Double = js.native
  /**
    * This function defines quadratic ease out.
    * @param val {number} - A value in range [0..1] to translate
    * @returns {number} - the translated value
    */
  def EASE_OUT_QUAD(`val`: Double): Double = js.native
  /**
    * This function defines linear ease.
    * @param val {number} - A value in range [0..1] to translate
    * @returns {number} - the translated value
    */
  def LINEAR(`val`: Double): Double = js.native
}

