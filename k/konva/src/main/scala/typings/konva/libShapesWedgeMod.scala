package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesWedgeMod {
  
  @JSImport("konva/lib/shapes/Wedge", "Wedge")
  @js.native
  open class Wedge () extends Shape[WedgeConfig] {
    def this(config: WedgeConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
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
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WedgeConfig] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
