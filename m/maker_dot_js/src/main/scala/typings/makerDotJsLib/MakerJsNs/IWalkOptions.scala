package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.walk().
  */
trait IWalkOptions extends js.Object {
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.undefined
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.undefined
  var onPath: js.UndefOr[IWalkPathCallback] = js.undefined
}

