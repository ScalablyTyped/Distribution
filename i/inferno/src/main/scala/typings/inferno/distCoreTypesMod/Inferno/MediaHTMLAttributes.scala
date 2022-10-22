package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoPlay: js.UndefOr[Boolean | Null] = js.undefined
  
  var controls: js.UndefOr[Boolean | Null] = js.undefined
  
  var controlsList: js.UndefOr[String | Null] = js.undefined
  
  var crossOrigin: js.UndefOr[String | Null] = js.undefined
  
  var loop: js.UndefOr[Boolean | Null] = js.undefined
  
  var mediaGroup: js.UndefOr[String | Null] = js.undefined
  
  var muted: js.UndefOr[Boolean | Null] = js.undefined
  
  var playsInline: js.UndefOr[Boolean | Null] = js.undefined
  
  var preload: js.UndefOr[String | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
}
object MediaHTMLAttributes {
  
  inline def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  extension [Self <: MediaHTMLAttributes[?], T](x: Self & MediaHTMLAttributes[T]) {
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayNull: Self = StObject.set(x, "autoPlay", null)
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
    
    inline def setControlsListNull: Self = StObject.set(x, "controlsList", null)
    
    inline def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
    
    inline def setControlsNull: Self = StObject.set(x, "controls", null)
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopNull: Self = StObject.set(x, "loop", null)
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaGroupNull: Self = StObject.set(x, "mediaGroup", null)
    
    inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedNull: Self = StObject.set(x, "muted", null)
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineNull: Self = StObject.set(x, "playsInline", null)
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadNull: Self = StObject.set(x, "preload", null)
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
