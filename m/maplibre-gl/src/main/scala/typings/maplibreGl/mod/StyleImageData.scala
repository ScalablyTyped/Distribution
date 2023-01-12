package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleImageData extends StObject {
  
  var data: RGBAImage
  
  var hasRenderCallback: js.UndefOr[Boolean] = js.undefined
  
  var userImage: js.UndefOr[StyleImageInterface] = js.undefined
  
  var version: Double
}
object StyleImageData {
  
  inline def apply(data: RGBAImage, version: Double): StyleImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImageData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleImageData] (val x: Self) extends AnyVal {
    
    inline def setData(value: RGBAImage): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHasRenderCallback(value: Boolean): Self = StObject.set(x, "hasRenderCallback", value.asInstanceOf[js.Any])
    
    inline def setHasRenderCallbackUndefined: Self = StObject.set(x, "hasRenderCallback", js.undefined)
    
    inline def setUserImage(value: StyleImageInterface): Self = StObject.set(x, "userImage", value.asInstanceOf[js.Any])
    
    inline def setUserImageUndefined: Self = StObject.set(x, "userImage", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
