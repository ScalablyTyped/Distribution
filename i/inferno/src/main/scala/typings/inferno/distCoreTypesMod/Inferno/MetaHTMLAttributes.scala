package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var charSet: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var httpEquiv: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object MetaHTMLAttributes {
  
  inline def apply[T](): MetaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
  
  extension [Self <: MetaHTMLAttributes[?], T](x: Self & MetaHTMLAttributes[T]) {
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
