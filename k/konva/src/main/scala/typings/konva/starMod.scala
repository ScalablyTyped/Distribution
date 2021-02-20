package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starMod {
  
  @JSImport("konva/types/shapes/Star", "Star")
  @js.native
  class Star () extends Shape[StarConfig] {
    def this(config: StarConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def innerRadius(): Double = js.native
    def innerRadius(v: Double): this.type = js.native
    @JSName("innerRadius")
    var innerRadius_Original: GetSet[Double, this.type] = js.native
    
    def numPoints(): Double = js.native
    def numPoints(v: Double): this.type = js.native
    @JSName("numPoints")
    var numPoints_Original: GetSet[Double, this.type] = js.native
    
    def outerRadius(): Double = js.native
    def outerRadius(v: Double): this.type = js.native
    @JSName("outerRadius")
    var outerRadius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
  }
  
  @js.native
  trait StarConfig extends ShapeConfig {
    
    var innerRadius: Double = js.native
    
    var numPoints: Double = js.native
    
    var outerRadius: Double = js.native
  }
  object StarConfig {
    
    @scala.inline
    def apply(innerRadius: Double, numPoints: Double, outerRadius: Double): StarConfig = {
      val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], numPoints = numPoints.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarConfig]
    }
    
    @scala.inline
    implicit class StarConfigMutableBuilder[Self <: StarConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumPoints(value: Double): Self = StObject.set(x, "numPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    }
  }
}
