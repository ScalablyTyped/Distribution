package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
import typings.konva.anon.TypeofNode
import typings.konva.anon.TypeofTween
import typings.konva.libCanvasMod.ICanvasConfig
import typings.konva.libLayerMod.LayerConfig
import typings.konva.libNodeMod.NodeConfig
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libStageMod.StageConfig
import typings.konva.libTweenMod.TweenConfig
import typings.konva.libTypesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreInternalsMod {
  
  object default {
    
    @JSImport("konva/lib/_CoreInternals", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Animation")
    @js.native
    open class Animation protected ()
      extends typings.konva.libAnimationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Canvas")
    @js.native
    open class Canvas protected ()
      extends typings.konva.libCanvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Container")
    @js.native
    open class Container[ChildType /* <: typings.konva.libNodeMod.Node[NodeConfig] */] ()
      extends typings.konva.libContainerMod.Container[ChildType]
    @JSImport("konva/lib/_CoreInternals", "default.Container")
    @js.native
    def Container: Instantiable0[
        typings.konva.libContainerMod.Container[typings.konva.libNodeMod.Node[NodeConfig]]
      ] = js.native
    inline def Container_=(
      x: Instantiable0[
          typings.konva.libContainerMod.Container[typings.konva.libNodeMod.Node[NodeConfig]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Context")
    @js.native
    open class Context protected ()
      extends typings.konva.libContextMod.Context {
      def this(canvas: typings.konva.libCanvasMod.Canvas) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Context")
    @js.native
    def Context: Instantiable1[
        /* canvas */ typings.konva.libCanvasMod.Canvas, 
        typings.konva.libContextMod.Context
      ] = js.native
    inline def Context_=(
      x: Instantiable1[
          /* canvas */ typings.konva.libCanvasMod.Canvas, 
          typings.konva.libContextMod.Context
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typings.konva.libFastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Group")
    @js.native
    open class Group ()
      extends typings.konva.libGroupMod.Group
    @JSImport("konva/lib/_CoreInternals", "default.Group")
    @js.native
    def Group: Instantiable0[typings.konva.libGroupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.libGroupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Layer")
    @js.native
    open class Layer ()
      extends typings.konva.libLayerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.libNodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.libShapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.libShapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typings.konva.libShapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Stage")
    @js.native
    open class Stage protected ()
      extends typings.konva.libStageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Transform")
    @js.native
    open class Transform ()
      extends typings.konva.libUtilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "default.Tween")
    @js.native
    open class Tween protected ()
      extends typings.konva.libTweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "default.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib/_CoreInternals", "default._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/_CoreInternals", "default.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib/_CoreInternals", "default.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.stages")
    @js.native
    def stages: js.Array[typings.konva.libStageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  object Konva {
    
    @JSImport("konva/lib/_CoreInternals", "Konva")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Animation")
    @js.native
    open class Animation protected ()
      extends typings.konva.libAnimationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Canvas")
    @js.native
    open class Canvas protected ()
      extends typings.konva.libCanvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Container")
    @js.native
    open class Container[ChildType /* <: typings.konva.libNodeMod.Node[NodeConfig] */] ()
      extends typings.konva.libContainerMod.Container[ChildType]
    @JSImport("konva/lib/_CoreInternals", "Konva.Container")
    @js.native
    def Container: Instantiable0[
        typings.konva.libContainerMod.Container[typings.konva.libNodeMod.Node[NodeConfig]]
      ] = js.native
    inline def Container_=(
      x: Instantiable0[
          typings.konva.libContainerMod.Container[typings.konva.libNodeMod.Node[NodeConfig]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Context")
    @js.native
    open class Context protected ()
      extends typings.konva.libContextMod.Context {
      def this(canvas: typings.konva.libCanvasMod.Canvas) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Context")
    @js.native
    def Context: Instantiable1[
        /* canvas */ typings.konva.libCanvasMod.Canvas, 
        typings.konva.libContextMod.Context
      ] = js.native
    inline def Context_=(
      x: Instantiable1[
          /* canvas */ typings.konva.libCanvasMod.Canvas, 
          typings.konva.libContextMod.Context
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typings.konva.libFastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Group")
    @js.native
    open class Group ()
      extends typings.konva.libGroupMod.Group
    @JSImport("konva/lib/_CoreInternals", "Konva.Group")
    @js.native
    def Group: Instantiable0[typings.konva.libGroupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.libGroupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Layer")
    @js.native
    open class Layer ()
      extends typings.konva.libLayerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.libNodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.libShapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.libShapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typings.konva.libShapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Stage")
    @js.native
    open class Stage protected ()
      extends typings.konva.libStageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Transform")
    @js.native
    open class Transform ()
      extends typings.konva.libUtilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_CoreInternals", "Konva.Tween")
    @js.native
    open class Tween protected ()
      extends typings.konva.libTweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib/_CoreInternals", "Konva.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib/_CoreInternals", "Konva._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/_CoreInternals", "Konva.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib/_CoreInternals", "Konva.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.stages")
    @js.native
    def stages: js.Array[typings.konva.libStageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_CoreInternals", "Konva.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
