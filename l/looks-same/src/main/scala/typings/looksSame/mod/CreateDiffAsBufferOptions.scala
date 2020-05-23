package typings.looksSame.mod

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
    antialiasingTolerance: js.UndefOr[Double] = js.undefined,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    ignoreCaret: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tolerance: js.UndefOr[Double] = js.undefined
  ): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (!js.isUndefined(antialiasingTolerance)) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCaret)) __obj.updateDynamic("ignoreCaret")(ignoreCaret.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
}

