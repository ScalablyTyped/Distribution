package typings.konva

import typings.konva.lineMod.Line
import typings.konva.lineMod.LineConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowMod {
  
  @JSImport("konva/types/shapes/Arrow", "Arrow")
  @js.native
  class Arrow () extends Line[ArrowConfig] {
    def this(config: ArrowConfig) = this()
    
    def _sceneFunc(ctx: js.Any): Unit = js.native
    
    def pointerAtBeginning(): Boolean = js.native
    def pointerAtBeginning(v: Boolean): this.type = js.native
    @JSName("pointerAtBeginning")
    var pointerAtBeginning_Original: GetSet[Boolean, this.type] = js.native
    
    def pointerLength(): Double = js.native
    def pointerLength(v: Double): this.type = js.native
    @JSName("pointerLength")
    var pointerLength_Original: GetSet[Double, this.type] = js.native
    
    def pointerWidth(): Double = js.native
    def pointerWidth(v: Double): this.type = js.native
    @JSName("pointerWidth")
    var pointerWidth_Original: GetSet[Double, this.type] = js.native
  }
  
  @js.native
  trait ArrowConfig extends LineConfig {
    
    var pointerAtBeginning: js.UndefOr[Boolean] = js.native
    
    var pointerLength: js.UndefOr[Double] = js.native
    
    var pointerWidth: js.UndefOr[Double] = js.native
  }
  object ArrowConfig {
    
    @scala.inline
    def apply(points: js.Array[Double]): ArrowConfig = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowConfig]
    }
    
    @scala.inline
    implicit class ArrowConfigMutableBuilder[Self <: ArrowConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointerAtBeginning(value: Boolean): Self = StObject.set(x, "pointerAtBeginning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerAtBeginningUndefined: Self = StObject.set(x, "pointerAtBeginning", js.undefined)
      
      @scala.inline
      def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
      
      @scala.inline
      def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    }
  }
}
