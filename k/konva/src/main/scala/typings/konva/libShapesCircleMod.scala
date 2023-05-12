package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesCircleMod {
  
  @JSImport("konva/lib/shapes/Circle", "Circle")
  @js.native
  open class Circle () extends Shape[CircleConfig] {
    def this(config: CircleConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def radius(): Double = js.native
    def radius(v: Double): this.type = js.native
    @JSName("radius")
    var radius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
  }
  
  trait CircleConfig
    extends StObject
       with ShapeConfig {
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object CircleConfig {
    
    inline def apply(): CircleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleConfig] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
