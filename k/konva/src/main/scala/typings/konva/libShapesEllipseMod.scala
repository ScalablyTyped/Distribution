package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.konva.libTypesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesEllipseMod {
  
  @JSImport("konva/lib/shapes/Ellipse", "Ellipse")
  @js.native
  open class Ellipse () extends Shape[EllipseConfig] {
    def this(config: EllipseConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
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
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
  }
  
  trait EllipseConfig
    extends StObject
       with ShapeConfig {
    
    var radiusX: Double
    
    var radiusY: Double
  }
  object EllipseConfig {
    
    inline def apply(radiusX: Double, radiusY: Double): EllipseConfig = {
      val __obj = js.Dynamic.literal(radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipseConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EllipseConfig] (val x: Self) extends AnyVal {
      
      inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
      
      inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    }
  }
}
