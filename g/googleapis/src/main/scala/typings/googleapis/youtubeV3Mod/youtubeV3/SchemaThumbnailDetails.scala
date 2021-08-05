package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
trait SchemaThumbnailDetails extends StObject {
  
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[SchemaThumbnail] = js.undefined
  
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[SchemaThumbnail] = js.undefined
  
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[SchemaThumbnail] = js.undefined
  
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[SchemaThumbnail] = js.undefined
  
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[SchemaThumbnail] = js.undefined
}
object SchemaThumbnailDetails {
  
  inline def apply(): SchemaThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnailDetails]
  }
  
  extension [Self <: SchemaThumbnailDetails](x: Self) {
    
    inline def setDefault(value: SchemaThumbnail): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setHigh(value: SchemaThumbnail): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setMaxres(value: SchemaThumbnail): Self = StObject.set(x, "maxres", value.asInstanceOf[js.Any])
    
    inline def setMaxresUndefined: Self = StObject.set(x, "maxres", js.undefined)
    
    inline def setMedium(value: SchemaThumbnail): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setStandard(value: SchemaThumbnail): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
