package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolInstance extends js.Object {
  var accName: String
  var actionScript: String
  var backgroundColor: String
  var bitmapRenderMode: String
  var blendMode: String
  var buttonTracking: String
  var cacheAsBitmap: Boolean
  var colorAlphaAmount: Double
  var colorAlphaPercent: Double
  var colorBlueAmount: Double
  var colorBluePercent: Double
  var colorGreenAmount: Double
  var colorGreenPercent: Double
  var colorMode: String
  var colorRedAmount: Double
  var colorRedPercent: Double
  var description: String
  var filters: js.Array[FlashFilter]
  var firstFrame: Double
  var forceSimple: Boolean
  var loop: String
  var shortcut: String
  var silent: Boolean
  var symbolType: String
  var tabIndex: Double
  var useBackgroundColor: Boolean
  var visible: Boolean
}

object FlashSymbolInstance {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    backgroundColor: String,
    bitmapRenderMode: String,
    blendMode: String,
    buttonTracking: String,
    cacheAsBitmap: Boolean,
    colorAlphaAmount: Double,
    colorAlphaPercent: Double,
    colorBlueAmount: Double,
    colorBluePercent: Double,
    colorGreenAmount: Double,
    colorGreenPercent: Double,
    colorMode: String,
    colorRedAmount: Double,
    colorRedPercent: Double,
    description: String,
    filters: js.Array[FlashFilter],
    firstFrame: Double,
    forceSimple: Boolean,
    loop: String,
    shortcut: String,
    silent: Boolean,
    symbolType: String,
    tabIndex: Double,
    useBackgroundColor: Boolean,
    visible: Boolean
  ): FlashSymbolInstance = {
    val __obj = js.Dynamic.literal(accName = accName, actionScript = actionScript, backgroundColor = backgroundColor, bitmapRenderMode = bitmapRenderMode, blendMode = blendMode, buttonTracking = buttonTracking, cacheAsBitmap = cacheAsBitmap, colorAlphaAmount = colorAlphaAmount, colorAlphaPercent = colorAlphaPercent, colorBlueAmount = colorBlueAmount, colorBluePercent = colorBluePercent, colorGreenAmount = colorGreenAmount, colorGreenPercent = colorGreenPercent, colorMode = colorMode, colorRedAmount = colorRedAmount, colorRedPercent = colorRedPercent, description = description, filters = filters, firstFrame = firstFrame, forceSimple = forceSimple, loop = loop, shortcut = shortcut, silent = silent, symbolType = symbolType, tabIndex = tabIndex, useBackgroundColor = useBackgroundColor, visible = visible)
  
    __obj.asInstanceOf[FlashSymbolInstance]
  }
}

