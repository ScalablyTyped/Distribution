package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A guideCategory resource identifies a category that YouTube algorithmically
  * assigns based on a channel&#39;s content or other indicators, such as the
  * channel&#39;s popularity. The list is similar to video categories, with the
  * difference being that a video&#39;s uploader can assign a video category
  * but only YouTube can assign a channel category.
  */
trait SchemaGuideCategory extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#guideCategory&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The snippet object contains basic details about the category, such as its
    * title.
    */
  var snippet: js.UndefOr[SchemaGuideCategorySnippet] = js.undefined
}
object SchemaGuideCategory {
  
  inline def apply(): SchemaGuideCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuideCategory]
  }
  
  extension [Self <: SchemaGuideCategory](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSnippet(value: SchemaGuideCategorySnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
