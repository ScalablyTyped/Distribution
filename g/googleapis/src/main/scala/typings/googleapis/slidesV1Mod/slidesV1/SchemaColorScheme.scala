package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The palette of predefined colors for a page.
  */
trait SchemaColorScheme extends StObject {
  
  /**
    * The ThemeColorType and corresponding concrete color pairs.
    */
  var colors: js.UndefOr[js.Array[SchemaThemeColorPair]] = js.undefined
}
object SchemaColorScheme {
  
  inline def apply(): SchemaColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorScheme]
  }
  
  extension [Self <: SchemaColorScheme](x: Self) {
    
    inline def setColors(value: js.Array[SchemaThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: SchemaThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
