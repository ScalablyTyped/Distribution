package typings.konva

import typings.konva.konvaStrings.bottom
import typings.konva.konvaStrings.left
import typings.konva.konvaStrings.right
import typings.konva.konvaStrings.top
import typings.konva.libContainerMod.ContainerConfig
import typings.konva.libGroupMod.Group
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libShapesTextMod.Text
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesLabelMod {
  
  @JSImport("konva/lib/shapes/Label", "Label")
  @js.native
  open class Label () extends Group {
    def this(config: Any) = this()
    
    def _addListeners(text: Any): Unit = js.native
    
    def _sync(): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getTag(): Tag = js.native
    
    def getText(): Text = js.native
    
    def getWidth(): Double = js.native
  }
  
  @JSImport("konva/lib/shapes/Label", "Tag")
  @js.native
  open class Tag () extends Shape[TagConfig] {
    def this(config: TagConfig) = this()
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def cornerRadius(): Double = js.native
    def cornerRadius(v: Double): this.type = js.native
    @JSName("cornerRadius")
    var cornerRadius_Original: GetSet[Double, this.type] = js.native
    
    def pointerDirection(): left | top | right | bottom = js.native
    def pointerDirection(v: left | top | right | bottom): this.type = js.native
    @JSName("pointerDirection")
    var pointerDirection_Original: GetSet[left | top | right | bottom, this.type] = js.native
    
    def pointerHeight(): Double = js.native
    def pointerHeight(v: Double): this.type = js.native
    @JSName("pointerHeight")
    var pointerHeight_Original: GetSet[Double, this.type] = js.native
    
    def pointerWidth(): Double = js.native
    def pointerWidth(v: Double): this.type = js.native
    @JSName("pointerWidth")
    var pointerWidth_Original: GetSet[Double, this.type] = js.native
  }
  
  type LabelConfig = ContainerConfig
  
  trait TagConfig
    extends StObject
       with ShapeConfig {
    
    var cornerRadius: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var pointerDirection: js.UndefOr[String] = js.undefined
    
    var pointerHeight: js.UndefOr[Double] = js.undefined
    
    var pointerWidth: js.UndefOr[Double] = js.undefined
  }
  object TagConfig {
    
    inline def apply(): TagConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagConfig]
    }
    
    extension [Self <: TagConfig](x: Self) {
      
      inline def setCornerRadius(value: Double | js.Array[Double]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setCornerRadiusVarargs(value: Double*): Self = StObject.set(x, "cornerRadius", js.Array(value*))
      
      inline def setPointerDirection(value: String): Self = StObject.set(x, "pointerDirection", value.asInstanceOf[js.Any])
      
      inline def setPointerDirectionUndefined: Self = StObject.set(x, "pointerDirection", js.undefined)
      
      inline def setPointerHeight(value: Double): Self = StObject.set(x, "pointerHeight", value.asInstanceOf[js.Any])
      
      inline def setPointerHeightUndefined: Self = StObject.set(x, "pointerHeight", js.undefined)
      
      inline def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    }
  }
}
