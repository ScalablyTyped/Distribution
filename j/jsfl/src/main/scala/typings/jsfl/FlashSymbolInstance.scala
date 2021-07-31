package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSymbolInstance extends StObject {
  
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
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolInstance]
  }
  
  @scala.inline
  implicit class FlashSymbolInstanceMutableBuilder[Self <: FlashSymbolInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccName(value: String): Self = StObject.set(x, "accName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionScript(value: String): Self = StObject.set(x, "actionScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmapRenderMode(value: String): Self = StObject.set(x, "bitmapRenderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTracking(value: String): Self = StObject.set(x, "buttonTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheAsBitmap(value: Boolean): Self = StObject.set(x, "cacheAsBitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAlphaAmount(value: Double): Self = StObject.set(x, "colorAlphaAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAlphaPercent(value: Double): Self = StObject.set(x, "colorAlphaPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBlueAmount(value: Double): Self = StObject.set(x, "colorBlueAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBluePercent(value: Double): Self = StObject.set(x, "colorBluePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGreenAmount(value: Double): Self = StObject.set(x, "colorGreenAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorGreenPercent(value: Double): Self = StObject.set(x, "colorGreenPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRedAmount(value: Double): Self = StObject.set(x, "colorRedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRedPercent(value: Double): Self = StObject.set(x, "colorRedPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: js.Array[FlashFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: FlashFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setFirstFrame(value: Double): Self = StObject.set(x, "firstFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSimple(value: Boolean): Self = StObject.set(x, "forceSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBackgroundColor(value: Boolean): Self = StObject.set(x, "useBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
