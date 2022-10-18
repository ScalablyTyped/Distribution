package typings.konva

import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesArcMod {
  
  @JSImport("konva/lib/shapes/Arc", "Arc")
  @js.native
  open class Arc () extends Shape[ArcConfig] {
    def this(config: ArcConfig) = this()
    
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
    
    def innerRadius(): Double = js.native
    def innerRadius(v: Double): this.type = js.native
    @JSName("innerRadius")
    var innerRadius_Original: GetSet[Double, this.type] = js.native
    
    def outerRadius(): Double = js.native
    def outerRadius(v: Double): this.type = js.native
    @JSName("outerRadius")
    var outerRadius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: Any): Unit = js.native
    
    def setWidth(width: Any): Unit = js.native
  }
  
  trait ArcConfig
    extends StObject
       with ShapeConfig {
    
    var angle: Double
    
    var clockwise: js.UndefOr[Boolean] = js.undefined
    
    var innerRadius: Double
    
    var outerRadius: Double
  }
  object ArcConfig {
    
    inline def apply(angle: Double, innerRadius: Double, outerRadius: Double): ArcConfig = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcConfig]
    }
    
    extension [Self <: ArcConfig](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    }
  }
}
