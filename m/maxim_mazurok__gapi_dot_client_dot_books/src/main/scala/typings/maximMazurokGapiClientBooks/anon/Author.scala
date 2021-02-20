package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Author extends StObject {
  
  var author: js.UndefOr[String] = js.native
  
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  
  var coverUrl: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var volumeId: js.UndefOr[String] = js.native
}
object Author {
  
  @scala.inline
  def apply(): Author = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCanonicalVolumeLink(value: String): Self = StObject.set(x, "canonicalVolumeLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalVolumeLinkUndefined: Self = StObject.set(x, "canonicalVolumeLink", js.undefined)
    
    @scala.inline
    def setCoverUrl(value: String): Self = StObject.set(x, "coverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverUrlUndefined: Self = StObject.set(x, "coverUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
