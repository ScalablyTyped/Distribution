package typings.konva

import typings.konva.lineMod.Line
import typings.konva.lineMod.LineConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowMod {
  
  @JSImport("konva/lib/shapes/Arrow", "Arrow")
  @js.native
  open class Arrow () extends Line[ArrowConfig] {
    def this(config: ArrowConfig) = this()
    
    def __fillStroke(ctx: Any): Unit = js.native
    
    def _sceneFunc(ctx: Any): Unit = js.native
    
    def pointerAtBeginning(): Boolean = js.native
    def pointerAtBeginning(v: Boolean): this.type = js.native
    @JSName("pointerAtBeginning")
    var pointerAtBeginning_Original: GetSet[Boolean, this.type] = js.native
    
    def pointerAtEnding(): Boolean = js.native
    def pointerAtEnding(v: Boolean): this.type = js.native
    @JSName("pointerAtEnding")
    var pointerAtEnding_Original: GetSet[Boolean, this.type] = js.native
    
    def pointerLength(): Double = js.native
    def pointerLength(v: Double): this.type = js.native
    @JSName("pointerLength")
    var pointerLength_Original: GetSet[Double, this.type] = js.native
    
    def pointerWidth(): Double = js.native
    def pointerWidth(v: Double): this.type = js.native
    @JSName("pointerWidth")
    var pointerWidth_Original: GetSet[Double, this.type] = js.native
  }
  
  trait ArrowConfig
    extends StObject
       with LineConfig {
    
    var pointerAtBeginning: js.UndefOr[Boolean] = js.undefined
    
    var pointerAtEnding: js.UndefOr[Boolean] = js.undefined
    
    var pointerLength: js.UndefOr[Double] = js.undefined
    
    var pointerWidth: js.UndefOr[Double] = js.undefined
    
    @JSName("points")
    var points_ArrowConfig: js.Array[Double]
  }
  object ArrowConfig {
    
    inline def apply(points: js.Array[Double]): ArrowConfig = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowConfig]
    }
    
    extension [Self <: ArrowConfig](x: Self) {
      
      inline def setPointerAtBeginning(value: Boolean): Self = StObject.set(x, "pointerAtBeginning", value.asInstanceOf[js.Any])
      
      inline def setPointerAtBeginningUndefined: Self = StObject.set(x, "pointerAtBeginning", js.undefined)
      
      inline def setPointerAtEnding(value: Boolean): Self = StObject.set(x, "pointerAtEnding", value.asInstanceOf[js.Any])
      
      inline def setPointerAtEndingUndefined: Self = StObject.set(x, "pointerAtEnding", js.undefined)
      
      inline def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
      
      inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
      
      inline def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
      
      inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
}
