package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSymbolInstance extends js.Object {
  var accName: String = js.native
  var actionScript: String = js.native
  var backgroundColor: String = js.native
  var bitmapRenderMode: String = js.native
  var blendMode: String = js.native
  var buttonTracking: String = js.native
  var cacheAsBitmap: Boolean = js.native
  var colorAlphaAmount: Double = js.native
  var colorAlphaPercent: Double = js.native
  var colorBlueAmount: Double = js.native
  var colorBluePercent: Double = js.native
  var colorGreenAmount: Double = js.native
  var colorGreenPercent: Double = js.native
  var colorMode: String = js.native
  var colorRedAmount: Double = js.native
  var colorRedPercent: Double = js.native
  var description: String = js.native
  var filters: js.Array[FlashFilter] = js.native
  var firstFrame: Double = js.native
  var forceSimple: Boolean = js.native
  var loop: String = js.native
  var shortcut: String = js.native
  var silent: Boolean = js.native
  var symbolType: String = js.native
  var tabIndex: Double = js.native
  var useBackgroundColor: Boolean = js.native
  var visible: Boolean = js.native
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
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolInstance]
  }
  @scala.inline
  implicit class FlashSymbolInstanceOps[Self <: FlashSymbolInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccName(value: String): Self = this.set("accName", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionScript(value: String): Self = this.set("actionScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitmapRenderMode(value: String): Self = this.set("bitmapRenderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendMode(value: String): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTracking(value: String): Self = this.set("buttonTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheAsBitmap(value: Boolean): Self = this.set("cacheAsBitmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorAlphaAmount(value: Double): Self = this.set("colorAlphaAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorAlphaPercent(value: Double): Self = this.set("colorAlphaPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorBlueAmount(value: Double): Self = this.set("colorBlueAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorBluePercent(value: Double): Self = this.set("colorBluePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorGreenAmount(value: Double): Self = this.set("colorGreenAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorGreenPercent(value: Double): Self = this.set("colorGreenPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMode(value: String): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorRedAmount(value: Double): Self = this.set("colorRedAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorRedPercent(value: Double): Self = this.set("colorRedPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: FlashFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[FlashFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstFrame(value: Double): Self = this.set("firstFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceSimple(value: Boolean): Self = this.set("forceSimple", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: String): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseBackgroundColor(value: Boolean): Self = this.set("useBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

