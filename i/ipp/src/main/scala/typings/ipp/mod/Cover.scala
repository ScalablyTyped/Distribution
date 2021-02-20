package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cover extends StObject {
  
  var `cover-type`: js.UndefOr[CoverType] = js.native
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[js.Array[MediaInterface]] = js.native
}
object Cover {
  
  @scala.inline
  def apply(): Cover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cover]
  }
  
  @scala.inline
  implicit class CoverMutableBuilder[Self <: Cover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCover-type`(value: CoverType): Self = StObject.set(x, "cover-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCover-typeUndefined`: Self = StObject.set(x, "cover-type", js.undefined)
    
    @scala.inline
    def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-col`(value: js.Array[MediaInterface]): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    @scala.inline
    def `setMedia-colVarargs`(value: MediaInterface*): Self = StObject.set(x, "media-col", js.Array(value :_*))
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
