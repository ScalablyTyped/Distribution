package typings.looksDashSame.looksDashSameMod

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
  var diff: String
}

object CreateDiffOptions {
  @scala.inline
  def apply(
    current: String,
    diff: String,
    highlightColor: String,
    reference: String,
    strict: Boolean,
    tolerance: Double
  ): CreateDiffOptions = {
    val __obj = js.Dynamic.literal(current = current, diff = diff, highlightColor = highlightColor, reference = reference, strict = strict, tolerance = tolerance)
  
    __obj.asInstanceOf[CreateDiffOptions]
  }
}

