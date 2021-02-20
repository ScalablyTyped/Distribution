package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Activity GenerateTag Response
  */
@js.native
trait SchemaFloodlightActivitiesGenerateTagResponse extends StObject {
  
  /**
    * Generated tag for this Floodlight activity. For global site tags, this is
    * the event snippet.
    */
  var floodlightActivityTag: js.UndefOr[String] = js.native
  
  /**
    * The global snippet section of a global site tag. The global site tag sets
    * new cookies on your domain, which will store a unique identifier for a
    * user or the ad click that brought the user to your site. Learn more.
    */
  var globalSiteTagGlobalSnippet: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesGenerateTagResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaFloodlightActivitiesGenerateTagResponse {
  
  @scala.inline
  def apply(): SchemaFloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesGenerateTagResponse]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivitiesGenerateTagResponseMutableBuilder[Self <: SchemaFloodlightActivitiesGenerateTagResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityTag(value: String): Self = StObject.set(x, "floodlightActivityTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityTagUndefined: Self = StObject.set(x, "floodlightActivityTag", js.undefined)
    
    @scala.inline
    def setGlobalSiteTagGlobalSnippet(value: String): Self = StObject.set(x, "globalSiteTagGlobalSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSiteTagGlobalSnippetUndefined: Self = StObject.set(x, "globalSiteTagGlobalSnippet", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
