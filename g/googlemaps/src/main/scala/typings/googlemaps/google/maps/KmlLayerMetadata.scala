package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLayerMetadata extends StObject {
  
  var author: KmlAuthor = js.native
  
  var description: String = js.native
  
  var hasScreenOverlays: Boolean = js.native
  
  var name: String = js.native
  
  var snippet: String = js.native
}
object KmlLayerMetadata {
  
  @scala.inline
  def apply(author: KmlAuthor, description: String, hasScreenOverlays: Boolean, name: String, snippet: String): KmlLayerMetadata = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasScreenOverlays = hasScreenOverlays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlLayerMetadata]
  }
  
  @scala.inline
  implicit class KmlLayerMetadataMutableBuilder[Self <: KmlLayerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: KmlAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasScreenOverlays(value: Boolean): Self = StObject.set(x, "hasScreenOverlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
