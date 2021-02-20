package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ringMod {
  
  @JSImport("konva/types/shapes/Ring", "Ring")
  @js.native
  class Ring () extends Shape[RingConfig] {
    def this(config: RingConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
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
  trait RingConfig extends ShapeConfig {
    
    var clockwise: js.UndefOr[Boolean] = js.native
    
    var innerRadius: Double = js.native
    
    var outerRadius: Double = js.native
  }
  object RingConfig {
    
    @scala.inline
    def apply(innerRadius: Double, outerRadius: Double): RingConfig = {
      val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[RingConfig]
    }
    
    @scala.inline
    implicit class RingConfigMutableBuilder[Self <: RingConfig] (val x: Self) extends AnyVal {
      
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
