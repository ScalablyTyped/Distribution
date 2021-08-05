package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Channel localization setting
  */
trait SchemaChannelLocalization extends StObject {
  
  /**
    * The localized strings for channel&#39;s description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The localized strings for channel&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaChannelLocalization {
  
  inline def apply(): SchemaChannelLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelLocalization]
  }
  
  extension [Self <: SchemaChannelLocalization](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
