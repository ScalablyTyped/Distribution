package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
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

object coreMod {
  
  object default {
    
    @JSImport("konva/lib/Core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Animation")
    @js.native
    open class Animation protected ()
      extends typings.konva.animationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib/Core", "default.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Canvas")
    @js.native
    open class Canvas protected ()
      extends typings.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib/Core", "default.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Container")
    @js.native
    open class Container[ChildType /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    @JSImport("konva/lib/Core", "default.Container")
    @js.native
    def Container: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]] = js.native
    inline def Container_=(x: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Context")
    @js.native
    open class Context protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: typings.konva.canvasMod.Canvas) = this()
    }
    @JSImport("konva/lib/Core", "default.Context")
    @js.native
    def Context: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context] = js.native
    inline def Context_=(x: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib/Core", "default.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typings.konva.fastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typings.konva.fastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Group")
    @js.native
    open class Group ()
      extends typings.konva.groupMod.Group
    @JSImport("konva/lib/Core", "default.Group")
    @js.native
    def Group: Instantiable0[typings.konva.groupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.groupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Layer")
    @js.native
    open class Layer ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib/Core", "default.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.nodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/Core", "default.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/Core", "default.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typings.konva.shapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Stage")
    @js.native
    open class Stage protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib/Core", "default.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Transform")
    @js.native
    open class Transform ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib/Core", "default.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "default.Tween")
    @js.native
    open class Tween protected ()
      extends typings.konva.tweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib/Core", "default.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib/Core", "default._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/Core", "default.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib/Core", "default.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.stages")
    @js.native
    def stages: js.Array[typings.konva.stageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  object Konva {
    
    @JSImport("konva/lib/Core", "Konva")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Animation")
    @js.native
    open class Animation protected ()
      extends typings.konva.animationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Canvas")
    @js.native
    open class Canvas protected ()
      extends typings.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Container")
    @js.native
    open class Container[ChildType /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    @JSImport("konva/lib/Core", "Konva.Container")
    @js.native
    def Container: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]] = js.native
    inline def Container_=(x: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Context")
    @js.native
    open class Context protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: typings.konva.canvasMod.Canvas) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Context")
    @js.native
    def Context: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context] = js.native
    inline def Context_=(x: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib/Core", "Konva.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typings.konva.fastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typings.konva.fastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Group")
    @js.native
    open class Group ()
      extends typings.konva.groupMod.Group
    @JSImport("konva/lib/Core", "Konva.Group")
    @js.native
    def Group: Instantiable0[typings.konva.groupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.groupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Layer")
    @js.native
    open class Layer ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.nodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typings.konva.shapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Stage")
    @js.native
    open class Stage protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Transform")
    @js.native
    open class Transform ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/Core", "Konva.Tween")
    @js.native
    open class Tween protected ()
      extends typings.konva.tweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib/Core", "Konva.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib/Core", "Konva._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/Core", "Konva.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib/Core", "Konva.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.stages")
    @js.native
    def stages: js.Array[typings.konva.stageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/Core", "Konva.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
