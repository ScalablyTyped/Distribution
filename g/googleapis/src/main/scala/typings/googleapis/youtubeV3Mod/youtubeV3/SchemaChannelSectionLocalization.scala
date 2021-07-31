package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ChannelSection localization setting
  */
trait SchemaChannelSectionLocalization extends StObject {
  
  /**
    * The localized strings for channel section&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaChannelSectionLocalization {
  
  @scala.inline
  def apply(): SchemaChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionLocalization]
  }
  
  @scala.inline
  implicit class SchemaChannelSectionLocalizationMutableBuilder[Self <: SchemaChannelSectionLocalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
