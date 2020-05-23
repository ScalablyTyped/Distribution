package typings.inboxsdk.mod.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionOptions extends js.Object {
  var bottomBuffer: js.UndefOr[Double] = js.undefined
  var buffer: js.UndefOr[Double] = js.undefined
  var forceHAlign: js.UndefOr[Boolean] = js.undefined
  var forcePosition: js.UndefOr[Boolean] = js.undefined
  var forceVAlign: js.UndefOr[Boolean] = js.undefined
  var hAlign: js.UndefOr[String] = js.undefined
  var leftBuffer: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var rightBuffer: js.UndefOr[Double] = js.undefined
  var topBuffer: js.UndefOr[Double] = js.undefined
  var vAlign: js.UndefOr[String] = js.undefined
}

object PositionOptions {
  @scala.inline
  def apply(
    bottomBuffer: js.UndefOr[Double] = js.undefined,
    buffer: js.UndefOr[Double] = js.undefined,
    forceHAlign: js.UndefOr[Boolean] = js.undefined,
    forcePosition: js.UndefOr[Boolean] = js.undefined,
    forceVAlign: js.UndefOr[Boolean] = js.undefined,
    hAlign: String = null,
    leftBuffer: js.UndefOr[Double] = js.undefined,
    position: String = null,
    rightBuffer: js.UndefOr[Double] = js.undefined,
    topBuffer: js.UndefOr[Double] = js.undefined,
    vAlign: String = null
  ): PositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottomBuffer)) __obj.updateDynamic("bottomBuffer")(bottomBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHAlign)) __obj.updateDynamic("forceHAlign")(forceHAlign.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePosition)) __obj.updateDynamic("forcePosition")(forcePosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceVAlign)) __obj.updateDynamic("forceVAlign")(forceVAlign.get.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(leftBuffer)) __obj.updateDynamic("leftBuffer")(leftBuffer.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rightBuffer)) __obj.updateDynamic("rightBuffer")(rightBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topBuffer)) __obj.updateDynamic("topBuffer")(topBuffer.get.asInstanceOf[js.Any])
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
}

