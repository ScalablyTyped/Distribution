package typings.konva.anon

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Antialiased extends StObject {
  
  var antialiased: js.UndefOr[Boolean] = js.undefined
  
  var shape: js.UndefOr[Shape[ShapeConfig]] = js.undefined
}
object Antialiased {
  
  @scala.inline
  def apply(): Antialiased = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Antialiased]
  }
  
  @scala.inline
  implicit class AntialiasedMutableBuilder[Self <: Antialiased] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntialiased(value: Boolean): Self = StObject.set(x, "antialiased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasedUndefined: Self = StObject.set(x, "antialiased", js.undefined)
    
    @scala.inline
    def setShape(value: Shape[ShapeConfig]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
