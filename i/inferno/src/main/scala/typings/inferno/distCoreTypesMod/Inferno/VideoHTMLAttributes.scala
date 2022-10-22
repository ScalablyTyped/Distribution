package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoHTMLAttributes[T]
  extends StObject
     with MediaHTMLAttributes[T] {
  
  var disablePictureInPicture: js.UndefOr[Boolean | Null] = js.undefined
  
  var disableRemotePlayback: js.UndefOr[Boolean | Null] = js.undefined
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var poster: js.UndefOr[String | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object VideoHTMLAttributes {
  
  inline def apply[T](): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
  
  extension [Self <: VideoHTMLAttributes[?], T](x: Self & VideoHTMLAttributes[T]) {
    
    inline def setDisablePictureInPicture(value: Boolean): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
    
    inline def setDisablePictureInPictureNull: Self = StObject.set(x, "disablePictureInPicture", null)
    
    inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
    
    inline def setDisableRemotePlayback(value: Boolean): Self = StObject.set(x, "disableRemotePlayback", value.asInstanceOf[js.Any])
    
    inline def setDisableRemotePlaybackNull: Self = StObject.set(x, "disableRemotePlayback", null)
    
    inline def setDisableRemotePlaybackUndefined: Self = StObject.set(x, "disableRemotePlayback", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterNull: Self = StObject.set(x, "poster", null)
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
