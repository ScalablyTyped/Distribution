package typings.jointjs.anon

import typings.std.RegExp
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ellipsis extends StObject {
  
  var ellipsis: js.UndefOr[Boolean | String] = js.undefined
  
  var eol: js.UndefOr[String] = js.undefined
  
  var hyphen: js.UndefOr[String | RegExp] = js.undefined
  
  var maxLineCount: js.UndefOr[Double] = js.undefined
  
  var separator: js.UndefOr[String | js.Any] = js.undefined
  
  var svgDocument: js.UndefOr[SVGElement] = js.undefined
}
object Ellipsis {
  
  inline def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ellipsis]
  }
  
  extension [Self <: Ellipsis](x: Self) {
    
    inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    inline def setHyphen(value: String | RegExp): Self = StObject.set(x, "hyphen", value.asInstanceOf[js.Any])
    
    inline def setHyphenUndefined: Self = StObject.set(x, "hyphen", js.undefined)
    
    inline def setMaxLineCount(value: Double): Self = StObject.set(x, "maxLineCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLineCountUndefined: Self = StObject.set(x, "maxLineCount", js.undefined)
    
    inline def setSeparator(value: String | js.Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSvgDocument(value: SVGElement): Self = StObject.set(x, "svgDocument", value.asInstanceOf[js.Any])
    
    inline def setSvgDocumentUndefined: Self = StObject.set(x, "svgDocument", js.undefined)
  }
}
