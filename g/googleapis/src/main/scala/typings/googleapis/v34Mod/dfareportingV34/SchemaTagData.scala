package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTagData extends StObject {
  
  /**
    * Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Creative associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaTagData {
  
  inline def apply(): SchemaTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagData]
  }
  
  extension [Self <: SchemaTagData](x: Self) {
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdNull: Self = StObject.set(x, "adId", null)
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setClickTag(value: String): Self = StObject.set(x, "clickTag", value.asInstanceOf[js.Any])
    
    inline def setClickTagNull: Self = StObject.set(x, "clickTag", null)
    
    inline def setClickTagUndefined: Self = StObject.set(x, "clickTag", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImpressionTag(value: String): Self = StObject.set(x, "impressionTag", value.asInstanceOf[js.Any])
    
    inline def setImpressionTagNull: Self = StObject.set(x, "impressionTag", null)
    
    inline def setImpressionTagUndefined: Self = StObject.set(x, "impressionTag", js.undefined)
  }
}
