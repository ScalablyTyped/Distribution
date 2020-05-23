package typings.makerJs.MakerJs

import typings.makerJs.MakerJs.measure.Atlas
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
    pointMatchingDistance: js.UndefOr[Double] = js.undefined,
    trimDeadEnds: js.UndefOr[Boolean] = js.undefined
  ): ICombineOptions = {
    val __obj = js.Dynamic.literal()
    if (farPoint != null) __obj.updateDynamic("farPoint")(farPoint.asInstanceOf[js.Any])
    if (measureA != null) __obj.updateDynamic("measureA")(measureA.asInstanceOf[js.Any])
    if (measureB != null) __obj.updateDynamic("measureB")(measureB.asInstanceOf[js.Any])
    if (!js.isUndefined(pointMatchingDistance)) __obj.updateDynamic("pointMatchingDistance")(pointMatchingDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimDeadEnds)) __obj.updateDynamic("trimDeadEnds")(trimDeadEnds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICombineOptions]
  }
}

