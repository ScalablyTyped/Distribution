package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesRectMod {
  
  @JSImport("konva/lib/shapes/Rect", "Rect")
  @js.native
  open class Rect () extends Shape[RectConfig] {
    def this(config: RectConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def cornerRadius(): Double | js.Array[Double] = js.native
    def cornerRadius(v: js.Array[Double]): this.type = js.native
    def cornerRadius(v: Double): this.type = js.native
    @JSName("cornerRadius")
    var cornerRadius_Original: GetSet[Double | js.Array[Double], this.type] = js.native
  }
  
  trait RectConfig
    extends StObject
       with ShapeConfig {
    
    var cornerRadius: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object RectConfig {
    
    inline def apply(): RectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectConfig] (val x: Self) extends AnyVal {
      
      inline def setCornerRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setCornerRadiusVarargs(value: Double*): Self = StObject.set(x, "cornerRadius", js.Array(value*))
    }
  }
}
