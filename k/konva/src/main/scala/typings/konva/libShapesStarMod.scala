package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesStarMod {
  
  @JSImport("konva/lib/shapes/Star", "Star")
  @js.native
  open class Star () extends Shape[StarConfig] {
    def this(config: StarConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
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
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
  }
  
  trait StarConfig
    extends StObject
       with ShapeConfig {
    
    var innerRadius: Double
    
    var numPoints: Double
    
    var outerRadius: Double
  }
  object StarConfig {
    
    inline def apply(innerRadius: Double, numPoints: Double, outerRadius: Double): StarConfig = {
      val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], numPoints = numPoints.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[StarConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StarConfig] (val x: Self) extends AnyVal {
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setNumPoints(value: Double): Self = StObject.set(x, "numPoints", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    }
  }
}
