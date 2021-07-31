package typings.konva

import typings.konva.contextMod.Context
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("konva/types/shapes/Line", "Line")
  @js.native
  class Line[Config /* <: LineConfig */] () extends Shape[Config] {
    def this(config: Config) = this()
    
    def _getTensionPoints(): js.Array[js.Any] = js.native
    
    def _getTensionPointsClosed(): js.Array[js.Any] = js.native
    
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
    
    def getTensionPoints(): js.Any = js.native
    
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
    
    var points: js.Array[Double]
    
    var tension: js.UndefOr[Double] = js.undefined
  }
  object LineConfig {
    
    @scala.inline
    def apply(points: js.Array[Double]): LineConfig = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineConfig]
    }
    
    @scala.inline
    implicit class LineConfigMutableBuilder[Self <: LineConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBezier(value: Boolean): Self = StObject.set(x, "bezier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBezierUndefined: Self = StObject.set(x, "bezier", js.undefined)
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    }
  }
}
