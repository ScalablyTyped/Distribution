package typings
package makerDotJsLib.MakerJsNs

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
  var measureA: js.UndefOr[makerDotJsLib.MakerJsNs.measureNs.Atlas] = js.undefined
  /**
    * Cached measurements for model B.
    */
  var measureB: js.UndefOr[makerDotJsLib.MakerJsNs.measureNs.Atlas] = js.undefined
  /**
    * Flag to remove paths which are not part of a loop.
    */
  var trimDeadEnds: js.UndefOr[scala.Boolean] = js.undefined
}

