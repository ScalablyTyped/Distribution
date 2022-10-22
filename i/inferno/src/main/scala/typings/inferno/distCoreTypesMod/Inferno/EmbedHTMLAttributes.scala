package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbedHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
  
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object EmbedHTMLAttributes {
  
  inline def apply[T](): EmbedHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbedHTMLAttributes[T]]
  }
  
  extension [Self <: EmbedHTMLAttributes[?], T](x: Self & EmbedHTMLAttributes[T]) {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
