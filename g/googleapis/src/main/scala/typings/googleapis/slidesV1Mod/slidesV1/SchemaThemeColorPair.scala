package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair mapping a theme color type to the concrete color it represents.
  */
@js.native
trait SchemaThemeColorPair extends StObject {
  
  /**
    * The concrete color corresponding to the theme color type above.
    */
  var color: js.UndefOr[SchemaRgbColor] = js.native
  
  /**
    * The type of the theme color.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaThemeColorPair {
  
  @scala.inline
  def apply(): SchemaThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThemeColorPair]
  }
  
  @scala.inline
  implicit class SchemaThemeColorPairMutableBuilder[Self <: SchemaThemeColorPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaRgbColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
