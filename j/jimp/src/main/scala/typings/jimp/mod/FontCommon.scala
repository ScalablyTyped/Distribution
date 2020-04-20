package typings.jimp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated Jimp typings for TS <3.1 are being depreciated. Please upgrade your TypeScript version
  */
trait FontCommon extends js.Object {
  var alphaChnl: Double
  var base: Double
  var blueChnl: Double
  var greenChnl: Double
  var lineHeight: Double
  var packed: Double
  var pages: Double
  var redChnl: Double
  var scaleH: Double
  var scaleW: Double
}

object FontCommon {
  @scala.inline
  def apply(
    alphaChnl: Double,
    base: Double,
    blueChnl: Double,
    greenChnl: Double,
    lineHeight: Double,
    packed: Double,
    pages: Double,
    redChnl: Double,
    scaleH: Double,
    scaleW: Double
  ): FontCommon = {
    val __obj = js.Dynamic.literal(alphaChnl = alphaChnl.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blueChnl = blueChnl.asInstanceOf[js.Any], greenChnl = greenChnl.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], redChnl = redChnl.asInstanceOf[js.Any], scaleH = scaleH.asInstanceOf[js.Any], scaleW = scaleW.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontCommon]
  }
}

