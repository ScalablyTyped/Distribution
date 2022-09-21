package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloodlightActivitiesGenerateTagResponse extends StObject {
  
  /**
    * Generated tag for this Floodlight activity. For global site tags, this is the event snippet.
    */
  var floodlightActivityTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The global snippet section of a global site tag. The global site tag sets new cookies on your domain, which will store a unique identifier for a user or the ad click that brought the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesGenerateTagResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaFloodlightActivitiesGenerateTagResponse {
  
  inline def apply(): SchemaFloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesGenerateTagResponse]
  }
  
  extension [Self <: SchemaFloodlightActivitiesGenerateTagResponse](x: Self) {
    
    inline def setFloodlightActivityTag(value: String): Self = StObject.set(x, "floodlightActivityTag", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityTagNull: Self = StObject.set(x, "floodlightActivityTag", null)
    
    inline def setFloodlightActivityTagUndefined: Self = StObject.set(x, "floodlightActivityTag", js.undefined)
    
    inline def setGlobalSiteTagGlobalSnippet(value: String): Self = StObject.set(x, "globalSiteTagGlobalSnippet", value.asInstanceOf[js.Any])
    
    inline def setGlobalSiteTagGlobalSnippetNull: Self = StObject.set(x, "globalSiteTagGlobalSnippet", null)
    
    inline def setGlobalSiteTagGlobalSnippetUndefined: Self = StObject.set(x, "globalSiteTagGlobalSnippet", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
