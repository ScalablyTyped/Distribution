package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
@js.native
trait SchemaThumbnailDetails extends StObject {
  
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[SchemaThumbnail] = js.native
  
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[SchemaThumbnail] = js.native
}
object SchemaThumbnailDetails {
  
  @scala.inline
  def apply(): SchemaThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThumbnailDetails]
  }
  
  @scala.inline
  implicit class SchemaThumbnailDetailsMutableBuilder[Self <: SchemaThumbnailDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: SchemaThumbnail): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setHigh(value: SchemaThumbnail): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setMaxres(value: SchemaThumbnail): Self = StObject.set(x, "maxres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxresUndefined: Self = StObject.set(x, "maxres", js.undefined)
    
    @scala.inline
    def setMedium(value: SchemaThumbnail): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setStandard(value: SchemaThumbnail): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
