package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularPolygonMod {
  
  @JSImport("konva/types/shapes/RegularPolygon", "RegularPolygon")
  @js.native
  class RegularPolygon () extends Shape[RegularPolygonConfig] {
    def this(config: RegularPolygonConfig) = this()
    
    def _getPoints(): js.Array[_] = js.native
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: js.Any): Unit = js.native
    
    def setWidth(width: js.Any): Unit = js.native
    
    def sides(): Double = js.native
    def sides(v: Double): this.type = js.native
    @JSName("sides")
    var sides_Original: GetSet[Double, this.type] = js.native
  }
  
  @js.native
  trait RegularPolygonConfig extends ShapeConfig {
    
    var radius: Double = js.native
    
    var sides: Double = js.native
  }
  object RegularPolygonConfig {
    
    @scala.inline
    def apply(radius: Double, sides: Double): RegularPolygonConfig = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegularPolygonConfig]
    }
    
    @scala.inline
    implicit class RegularPolygonConfigMutableBuilder[Self <: RegularPolygonConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    }
  }
}
