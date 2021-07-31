package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("konva/types/shapes/Circle", "Circle")
  @js.native
  class Circle () extends Shape[CircleConfig] {
    def this(config: CircleConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
  }
  
  trait CircleConfig
    extends StObject
       with ShapeConfig {
    
    var radius: Double
  }
  object CircleConfig {
    
    @scala.inline
    def apply(radius: Double): CircleConfig = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleConfig]
    }
    
    @scala.inline
    implicit class CircleConfigMutableBuilder[Self <: CircleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
