package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.center
import typings.inferno.infernoStrings.char
import typings.inferno.infernoStrings.justify
import typings.inferno.infernoStrings.left
import typings.inferno.infernoStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var abbr: js.UndefOr[String | Null] = js.undefined
  
  var align: js.UndefOr[left | center | right | justify | char | Null] = js.undefined
  
  var colSpan: js.UndefOr[Double | Null] = js.undefined
  
  var headers: js.UndefOr[String | Null] = js.undefined
  
  var rowSpan: js.UndefOr[Double | Null] = js.undefined
  
  var scope: js.UndefOr[String | Null] = js.undefined
}
object ThHTMLAttributes {
  
  inline def apply[T](): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
  
  extension [Self <: ThHTMLAttributes[?], T](x: Self & ThHTMLAttributes[T]) {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setAbbrNull: Self = StObject.set(x, "abbr", null)
    
    inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
    inline def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignNull: Self = StObject.set(x, "align", null)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanNull: Self = StObject.set(x, "colSpan", null)
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanNull: Self = StObject.set(x, "rowSpan", null)
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
