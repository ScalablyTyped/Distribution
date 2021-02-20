package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseMod {
  
  @JSImport("konva/types/shapes/Ellipse", "Ellipse")
  @js.native
  class Ellipse () extends Shape[EllipseConfig] {
    def this(config: EllipseConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Vector2d = js.native
    def radius(v: Vector2d): this.type = js.native
    
    def radiusX(): Double = js.native
    def radiusX(v: Double): this.type = js.native
    @JSName("radiusX")
    var radiusX_Original: GetSet[Double, this.type] = js.native
    
    def radiusY(): Double = js.native
    def radiusY(v: Double): this.type = js.native
    @JSName("radiusY")
    var radiusY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("radius")
    var radius_Original: GetSet[Vector2d, this.type] = js.native
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
  }
  
  @js.native
  trait EllipseConfig extends ShapeConfig {
    
    var radiusX: Double = js.native
    
    var radiusY: Double = js.native
  }
  object EllipseConfig {
    
    @scala.inline
    def apply(radiusX: Double, radiusY: Double): EllipseConfig = {
      val __obj = js.Dynamic.literal(radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseConfig]
    }
    
    @scala.inline
    implicit class EllipseConfigMutableBuilder[Self <: EllipseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    }
  }
}
