package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single interpolation point on a gradient conditional format. These pin
  * the gradient color scale according to the color, type and value chosen.
  */
trait SchemaInterpolationPoint extends StObject {
  
  /**
    * The color this interpolation point should use.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * How the value should be interpreted.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value this interpolation point uses.  May be a formula. Unused if
    * type is MIN or MAX.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaInterpolationPoint {
  
  @scala.inline
  def apply(): SchemaInterpolationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterpolationPoint]
  }
  
  @scala.inline
  implicit class SchemaInterpolationPointMutableBuilder[Self <: SchemaInterpolationPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
