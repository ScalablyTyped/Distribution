package typings.looksDashSame.looksDashSameMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function without diff
  */
trait CreateDiffAsBufferOptions extends js.Object {
  /**
    * makes the search algorithm of the antialiasing less strict
    */
  var antialiasingTolerance: js.UndefOr[Double] = js.undefined
  /**
    * The current image
    */
  var current: String | Buffer | BoundedImage
  /**
    * Color to highlight the differences
    * e.g. '#ff00ff'
    */
  var highlightColor: String
  /**
    * Ability to ignore antialiasing
    */
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined
  /**
    * Ability to ignore text caret
    */
  var ignoreCaret: js.UndefOr[Boolean] = js.undefined
  /**
    * The baseline image
    */
  var reference: String | Buffer | BoundedImage
  /**
    * strict comparsion
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * ΔE value that will be treated as error in non-strict mode
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}

object CreateDiffAsBufferOptions {
  @scala.inline
  def apply(
    current: String | Buffer | BoundedImage,
    highlightColor: String,
    reference: String | Buffer | BoundedImage,
    antialiasingTolerance: Int | Double = null,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    ignoreCaret: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tolerance: Int | Double = null
  ): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], highlightColor = highlightColor, reference = reference.asInstanceOf[js.Any])
    if (antialiasingTolerance != null) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing)
    if (!js.isUndefined(ignoreCaret)) __obj.updateDynamic("ignoreCaret")(ignoreCaret)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
}

