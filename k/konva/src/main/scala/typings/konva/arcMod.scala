package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcMod {
  
  @JSImport("konva/types/shapes/Arc", "Arc")
  @js.native
  class Arc () extends Shape[ArcConfig] {
    def this(config: ArcConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
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
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
  }
  
  @js.native
  trait ArcConfig extends ShapeConfig {
    
    var angle: Double = js.native
    
    var clockwise: js.UndefOr[Boolean] = js.native
    
    var innerRadius: Double = js.native
    
    var outerRadius: Double = js.native
  }
  object ArcConfig {
    
    @scala.inline
    def apply(angle: Double, innerRadius: Double, outerRadius: Double): ArcConfig = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcConfig]
    }
    
    @scala.inline
    implicit class ArcConfigMutableBuilder[Self <: ArcConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      @scala.inline
      def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    }
  }
}
