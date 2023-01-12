package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightActivitiesGenerateTagResponse extends StObject {
  
  /** Generated tag for this Floodlight activity. For global site tags, this is the event snippet. */
  var floodlightActivityTag: js.UndefOr[String] = js.undefined
  
  /**
    * The global snippet section of a global site tag. The global site tag sets new cookies on your domain, which will store a unique identifier for a user or the ad click that brought
    * the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesGenerateTagResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object FloodlightActivitiesGenerateTagResponse {
  
  inline def apply(): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
    
    inline def setFloodlightActivityTag(value: String): Self = StObject.set(x, "floodlightActivityTag", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityTagUndefined: Self = StObject.set(x, "floodlightActivityTag", js.undefined)
    
    inline def setGlobalSiteTagGlobalSnippet(value: String): Self = StObject.set(x, "globalSiteTagGlobalSnippet", value.asInstanceOf[js.Any])
    
    inline def setGlobalSiteTagGlobalSnippetUndefined: Self = StObject.set(x, "globalSiteTagGlobalSnippet", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
