package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var default: js.UndefOr[Boolean | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var label: js.UndefOr[String | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
  
  var srcLang: js.UndefOr[String | Null] = js.undefined
}
object TrackHTMLAttributes {
  
  inline def apply[T](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  extension [Self <: TrackHTMLAttributes[?], T](x: Self & TrackHTMLAttributes[T]) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    inline def setSrcLangNull: Self = StObject.set(x, "srcLang", null)
    
    inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
