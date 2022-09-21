package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaI18nRegion extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the i18n region.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#i18nRegion".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snippet object contains basic details about the i18n region, such as region code and human-readable name.
    */
  var snippet: js.UndefOr[SchemaI18nRegionSnippet] = js.undefined
}
object SchemaI18nRegion {
  
  inline def apply(): SchemaI18nRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegion]
  }
  
  extension [Self <: SchemaI18nRegion](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaI18nRegionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
