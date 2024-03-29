package typings.konva

import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesRingMod {
  
  @JSImport("konva/lib/shapes/Ring", "Ring")
  @js.native
  open class Ring () extends Shape[RingConfig] {
    def this(config: RingConfig) = this()
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def innerRadius(): Double = js.native
    def innerRadius(v: Double): this.type = js.native
    @JSName("innerRadius")
    var innerRadius_Original: GetSet[Double, this.type] = js.native
    
    def outerRadius(): Double = js.native
    def outerRadius(v: Double): this.type = js.native
    @JSName("outerRadius")
    var outerRadius_Original: GetSet[Double, this.type] = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
  }
  
  trait RingConfig
    extends StObject
       with ShapeConfig {
    
    var innerRadius: Double
    
    var outerRadius: Double
  }
  object RingConfig {
    
    inline def apply(innerRadius: Double, outerRadius: Double): RingConfig = {
      val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any])
      __obj.asInstanceOf[RingConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RingConfig] (val x: Self) extends AnyVal {
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadius(value: Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    }
  }
}
