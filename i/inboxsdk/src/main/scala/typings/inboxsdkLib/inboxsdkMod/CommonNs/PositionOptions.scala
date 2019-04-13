package typings
package inboxsdkLib.inboxsdkMod.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionOptions extends js.Object {
  var bottomBuffer: js.UndefOr[scala.Double] = js.undefined
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var forceHAlign: js.UndefOr[scala.Boolean] = js.undefined
  var forcePosition: js.UndefOr[scala.Boolean] = js.undefined
  var forceVAlign: js.UndefOr[scala.Boolean] = js.undefined
  var hAlign: js.UndefOr[java.lang.String] = js.undefined
  var leftBuffer: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var rightBuffer: js.UndefOr[scala.Double] = js.undefined
  var topBuffer: js.UndefOr[scala.Double] = js.undefined
  var vAlign: js.UndefOr[java.lang.String] = js.undefined
}

object PositionOptions {
  @scala.inline
  def apply(
    bottomBuffer: scala.Int | scala.Double = null,
    buffer: scala.Int | scala.Double = null,
    forceHAlign: js.UndefOr[scala.Boolean] = js.undefined,
    forcePosition: js.UndefOr[scala.Boolean] = js.undefined,
    forceVAlign: js.UndefOr[scala.Boolean] = js.undefined,
    hAlign: java.lang.String = null,
    leftBuffer: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    rightBuffer: scala.Int | scala.Double = null,
    topBuffer: scala.Int | scala.Double = null,
    vAlign: java.lang.String = null
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

