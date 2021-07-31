package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A solid color.
  */
trait SchemaColor extends StObject {
  
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.undefined
}
object SchemaColor {
  
  @scala.inline
  def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  
  @scala.inline
  implicit class SchemaColorMutableBuilder[Self <: SchemaColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: SchemaRgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
  }
}
