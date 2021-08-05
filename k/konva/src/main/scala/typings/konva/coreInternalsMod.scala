package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.StageConfig
import typings.konva.tweenMod.TweenConfig
import typings.konva.typesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInternalsMod {
  
  object Konva {
    
    @JSImport("konva/types/_CoreInternals", "Konva")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Animation")
    @js.native
    class Animation protected ()
      extends typings.konva.animationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Canvas")
    @js.native
    class Canvas protected ()
      extends typings.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Collection")
    @js.native
    class Collection[Child /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.utilMod.Collection[Child]
    @JSImport("konva/types/_CoreInternals", "Konva.Collection")
    @js.native
    def Collection: TypeofCollection = js.native
    inline def Collection_=(x: TypeofCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Container")
    @js.native
    class Container[ChildType /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    @JSImport("konva/types/_CoreInternals", "Konva.Container")
    @js.native
    def Container: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]] = js.native
    inline def Container_=(x: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Context")
    @js.native
    class Context protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: typings.konva.canvasMod.Canvas) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Context")
    @js.native
    def Context: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context] = js.native
    inline def Context_=(x: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.FastLayer")
    @js.native
    class FastLayer protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Group")
    @js.native
    class Group ()
      extends typings.konva.groupMod.Group
    @JSImport("konva/types/_CoreInternals", "Konva.Group")
    @js.native
    def Group: Instantiable0[typings.konva.groupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.groupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Layer")
    @js.native
    class Layer ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Node")
    @js.native
    class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.nodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Shape")
    @js.native
    class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
        typings.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
          typings.konva.shapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Stage")
    @js.native
    class Stage protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Transform")
    @js.native
    class Transform ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/_CoreInternals", "Konva.Tween")
    @js.native
    class Tween protected ()
      extends typings.konva.tweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/types/_CoreInternals", "Konva.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.UA")
    @js.native
    def UA: Browser = js.native
    inline def UA_=(x: Browser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UA")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.captureTouchEventsEnabled")
    @js.native
    def captureTouchEventsEnabled: Boolean = js.native
    inline def captureTouchEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureTouchEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.document")
    @js.native
    def document: js.Any = js.native
    inline def document_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("konva/types/_CoreInternals", "Konva._global")
    @js.native
    def global: js.Any = js.native
    
    inline def global_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.ids")
    @js.native
    def ids: js.Any = js.native
    inline def ids_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ids")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.inDblClickWindow")
    @js.native
    def inDblClickWindow: Boolean = js.native
    inline def inDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDblClickWindow")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/types/_CoreInternals", "Konva.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[js.Any]
    
    @JSImport("konva/types/_CoreInternals", "Konva.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.listenClickTap")
    @js.native
    def listenClickTap: Boolean = js.native
    inline def listenClickTap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listenClickTap")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.names")
    @js.native
    def names: js.Any = js.native
    inline def names_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
    
    inline def parseUA(userAgent: js.Any): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("_parseUA")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Browser]
    
    @JSImport("konva/types/_CoreInternals", "Konva.pixelRatio")
    @js.native
    def pixelRatio: js.Any = js.native
    inline def pixelRatio_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva._pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.stages")
    @js.native
    def stages: js.Array[typings.konva.stageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/_CoreInternals", "Konva.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
