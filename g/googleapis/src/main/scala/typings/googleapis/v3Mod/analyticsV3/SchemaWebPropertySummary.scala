package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics WebPropertySummary. WebPropertySummary
  * returns basic information (i.e., summary) for a web property.
  */
trait SchemaWebPropertySummary extends StObject {
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics WebPropertySummary.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String] = js.undefined
  
  /**
    * Web property name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * List of profiles under this web property.
    */
  var profiles: js.UndefOr[js.Array[SchemaProfileSummary]] = js.undefined
  
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object SchemaWebPropertySummary {
  
  @scala.inline
  def apply(): SchemaWebPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebPropertySummary]
  }
  
  @scala.inline
  implicit class SchemaWebPropertySummaryMutableBuilder[Self <: SchemaWebPropertySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProfiles(value: js.Array[SchemaProfileSummary]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: SchemaProfileSummary*): Self = StObject.set(x, "profiles", js.Array(value :_*))
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
