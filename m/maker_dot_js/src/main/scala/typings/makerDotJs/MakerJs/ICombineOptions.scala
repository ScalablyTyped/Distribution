package typings.makerDotJs.MakerJs

import typings.makerDotJs.MakerJs.measure.Atlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.combine.
  */
trait ICombineOptions extends IPointMatchOptions {
  /**
    * Point which is known to be outside of the model.
    */
  var farPoint: js.UndefOr[IPoint] = js.undefined
  /**
    * Cached measurements for model A.
    */
  var measureA: js.UndefOr[Atlas] = js.undefined
  /**
    * Cached measurements for model B.
    */
  var measureB: js.UndefOr[Atlas] = js.undefined
  /**
    * Flag to remove paths which are not part of a loop.
    */
  var trimDeadEnds: js.UndefOr[Boolean] = js.undefined
}

object ICombineOptions {
  @scala.inline
  def apply(
    farPoint: IPoint = null,
    measureA: Atlas = null,
    measureB: Atlas = null,
    pointMatchingDistance: Int | Double = null,
    trimDeadEnds: js.UndefOr[Boolean] = js.undefined
  ): ICombineOptions = {
    val __obj = js.Dynamic.literal()
    if (farPoint != null) __obj.updateDynamic("farPoint")(farPoint)
    if (measureA != null) __obj.updateDynamic("measureA")(measureA)
    if (measureB != null) __obj.updateDynamic("measureB")(measureB)
    if (pointMatchingDistance != null) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(trimDeadEnds)) __obj.updateDynamic("trimDeadEnds")(trimDeadEnds)
    __obj.asInstanceOf[ICombineOptions]
  }
}

