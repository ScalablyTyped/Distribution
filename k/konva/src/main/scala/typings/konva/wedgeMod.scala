package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wedgeMod {
  
  @JSImport("konva/types/shapes/Wedge", "Wedge")
  @js.native
  class Wedge () extends Shape[WedgeConfig] {
    def this(config: WedgeConfig) = this()
    
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
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
  }
  
  @js.native
  trait WedgeConfig extends ShapeConfig {
    
    var angle: Double = js.native
    
    var clockwise: js.UndefOr[Boolean] = js.native
    
    var radius: Double = js.native
  }
  object WedgeConfig {
    
    @scala.inline
    def apply(angle: Double, radius: Double): WedgeConfig = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[WedgeConfig]
    }
    
    @scala.inline
    implicit class WedgeConfigMutableBuilder[Self <: WedgeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
