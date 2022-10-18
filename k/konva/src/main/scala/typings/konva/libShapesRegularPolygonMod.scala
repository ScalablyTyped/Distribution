package typings.konva

import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesRegularPolygonMod {
  
  @JSImport("konva/lib/shapes/RegularPolygon", "RegularPolygon")
  @js.native
  open class RegularPolygon () extends Shape[RegularPolygonConfig] {
    def this(config: RegularPolygonConfig) = this()
    
    def _getPoints(): js.Array[Any] = js.native
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: Any): Unit = js.native
    
    def setWidth(width: Any): Unit = js.native
    
    def sides(): Double = js.native
    def sides(v: Double): this.type = js.native
    @JSName("sides")
    var sides_Original: GetSet[Double, this.type] = js.native
  }
  
  trait RegularPolygonConfig
    extends StObject
       with ShapeConfig {
    
    var radius: Double
    
    var sides: Double
  }
  object RegularPolygonConfig {
    
    inline def apply(radius: Double, sides: Double): RegularPolygonConfig = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegularPolygonConfig]
    }
    
    extension [Self <: RegularPolygonConfig](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    }
  }
}
