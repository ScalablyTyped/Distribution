package typings.konva

import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("konva/types/shapes/Rect", "Rect")
  @js.native
  class Rect () extends Shape[RectConfig] {
    def this(config: RectConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def cornerRadius(): Double | js.Array[Double] = js.native
    def cornerRadius(v: js.Array[Double]): this.type = js.native
    def cornerRadius(v: Double): this.type = js.native
    @JSName("cornerRadius")
    var cornerRadius_Original: GetSet[Double | js.Array[Double], this.type] = js.native
  }
  
  @js.native
  trait RectConfig extends ShapeConfig {
    
    var cornerRadius: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object RectConfig {
    
    @scala.inline
    def apply(): RectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectConfig]
    }
    
    @scala.inline
    implicit class RectConfigMutableBuilder[Self <: RectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCornerRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setCornerRadiusVarargs(value: Double*): Self = StObject.set(x, "cornerRadius", js.Array(value :_*))
    }
  }
}
