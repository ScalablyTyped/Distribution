package typings.inboxsdk.inboxsdkMod.Common

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
    bottomBuffer: Int | Double = null,
    buffer: Int | Double = null,
    forceHAlign: js.UndefOr[Boolean] = js.undefined,
    forcePosition: js.UndefOr[Boolean] = js.undefined,
    forceVAlign: js.UndefOr[Boolean] = js.undefined,
    hAlign: String = null,
    leftBuffer: Int | Double = null,
    position: String = null,
    rightBuffer: Int | Double = null,
    topBuffer: Int | Double = null,
    vAlign: String = null
  ): PositionOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomBuffer != null) __obj.updateDynamic("bottomBuffer")(bottomBuffer.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHAlign)) __obj.updateDynamic("forceHAlign")(forceHAlign)
    if (!js.isUndefined(forcePosition)) __obj.updateDynamic("forcePosition")(forcePosition)
    if (!js.isUndefined(forceVAlign)) __obj.updateDynamic("forceVAlign")(forceVAlign)
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign)
    if (leftBuffer != null) __obj.updateDynamic("leftBuffer")(leftBuffer.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (rightBuffer != null) __obj.updateDynamic("rightBuffer")(rightBuffer.asInstanceOf[js.Any])
    if (topBuffer != null) __obj.updateDynamic("topBuffer")(topBuffer.asInstanceOf[js.Any])
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign)
    __obj.asInstanceOf[PositionOptions]
  }
}

