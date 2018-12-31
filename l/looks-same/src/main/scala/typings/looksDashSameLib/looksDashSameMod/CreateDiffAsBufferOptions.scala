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

