package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wedgeMod {
  
  @JSImport("konva/lib/shapes/Wedge", "Wedge")
  @js.native
  open class Wedge () extends Shape[WedgeConfig] {
    def this(config: WedgeConfig) = this()
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def angle(): Double = js.native
    def angle(v: Double): this.type = js.native
    @JSName("angle")
    var angle_Original: GetSet[Double, this.type] = js.native
    
    def clockwise(): Boolean = js.native
    def clockwise(v: Boolean): this.type = js.native
    @JSName("clockwise")
    var clockwise_Original: GetSet[Boolean, this.type] = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: Any): Unit = js.native
    
    def setWidth(width: Any): Unit = js.native
  }
  
  trait WedgeConfig
    extends StObject
       with ShapeConfig {
    
    var angle: Double
    
    var clockwise: js.UndefOr[Boolean] = js.undefined
    
    var radius: Double
  }
  object WedgeConfig {
    
    inline def apply(angle: Double, radius: Double): WedgeConfig = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[WedgeConfig]
    }
    
    extension [Self <: WedgeConfig](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
