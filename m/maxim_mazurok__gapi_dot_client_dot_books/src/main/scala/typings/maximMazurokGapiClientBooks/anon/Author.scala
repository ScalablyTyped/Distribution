package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var canonicalVolumeLink: js.UndefOr[String] = js.undefined
  
  var coverUrl: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var volumeId: js.UndefOr[String] = js.undefined
}
object Author {
  
  inline def apply(): Author = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Author]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCanonicalVolumeLink(value: String): Self = StObject.set(x, "canonicalVolumeLink", value.asInstanceOf[js.Any])
    
    inline def setCanonicalVolumeLinkUndefined: Self = StObject.set(x, "canonicalVolumeLink", js.undefined)
    
    inline def setCoverUrl(value: String): Self = StObject.set(x, "coverUrl", value.asInstanceOf[js.Any])
    
    inline def setCoverUrlUndefined: Self = StObject.set(x, "coverUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
