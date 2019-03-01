package typings
package looksDashSameLib.looksDashSameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function
  */
trait CreateDiffOptions extends CreateDiffAsBufferOptions {
  /**
    * The diff image path to store
    */
  var diff: java.lang.String
}

object CreateDiffOptions {
  @scala.inline
  def apply(
    current: java.lang.String,
    diff: java.lang.String,
    highlightColor: java.lang.String,
    reference: java.lang.String,
    strict: scala.Boolean,
    tolerance: scala.Double
  ): CreateDiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("diff")(diff)
    __obj.updateDynamic("highlightColor")(highlightColor)
    __obj.updateDynamic("reference")(reference)
    __obj.updateDynamic("strict")(strict)
    __obj.updateDynamic("tolerance")(tolerance)
    __obj.asInstanceOf[CreateDiffOptions]
  }
}

