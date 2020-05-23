package typings.looksSame.mod

import typings.node.Buffer
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
    current: String | Buffer | BoundedImage,
    diff: String,
    highlightColor: String,
    reference: String | Buffer | BoundedImage,
    antialiasingTolerance: js.UndefOr[Double] = js.undefined,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    ignoreCaret: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tolerance: js.UndefOr[Double] = js.undefined
  ): CreateDiffOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (!js.isUndefined(antialiasingTolerance)) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCaret)) __obj.updateDynamic("ignoreCaret")(ignoreCaret.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tolerance)) __obj.updateDynamic("tolerance")(tolerance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffOptions]
  }
}

