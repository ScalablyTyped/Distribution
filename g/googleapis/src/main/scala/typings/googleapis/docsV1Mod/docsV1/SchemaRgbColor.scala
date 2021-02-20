package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An RGB color.
  */
@js.native
trait SchemaRgbColor extends StObject {
  
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double] = js.native
  
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double] = js.native
  
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double] = js.native
}
object SchemaRgbColor {
  
  @scala.inline
  def apply(): SchemaRgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRgbColor]
  }
  
  @scala.inline
  implicit class SchemaRgbColorMutableBuilder[Self <: SchemaRgbColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
