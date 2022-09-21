package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.Background
import typings.googleapis.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdStyle extends StObject {
  
  /**
    * The colors which are included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash.
    */
  var colors: js.UndefOr[Background | Null] = js.undefined
  
  /**
    * The style of the corners in the ad (deprecated: never populated, ignored).
    */
  var corners: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Size | Null] = js.undefined
  
  /**
    * Kind this is, in this case adsense#adStyle.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdStyle {
  
  inline def apply(): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdStyle]
  }
  
  extension [Self <: SchemaAdStyle](x: Self) {
    
    inline def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNull: Self = StObject.set(x, "colors", null)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setCorners(value: String): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setCornersNull: Self = StObject.set(x, "corners", null)
    
    inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    inline def setFont(value: Size): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
