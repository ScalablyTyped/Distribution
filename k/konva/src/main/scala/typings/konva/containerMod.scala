package typings.konva

import typings.konva.canvasMod.HitCanvas
import typings.konva.canvasMod.SceneCanvas
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.IRect
import typings.konva.utilMod.Collection
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("konva/types/Container", "Container")
  @js.native
  abstract class Container[ChildType /* <: Node[NodeConfig] */] () extends Node[ContainerConfig] {
    def this(config: ContainerConfig) = this()
    
    var _descendants: js.Any = js.native
    
    def _drawChildren(drawMethod: js.Any, canvas: js.Any, top: js.Any): Unit = js.native
    
    def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: String, findOne: Boolean): Collection[ChildNode] = js.native
    def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: js.Function, findOne: Boolean): Collection[ChildNode] = js.native
    
    def _setChildrenIndices(): Unit = js.native
    
    def _validateAdd(node: Node[NodeConfig]): Unit = js.native
    
    def add(children: ChildType*): this.type = js.native
    
    @JSName("children")
    var children_Container: Collection[ChildType] = js.native
    
    def clip(): IRect = js.native
    def clip(v: IRect): this.type = js.native
    
    def clipFunc(): js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit] = js.native
    def clipFunc(v: js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit]): this.type = js.native
    @JSName("clipFunc")
    var clipFunc_Original: GetSet[
        js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit], 
        this.type
      ] = js.native
    
    def clipHeight(): Double = js.native
    def clipHeight(v: Double): this.type = js.native
    @JSName("clipHeight")
    var clipHeight_Original: GetSet[Double, this.type] = js.native
    
    def clipWidth(): Double = js.native
    def clipWidth(v: Double): this.type = js.native
    @JSName("clipWidth")
    var clipWidth_Original: GetSet[Double, this.type] = js.native
    
    def clipX(): Double = js.native
    def clipX(v: Double): this.type = js.native
    @JSName("clipX")
    var clipX_Original: GetSet[Double, this.type] = js.native
    
    def clipY(): Double = js.native
    def clipY(v: Double): this.type = js.native
    @JSName("clipY")
    var clipY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("clip")
    var clip_Original: GetSet[IRect, this.type] = js.native
    
    def destroyChildren(): this.type = js.native
    
    def drawHit(can: HitCanvas): this.type = js.native
    def drawHit(can: HitCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def drawScene(can: SceneCanvas): this.type = js.native
    def drawScene(can: SceneCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def find[ChildNode /* <: Node[NodeConfig] */](selector: js.Any): Collection[ChildNode] = js.native
    
    def findOne[ChildNode /* <: Node[NodeConfig] */](selector: String): ChildNode = js.native
    def findOne[ChildNode /* <: Node[NodeConfig] */](selector: js.Function): ChildNode = js.native
    
    def get(selector: js.Any): Collection[Node[NodeConfig]] = js.native
    
    def getAllIntersections(pos: js.Any): js.Array[js.Any] = js.native
    
    def getChildren(filterFunc: js.Function1[/* item */ Node[NodeConfig], Boolean]): Collection[Node[NodeConfig]] = js.native
    
    def isAncestorOf(node: Node[NodeConfig]): Boolean = js.native
    
    def removeChildren(): this.type = js.native
  }
  
  trait ContainerConfig
    extends StObject
       with NodeConfig {
    
    var clearBeforeDraw: js.UndefOr[Boolean] = js.undefined
    
    var clipFunc: js.UndefOr[js.Function1[/* ctx */ CanvasRenderingContext2D, Unit]] = js.undefined
    
    var clipHeight: js.UndefOr[Double] = js.undefined
    
    var clipWidth: js.UndefOr[Double] = js.undefined
    
    var clipX: js.UndefOr[Double] = js.undefined
    
    var clipY: js.UndefOr[Double] = js.undefined
  }
  object ContainerConfig {
    
    @scala.inline
    def apply(): ContainerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerConfig]
    }
    
    @scala.inline
    implicit class ContainerConfigMutableBuilder[Self <: ContainerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearBeforeDraw(value: Boolean): Self = StObject.set(x, "clearBeforeDraw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearBeforeDrawUndefined: Self = StObject.set(x, "clearBeforeDraw", js.undefined)
      
      @scala.inline
      def setClipFunc(value: /* ctx */ CanvasRenderingContext2D => Unit): Self = StObject.set(x, "clipFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClipFuncUndefined: Self = StObject.set(x, "clipFunc", js.undefined)
      
      @scala.inline
      def setClipHeight(value: Double): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      @scala.inline
      def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
      
      @scala.inline
      def setClipX(value: Double): Self = StObject.set(x, "clipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipXUndefined: Self = StObject.set(x, "clipX", js.undefined)
      
      @scala.inline
      def setClipY(value: Double): Self = StObject.set(x, "clipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipYUndefined: Self = StObject.set(x, "clipY", js.undefined)
    }
  }
}
