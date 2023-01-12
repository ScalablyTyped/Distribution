package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cover extends StObject {
  
  var `cover-type`: js.UndefOr[CoverType] = js.undefined
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[js.Array[MediaInterface]] = js.undefined
}
object Cover {
  
  inline def apply(): Cover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cover] (val x: Self) extends AnyVal {
    
    inline def `setCover-type`(value: CoverType): Self = StObject.set(x, "cover-type", value.asInstanceOf[js.Any])
    
    inline def `setCover-typeUndefined`: Self = StObject.set(x, "cover-type", js.undefined)
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: js.Array[MediaInterface]): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def `setMedia-colVarargs`(value: MediaInterface*): Self = StObject.set(x, "media-col", js.Array(value*))
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
