package typings.looksDashSame.looksDashSameMod

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
  var current: String
  /**
    * Color to highlight the differences
    * e.g. '#ff00ff'
    */
  var highlightColor: String
  /**
    * The baseline image path
    */
  var reference: String
  /**
    * strict comparsion
    */
  var strict: Boolean
  /**
    * ΔE value that will be treated as error in non-strict mode
    */
  var tolerance: Double
}

object CreateDiffAsBufferOptions {
  @scala.inline
  def apply(current: String, highlightColor: String, reference: String, strict: Boolean, tolerance: Double): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal(current = current, highlightColor = highlightColor, reference = reference, strict = strict, tolerance = tolerance)
  
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
}

