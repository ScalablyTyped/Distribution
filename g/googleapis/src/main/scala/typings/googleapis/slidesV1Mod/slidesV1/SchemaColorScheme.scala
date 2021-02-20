package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The palette of predefined colors for a page.
  */
@js.native
trait SchemaColorScheme extends StObject {
  
  /**
    * The ThemeColorType and corresponding concrete color pairs.
    */
  var colors: js.UndefOr[js.Array[SchemaThemeColorPair]] = js.native
}
object SchemaColorScheme {
  
  @scala.inline
  def apply(): SchemaColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColorScheme]
  }
  
  @scala.inline
  implicit class SchemaColorSchemeMutableBuilder[Self <: SchemaColorScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[SchemaThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: SchemaThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
