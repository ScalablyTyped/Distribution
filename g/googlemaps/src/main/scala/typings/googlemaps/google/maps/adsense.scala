package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
object adsense {
  
  @js.native
  sealed trait AdFormat extends StObject
  @JSGlobal("google.maps.adsense.AdFormat")
  @js.native
  object AdFormat extends StObject {
    
    @js.native
    sealed trait BANNER
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait BUTTON
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait HALF_BANNER
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait LARGE_HORIZONTAL_LINK_UNIT
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait LARGE_RECTANGLE
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait LARGE_VERTICAL_LINK_UNIT
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait LEADERBOARD
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait MEDIUM_RECTANGLE
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait MEDIUM_VERTICAL_LINK_UNIT
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SKYSCRAPER
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SMALL_HORIZONTAL_LINK_UNIT
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SMALL_RECTANGLE
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SMALL_SQUARE
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SMALL_VERTICAL_LINK_UNIT
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait SQUARE
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait VERTICAL_BANNER
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait WIDE_SKYSCRAPER
      extends StObject
         with AdFormat
    
    @js.native
    sealed trait X_LARGE_VERTICAL_LINK_UNIT
      extends StObject
         with AdFormat
  }
  
  @js.native
  trait AdUnit
    extends StObject
       with MVCObject {
    
    def getBackgroundColor(): String = js.native
    
    def getBorderColor(): String = js.native
    
    def getChannelNumber(): String = js.native
    
    def getContainer(): Element = js.native
    
    def getFormat(): AdFormat = js.native
    
    def getMap(): Map[Element] = js.native
    
    def getPosition(): ControlPosition = js.native
    
    def getPublisherId(): String = js.native
    
    def getTextColor(): String = js.native
    
    def getTitleColor(): String = js.native
    
    def getUrlColor(): String = js.native
    
    def setBackgroundColor(backgroundColor: String): Unit = js.native
    
    def setBorderColor(borderColor: String): Unit = js.native
    
    def setChannelNumber(channelNumber: String): Unit = js.native
    
    def setFormat(format: AdFormat): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map[Element]): Unit = js.native
    
    def setPosition(position: ControlPosition): Unit = js.native
    
    def setTextColor(textColor: String): Unit = js.native
    
    def setTitleColor(titleColor: String): Unit = js.native
    
    def setUrlColor(urlColor: String): Unit = js.native
  }
  
  trait AdUnitOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var channelNumber: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[AdFormat] = js.undefined
    
    var map: js.UndefOr[Map[Element]] = js.undefined
    
    var position: js.UndefOr[ControlPosition] = js.undefined
    
    var publisherId: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var titleColor: js.UndefOr[String] = js.undefined
    
    var urlColor: js.UndefOr[String] = js.undefined
  }
  object AdUnitOptions {
    
    inline def apply(): AdUnitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdUnitOptions]
    }
    
    extension [Self <: AdUnitOptions](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setChannelNumber(value: String): Self = StObject.set(x, "channelNumber", value.asInstanceOf[js.Any])
      
      inline def setChannelNumberUndefined: Self = StObject.set(x, "channelNumber", js.undefined)
      
      inline def setFormat(value: AdFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
      
      inline def setPublisherIdUndefined: Self = StObject.set(x, "publisherId", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setUrlColor(value: String): Self = StObject.set(x, "urlColor", value.asInstanceOf[js.Any])
      
      inline def setUrlColorUndefined: Self = StObject.set(x, "urlColor", js.undefined)
    }
  }
}
