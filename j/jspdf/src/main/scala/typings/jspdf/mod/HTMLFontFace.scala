package typings.jspdf.mod

import typings.jspdf.anon.Format
import typings.jspdf.jspdfInts.`100`
import typings.jspdf.jspdfInts.`200`
import typings.jspdf.jspdfInts.`300`
import typings.jspdf.jspdfInts.`400`
import typings.jspdf.jspdfInts.`500`
import typings.jspdf.jspdfInts.`600`
import typings.jspdf.jspdfInts.`700`
import typings.jspdf.jspdfInts.`800`
import typings.jspdf.jspdfInts.`900`
import typings.jspdf.jspdfStrings.`extra-condensed`
import typings.jspdf.jspdfStrings.`extra-expanded`
import typings.jspdf.jspdfStrings.`semi-condensed`
import typings.jspdf.jspdfStrings.`semi-expanded`
import typings.jspdf.jspdfStrings.`ultra-condensed`
import typings.jspdf.jspdfStrings.`ultra-expanded`
import typings.jspdf.jspdfStrings.bold
import typings.jspdf.jspdfStrings.condensed
import typings.jspdf.jspdfStrings.expanded
import typings.jspdf.jspdfStrings.italic
import typings.jspdf.jspdfStrings.normal
import typings.jspdf.jspdfStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLFontFace extends StObject {
  
  var family: String
  
  var src: js.Array[Format]
  
  var stretch: js.UndefOr[
    `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | normal | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
  ] = js.undefined
  
  var style: js.UndefOr[italic | oblique | normal] = js.undefined
  
  var weight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | typings.jspdf.jspdfStrings.`100` | typings.jspdf.jspdfStrings.`200` | typings.jspdf.jspdfStrings.`300` | typings.jspdf.jspdfStrings.`400` | typings.jspdf.jspdfStrings.`500` | typings.jspdf.jspdfStrings.`600` | typings.jspdf.jspdfStrings.`700` | typings.jspdf.jspdfStrings.`800` | typings.jspdf.jspdfStrings.`900`
  ] = js.undefined
}
object HTMLFontFace {
  
  inline def apply(family: String, src: js.Array[Format]): HTMLFontFace = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLFontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLFontFace] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: js.Array[Format]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcVarargs(value: Format*): Self = StObject.set(x, "src", js.Array(value*))
    
    inline def setStretch(
      value: `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | normal | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded`
    ): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setStyle(value: italic | oblique | normal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(
      value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | typings.jspdf.jspdfStrings.`100` | typings.jspdf.jspdfStrings.`200` | typings.jspdf.jspdfStrings.`300` | typings.jspdf.jspdfStrings.`400` | typings.jspdf.jspdfStrings.`500` | typings.jspdf.jspdfStrings.`600` | typings.jspdf.jspdfStrings.`700` | typings.jspdf.jspdfStrings.`800` | typings.jspdf.jspdfStrings.`900`
    ): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
