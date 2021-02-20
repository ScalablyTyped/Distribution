package typings.jointjs.anon

import typings.std.RegExp
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipsis extends StObject {
  
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  
  var eol: js.UndefOr[String] = js.native
  
  var hyphen: js.UndefOr[String | RegExp] = js.native
  
  var maxLineCount: js.UndefOr[Double] = js.native
  
  var separator: js.UndefOr[String | js.Any] = js.native
  
  var svgDocument: js.UndefOr[SVGElement] = js.native
}
object Ellipsis {
  
  @scala.inline
  def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ellipsis]
  }
  
  @scala.inline
  implicit class EllipsisMutableBuilder[Self <: Ellipsis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    @scala.inline
    def setHyphen(value: String | RegExp): Self = StObject.set(x, "hyphen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphenUndefined: Self = StObject.set(x, "hyphen", js.undefined)
    
    @scala.inline
    def setMaxLineCount(value: Double): Self = StObject.set(x, "maxLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLineCountUndefined: Self = StObject.set(x, "maxLineCount", js.undefined)
    
    @scala.inline
    def setSeparator(value: String | js.Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setSvgDocument(value: SVGElement): Self = StObject.set(x, "svgDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgDocumentUndefined: Self = StObject.set(x, "svgDocument", js.undefined)
  }
}
