package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Composites extends js.Object {
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @method newtonsCradle
    * @param {number} xx
    * @param {number} yy
    * @param {number} number
    * @param {number} size
    * @param {number} length
    * @return {composite} A new composite newtonsCradle body
    */
  def newtonsCradle(
    xx: scala.Double,
    yy: scala.Double,
    _number: scala.Double,
    size: scala.Double,
    length: scala.Double
  ): Composite
}

object Composites {
  @scala.inline
  def apply(
    newtonsCradle: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, Composite]
  ): Composites = {
    val __obj = js.Dynamic.literal(newtonsCradle = newtonsCradle)
  
    __obj.asInstanceOf[Composites]
  }
}

