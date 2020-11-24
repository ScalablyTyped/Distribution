package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Browser
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
import typings.konva.anon.TypeofCollection
import typings.konva.anon.TypeofNode
import typings.konva.anon.TypeofTween
import typings.konva.canvasMod.ICanvasConfig
import typings.konva.layerMod.LayerConfig
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.StageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/_CoreInternals", JSImport.Namespace)
@js.native
object coreInternalsMod extends js.Object {
  
  @js.native
  object Konva extends js.Object {
    
    var Animation: TypeofAnimation = js.native
    
    var Collection: TypeofCollection = js.native
    
    var DD: Drag = js.native
    
    var Easings: BackEaseIn = js.native
    
    var Node: TypeofNode = js.native
    
    var Tween: TypeofTween = js.native
    
    var UA: Browser = js.native
    
    var Util: Assign = js.native
    
    var _global: js.Any = js.native
    
    def _injectGlobal(Konva: js.Any): Unit = js.native
    
    def _parseUA(userAgent: js.Any): Browser = js.native
    
    var _pointerEventsEnabled: Boolean = js.native
    
    var angleDeg: Boolean = js.native
    
    var captureTouchEventsEnabled: Boolean = js.native
    
    var dblClickWindow: Double = js.native
    
    var document: js.Any = js.native
    
    var dragButtons: js.Array[Double] = js.native
    
    var dragDistance: Double = js.native
    
    var enableTrace: Boolean = js.native
    
    def getAngle(angle: js.Any): js.Any = js.native
    
    var hitOnDragEnabled: Boolean = js.native
    
    var ids: js.Any = js.native
    
    var inDblClickWindow: Boolean = js.native
    
    var isBrowser: Boolean = js.native
    
    def isDragReady(): Boolean = js.native
    
    def isDragging(): js.Any = js.native
    
    var isUnminified: Boolean = js.native
    
    var listenClickTap: Boolean = js.native
    
    var names: js.Any = js.native
    
    var pixelRatio: js.Any = js.native
    
    var shapes: StringDictionary[typings.konva.shapeMod.Shape[ShapeConfig]] = js.native
    
    var showWarnings: Boolean = js.native
    
    var stages: js.Array[typings.konva.stageMod.Stage] = js.native
    
    var version: String = js.native
    
    @js.native
    class Canvas protected ()
      extends typings.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @js.native
    object Canvas
      extends TopLevel[Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas]]
    
    @js.native
    class Container[ChildType /* <: Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    @js.native
    object Container
      extends TopLevel[Instantiable0[typings.konva.containerMod.Container[Node[NodeConfig]]]]
    
    @js.native
    class Context protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: typings.konva.canvasMod.Canvas) = this()
    }
    @js.native
    object Context
      extends TopLevel[
              Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context]
            ]
    
    @js.native
    class FastLayer protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: js.Any) = this()
    }
    @js.native
    object FastLayer
      extends TopLevel[Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer]]
    
    @js.native
    class Group ()
      extends typings.konva.groupMod.Group
    @js.native
    object Group
      extends TopLevel[Instantiable0[typings.konva.groupMod.Group]]
    
    @js.native
    class Layer ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @js.native
    object Layer
      extends TopLevel[
              Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer]
            ]
    
    @js.native
    class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @js.native
    object Shape
      extends TopLevel[
              Instantiable1[
                /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
                typings.konva.shapeMod.Shape[ShapeConfig]
              ]
            ]
    
    @js.native
    class Stage protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @js.native
    object Stage
      extends TopLevel[Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage]]
    
    @js.native
    class Transform ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @js.native
    object Transform
      extends TopLevel[
              Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform]
            ]
  }
}
