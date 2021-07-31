package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/shape", JSImport.Default)
  @js.native
  val default: Shape = js.native
  
  trait Shape extends StObject {
    
    var borderRadius: Double
  }
  object Shape {
    
    @scala.inline
    def apply(borderRadius: Double): Shape = {
      val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shape]
    }
    
    @scala.inline
    implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/shape.Shape> */
  trait ShapeOptions extends StObject {
    
    var borderRadius: js.UndefOr[Double] = js.undefined
  }
  object ShapeOptions {
    
    @scala.inline
    def apply(): ShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeOptions]
    }
    
    @scala.inline
    implicit class ShapeOptionsMutableBuilder[Self <: ShapeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    }
  }
  
  type _To = Shape
  
  /* This means you don't have to write `default`, but can instead just say `shapeMod.foo` */
  override def _to: Shape = default
}
