package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
object adsense {
  
  @js.native
  sealed trait AdFormat extends StObject
  @JSGlobal("google.maps.adsense.AdFormat")
  @js.native
  object AdFormat extends StObject {
    
    @js.native
    sealed trait BANNER extends AdFormat
    
    @js.native
    sealed trait BUTTON extends AdFormat
    
    @js.native
    sealed trait HALF_BANNER extends AdFormat
    
    @js.native
    sealed trait LARGE_HORIZONTAL_LINK_UNIT extends AdFormat
    
    @js.native
    sealed trait LARGE_RECTANGLE extends AdFormat
    
    @js.native
    sealed trait LARGE_VERTICAL_LINK_UNIT extends AdFormat
    
    @js.native
    sealed trait LEADERBOARD extends AdFormat
    
    @js.native
    sealed trait MEDIUM_RECTANGLE extends AdFormat
    
    @js.native
    sealed trait MEDIUM_VERTICAL_LINK_UNIT extends AdFormat
    
    @js.native
    sealed trait SKYSCRAPER extends AdFormat
    
    @js.native
    sealed trait SMALL_HORIZONTAL_LINK_UNIT extends AdFormat
    
    @js.native
    sealed trait SMALL_RECTANGLE extends AdFormat
    
    @js.native
    sealed trait SMALL_SQUARE extends AdFormat
    
    @js.native
    sealed trait SMALL_VERTICAL_LINK_UNIT extends AdFormat
    
    @js.native
    sealed trait SQUARE extends AdFormat
    
    @js.native
    sealed trait VERTICAL_BANNER extends AdFormat
    
    @js.native
    sealed trait WIDE_SKYSCRAPER extends AdFormat
    
    @js.native
    sealed trait X_LARGE_VERTICAL_LINK_UNIT extends AdFormat
  }
  
  @js.native
  trait AdUnit extends MVCObject {
    
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
  
  @js.native
  trait AdUnitOptions extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var borderColor: js.UndefOr[String] = js.native
    
    var channelNumber: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[AdFormat] = js.native
    
    var map: js.UndefOr[Map[Element]] = js.native
    
    var position: js.UndefOr[ControlPosition] = js.native
    
    var publisherId: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var titleColor: js.UndefOr[String] = js.native
    
    var urlColor: js.UndefOr[String] = js.native
  }
  object AdUnitOptions {
    
    @scala.inline
    def apply(): AdUnitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdUnitOptions]
    }
    
    @scala.inline
    implicit class AdUnitOptionsMutableBuilder[Self <: AdUnitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setChannelNumber(value: String): Self = StObject.set(x, "channelNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNumberUndefined: Self = StObject.set(x, "channelNumber", js.undefined)
      
      @scala.inline
      def setFormat(value: AdFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherIdUndefined: Self = StObject.set(x, "publisherId", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setUrlColor(value: String): Self = StObject.set(x, "urlColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlColorUndefined: Self = StObject.set(x, "urlColor", js.undefined)
    }
  }
}
