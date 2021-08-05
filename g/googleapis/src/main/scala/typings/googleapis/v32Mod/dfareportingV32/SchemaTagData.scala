package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Tag Data
  */
trait SchemaTagData extends StObject {
  
  /**
    * Ad associated with this placement tag. Applicable only when format is
    * PLACEMENT_TAG_TRACKING.
    */
  var adId: js.UndefOr[String] = js.undefined
  
  /**
    * Tag string to record a click.
    */
  var clickTag: js.UndefOr[String] = js.undefined
  
  /**
    * Creative associated with this placement tag. Applicable only when format
    * is PLACEMENT_TAG_TRACKING.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * TagData tag format of this tag.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Tag string for serving an ad.
    */
  var impressionTag: js.UndefOr[String] = js.undefined
}
object SchemaTagData {
  
  inline def apply(): SchemaTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagData]
  }
  
  extension [Self <: SchemaTagData](x: Self) {
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setClickTag(value: String): Self = StObject.set(x, "clickTag", value.asInstanceOf[js.Any])
    
    inline def setClickTagUndefined: Self = StObject.set(x, "clickTag", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImpressionTag(value: String): Self = StObject.set(x, "impressionTag", value.asInstanceOf[js.Any])
    
    inline def setImpressionTagUndefined: Self = StObject.set(x, "impressionTag", js.undefined)
  }
}
