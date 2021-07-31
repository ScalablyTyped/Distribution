package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A themeable solid color value.
  */
trait SchemaOpaqueColor extends StObject {
  
  /**
    * An opaque RGB color.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.undefined
  
  /**
    * An opaque theme color.
    */
  var themeColor: js.UndefOr[String] = js.undefined
}
object SchemaOpaqueColor {
  
  @scala.inline
  def apply(): SchemaOpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOpaqueColor]
  }
  
  @scala.inline
  implicit class SchemaOpaqueColorMutableBuilder[Self <: SchemaOpaqueColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: SchemaRgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
