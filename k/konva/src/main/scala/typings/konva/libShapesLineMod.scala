package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesLineMod {
  
  @JSImport("konva/lib/shapes/Line", "Line")
  @js.native
  open class Line[Config /* <: LineConfig */] () extends Shape[Config] {
    def this(config: Config) = this()
    
    def _getTensionPoints(): js.Array[Any] = js.native
    
    def _getTensionPointsClosed(): js.Array[Any] = js.native
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def bezier(): Boolean = js.native
    def bezier(v: Boolean): this.type = js.native
    @JSName("bezier")
    var bezier_Original: GetSet[Boolean, this.type] = js.native
    
    def closed(): Boolean = js.native
    def closed(v: Boolean): this.type = js.native
    @JSName("closed")
    var closed_Original: GetSet[Boolean, this.type] = js.native
    
    def getHeight(): Double = js.native
    
    def getTensionPoints(): Any = js.native
    
    def getWidth(): Double = js.native
    
    def points(): js.Array[Double] = js.native
    def points(v: js.Array[Double]): this.type = js.native
    @JSName("points")
    var points_Original: GetSet[js.Array[Double], this.type] = js.native
    
    def tension(): Double = js.native
    def tension(v: Double): this.type = js.native
    @JSName("tension")
    var tension_Original: GetSet[Double, this.type] = js.native
  }
  
  trait LineConfig
    extends StObject
       with ShapeConfig {
    
    var bezier: js.UndefOr[Boolean] = js.undefined
    
    var closed: js.UndefOr[Boolean] = js.undefined
    
    var points: js.UndefOr[
        js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
      ] = js.undefined
    
    var tension: js.UndefOr[Double] = js.undefined
  }
  object LineConfig {
    
    inline def apply(): LineConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineConfig] (val x: Self) extends AnyVal {
      
      inline def setBezier(value: Boolean): Self = StObject.set(x, "bezier", value.asInstanceOf[js.Any])
      
      inline def setBezierUndefined: Self = StObject.set(x, "bezier", js.undefined)
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setPoints(
        value: js.Array[Double] | js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
      ): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    }
  }
}
