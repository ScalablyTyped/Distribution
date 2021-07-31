package typings.konva

import typings.konva.containerMod.ContainerConfig
import typings.konva.groupMod.Group
import typings.konva.konvaStrings.bottom
import typings.konva.konvaStrings.left
import typings.konva.konvaStrings.right
import typings.konva.konvaStrings.top
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.Shape
import typings.konva.shapeMod.ShapeConfig
import typings.konva.typesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("konva/types/shapes/Label", "Label")
  @js.native
  class Label protected () extends Group {
    def this(config: js.Any) = this()
    
    def _addListeners(text: js.Any): Unit = js.native
    
    def _sync(): Unit = js.native
    
    def getHeight(): Double = js.native
    
    def getTag(): Tag = js.native
    
    def getText(): Node[NodeConfig] = js.native
    
    def getWidth(): Double = js.native
  }
  
  @JSImport("konva/types/shapes/Label", "Tag")
  @js.native
  class Tag () extends Shape[TagConfig] {
    def this(config: TagConfig) = this()
    
    def _sceneFunc(context: js.Any): Unit = js.native
    
    def cornerRadius(): Double = js.native
    def cornerRadius(v: Double): this.type = js.native
    @JSName("cornerRadius")
    var cornerRadius_Original: GetSet[Double, this.type] = js.native
    
    def pointerDirection(): left | top | right | bottom = js.native
    @JSName("pointerDirection")
    var pointerDirection_Original: GetSet[left | top | right | bottom, this.type] = js.native
    @JSName("pointerDirection")
    def pointerDirection_bottom(v: bottom): this.type = js.native
    @JSName("pointerDirection")
    def pointerDirection_left(v: left): this.type = js.native
    @JSName("pointerDirection")
    def pointerDirection_right(v: right): this.type = js.native
    @JSName("pointerDirection")
    def pointerDirection_top(v: top): this.type = js.native
    
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
    
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    var pointerDirection: js.UndefOr[String] = js.undefined
    
    var pointerHeight: js.UndefOr[Double] = js.undefined
    
    var pointerWidth: js.UndefOr[Double] = js.undefined
  }
  object TagConfig {
    
    @scala.inline
    def apply(): TagConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagConfig]
    }
    
    @scala.inline
    implicit class TagConfigMutableBuilder[Self <: TagConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setPointerDirection(value: String): Self = StObject.set(x, "pointerDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerDirectionUndefined: Self = StObject.set(x, "pointerDirection", js.undefined)
      
      @scala.inline
      def setPointerHeight(value: Double): Self = StObject.set(x, "pointerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerHeightUndefined: Self = StObject.set(x, "pointerHeight", js.undefined)
      
      @scala.inline
      def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    }
  }
}
