package typings
package looksDashSameLib.looksDashSameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function without diff
  */
trait CreateDiffAsBufferOptions extends js.Object {
  /**
    * The current image path
    */
  var current: java.lang.String
  /**
    * Color to highlight the differences
    * e.g. '#ff00ff'
    */
  var highlightColor: java.lang.String
  /**
    * The baseline image path
    */
  var reference: java.lang.String
  /**
    * strict comparsion
    */
  var strict: scala.Boolean
  /**
    * ΔE value that will be treated as error in non-strict mode
    */
  var tolerance: scala.Double
}

object CreateDiffAsBufferOptions {
  @scala.inline
  def apply(
    current: java.lang.String,
    highlightColor: java.lang.String,
    reference: java.lang.String,
    strict: scala.Boolean,
    tolerance: scala.Double
  ): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("highlightColor")(highlightColor)
    __obj.updateDynamic("reference")(reference)
    __obj.updateDynamic("strict")(strict)
    __obj.updateDynamic("tolerance")(tolerance)
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
}

