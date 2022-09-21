package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSectionLocalization extends StObject {
  
  /**
    * The localized strings for channel section's title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelSectionLocalization {
  
  inline def apply(): SchemaChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionLocalization]
  }
  
  extension [Self <: SchemaChannelSectionLocalization](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
