package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.Background
import typings.googleapis.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdStyle extends StObject {
  
  /**
    * The colors which are included in the style. These are represented as six
    * hexadecimal characters, similar to HTML color codes, but without the
    * leading hash.
    */
  var colors: js.UndefOr[Background] = js.undefined
  
  /**
    * The style of the corners in the ad (deprecated: never populated,
    * ignored).
    */
  var corners: js.UndefOr[String] = js.undefined
  
  /**
    * The font which is included in the style.
    */
  var font: js.UndefOr[Size] = js.undefined
  
  /**
    * Kind this is, in this case adsense#adStyle.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAdStyle {
  
  @scala.inline
  def apply(): SchemaAdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdStyle]
  }
  
  @scala.inline
  implicit class SchemaAdStyleMutableBuilder[Self <: SchemaAdStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setCorners(value: String): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    @scala.inline
    def setFont(value: Size): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
