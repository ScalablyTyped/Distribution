package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebPropertySummary extends StObject {
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics WebPropertySummary.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web property name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of profiles under this web property.
    */
  var profiles: js.UndefOr[js.Array[SchemaProfileSummary]] = js.undefined
  
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebPropertySummary {
  
  inline def apply(): SchemaWebPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebPropertySummary]
  }
  
  extension [Self <: SchemaWebPropertySummary](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfiles(value: js.Array[SchemaProfileSummary]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: SchemaProfileSummary*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredNull: Self = StObject.set(x, "starred", null)
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
