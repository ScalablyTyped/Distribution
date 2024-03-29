package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.baseline
import typings.inferno.infernoStrings.bottom
import typings.inferno.infernoStrings.center
import typings.inferno.infernoStrings.char
import typings.inferno.infernoStrings.justify
import typings.inferno.infernoStrings.left
import typings.inferno.infernoStrings.middle
import typings.inferno.infernoStrings.right
import typings.inferno.infernoStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var abbr: js.UndefOr[String | Null] = js.undefined
  
  var align: js.UndefOr[left | center | right | justify | char | Null] = js.undefined
  
  var colSpan: js.UndefOr[Double | Null] = js.undefined
  
  var headers: js.UndefOr[String | Null] = js.undefined
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var rowSpan: js.UndefOr[Double | Null] = js.undefined
  
  var scope: js.UndefOr[String | Null] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom | baseline | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object TdHTMLAttributes {
  
  inline def apply[T](): TdHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TdHTMLAttributes[?], T] (val x: Self & TdHTMLAttributes[T]) extends AnyVal {
    
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
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanNull: Self = StObject.set(x, "rowSpan", null)
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setValign(value: top | middle | bottom | baseline): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignNull: Self = StObject.set(x, "valign", null)
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
