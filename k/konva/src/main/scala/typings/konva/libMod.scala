package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Blur
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
import typings.konva.anon.TypeofImage
import typings.konva.anon.TypeofNode
import typings.konva.anon.TypeofPath
import typings.konva.anon.TypeofTween
import typings.konva.libCanvasMod.ICanvasConfig
import typings.konva.libLayerMod.LayerConfig
import typings.konva.libNodeMod.NodeConfig
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libShapesImageMod.ImageConfig
import typings.konva.libShapesLineMod.LineConfig
import typings.konva.libShapesPathMod.PathConfig
import typings.konva.libShapesTextMod.TextConfig
import typings.konva.libShapesTextPathMod.TextPathConfig
import typings.konva.libShapesTransformerMod.TransformerConfig
import typings.konva.libStageMod.StageConfig
import typings.konva.libTweenMod.TweenConfig
import typings.konva.libTypesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  object default {
    
    @JSImport("konva/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Animation")
    @js.native
    open class Animation protected ()
      extends typings.konva.libAnimationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib", "default.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Arc")
    @js.native
    open class Arc ()
      extends typings.konva.libShapesArcMod.Arc
    @JSImport("konva/lib", "default.Arc")
    @js.native
    def Arc: Instantiable0[typings.konva.libShapesArcMod.Arc] = js.native
    inline def Arc_=(x: Instantiable0[typings.konva.libShapesArcMod.Arc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Arrow")
    @js.native
    open class Arrow ()
      extends typings.konva.libShapesArrowMod.Arrow
    @JSImport("konva/lib", "default.Arrow")
    @js.native
    def Arrow: Instantiable0[typings.konva.libShapesArrowMod.Arrow] = js.native
    inline def Arrow_=(x: Instantiable0[typings.konva.libShapesArrowMod.Arrow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Canvas")
    @js.native
    open class Canvas protected ()
      extends typings.konva.libCanvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib", "default.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.libCanvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Circle")
    @js.native
    open class Circle ()
      extends typings.konva.libShapesCircleMod.Circle
    @JSImport("konva/lib", "default.Circle")
    @js.native
    def Circle: Instantiable0[typings.konva.libShapesCircleMod.Circle] = js.native
    inline def Circle_=(x: Instantiable0[typings.konva.libShapesCircleMod.Circle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Container")
    @js.native
    open class Container[ChildType /* <: typings.konva.libNodeMod.Node[NodeConfig] */] ()
      extends typings.konva.libContainerMod.Container[ChildType]
    @JSImport("konva/lib", "default.Container")
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
    @JSImport("konva/lib", "default.Context")
    @js.native
    open class Context protected ()
      extends typings.konva.libContextMod.Context {
      def this(canvas: typings.konva.libCanvasMod.Canvas) = this()
    }
    @JSImport("konva/lib", "default.Context")
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
    
    @JSImport("konva/lib", "default.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Ellipse")
    @js.native
    open class Ellipse ()
      extends typings.konva.libShapesEllipseMod.Ellipse
    @JSImport("konva/lib", "default.Ellipse")
    @js.native
    def Ellipse: Instantiable0[typings.konva.libShapesEllipseMod.Ellipse] = js.native
    inline def Ellipse_=(x: Instantiable0[typings.konva.libShapesEllipseMod.Ellipse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typings.konva.libFastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib", "default.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typings.konva.libFastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.Filters")
    @js.native
    def Filters: Blur = js.native
    inline def Filters_=(x: Blur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Filters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Group")
    @js.native
    open class Group ()
      extends typings.konva.libGroupMod.Group
    @JSImport("konva/lib", "default.Group")
    @js.native
    def Group: Instantiable0[typings.konva.libGroupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typings.konva.libGroupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Image")
    @js.native
    open class Image protected ()
      extends typings.konva.libShapesImageMod.Image {
      def this(attrs: ImageConfig) = this()
    }
    @JSImport("konva/lib", "default.Image")
    @js.native
    def Image: TypeofImage = js.native
    inline def Image_=(x: TypeofImage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Label")
    @js.native
    open class Label ()
      extends typings.konva.libShapesLabelMod.Label {
      def this(config: Any) = this()
    }
    @JSImport("konva/lib", "default.Label")
    @js.native
    def Label: Instantiable1[/* config */ js.UndefOr[Any], typings.konva.libShapesLabelMod.Label] = js.native
    inline def Label_=(x: Instantiable1[/* config */ js.UndefOr[Any], typings.konva.libShapesLabelMod.Label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Layer")
    @js.native
    open class Layer ()
      extends typings.konva.libLayerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib", "default.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.libLayerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Line")
    @js.native
    open class Line[Config /* <: LineConfig */] ()
      extends typings.konva.libShapesLineMod.Line[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib", "default.Line")
    @js.native
    def Line: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.libShapesLineMod.Line[LineConfig]
      ] = js.native
    inline def Line_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typings.konva.libShapesLineMod.Line[LineConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.libNodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib", "default.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Path")
    @js.native
    open class Path ()
      extends typings.konva.libShapesPathMod.Path {
      def this(config: PathConfig) = this()
    }
    @JSImport("konva/lib", "default.Path")
    @js.native
    def Path: TypeofPath = js.native
    inline def Path_=(x: TypeofPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Rect")
    @js.native
    open class Rect ()
      extends typings.konva.libShapesRectMod.Rect
    @JSImport("konva/lib", "default.Rect")
    @js.native
    def Rect: Instantiable0[typings.konva.libShapesRectMod.Rect] = js.native
    inline def Rect_=(x: Instantiable0[typings.konva.libShapesRectMod.Rect]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.RegularPolygon")
    @js.native
    open class RegularPolygon ()
      extends typings.konva.libShapesRegularPolygonMod.RegularPolygon
    @JSImport("konva/lib", "default.RegularPolygon")
    @js.native
    def RegularPolygon: Instantiable0[typings.konva.libShapesRegularPolygonMod.RegularPolygon] = js.native
    inline def RegularPolygon_=(x: Instantiable0[typings.konva.libShapesRegularPolygonMod.RegularPolygon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Ring")
    @js.native
    open class Ring ()
      extends typings.konva.libShapesRingMod.Ring
    @JSImport("konva/lib", "default.Ring")
    @js.native
    def Ring: Instantiable0[typings.konva.libShapesRingMod.Ring] = js.native
    inline def Ring_=(x: Instantiable0[typings.konva.libShapesRingMod.Ring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ring")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.libShapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib", "default.Shape")
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
    @JSImport("konva/lib", "default.Sprite")
    @js.native
    open class Sprite protected ()
      extends typings.konva.libShapesSpriteMod.Sprite {
      def this(config: Any) = this()
    }
    @JSImport("konva/lib", "default.Sprite")
    @js.native
    def Sprite: Instantiable1[/* config */ Any, typings.konva.libShapesSpriteMod.Sprite] = js.native
    inline def Sprite_=(x: Instantiable1[/* config */ Any, typings.konva.libShapesSpriteMod.Sprite]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Stage")
    @js.native
    open class Stage protected ()
      extends typings.konva.libStageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib", "default.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Star")
    @js.native
    open class Star ()
      extends typings.konva.libShapesStarMod.Star
    @JSImport("konva/lib", "default.Star")
    @js.native
    def Star: Instantiable0[typings.konva.libShapesStarMod.Star] = js.native
    inline def Star_=(x: Instantiable0[typings.konva.libShapesStarMod.Star]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Star")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Tag")
    @js.native
    open class Tag ()
      extends typings.konva.libShapesLabelMod.Tag
    @JSImport("konva/lib", "default.Tag")
    @js.native
    def Tag: Instantiable0[typings.konva.libShapesLabelMod.Tag] = js.native
    inline def Tag_=(x: Instantiable0[typings.konva.libShapesLabelMod.Tag]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Text")
    @js.native
    open class Text ()
      extends typings.konva.libShapesTextMod.Text {
      def this(config: TextConfig) = this()
    }
    @JSImport("konva/lib", "default.Text")
    @js.native
    def Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.libShapesTextMod.Text] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.TextPath")
    @js.native
    open class TextPath ()
      extends typings.konva.libShapesTextPathMod.TextPath {
      def this(config: TextPathConfig) = this()
    }
    @JSImport("konva/lib", "default.TextPath")
    @js.native
    def TextPath: Instantiable1[
        /* config */ js.UndefOr[TextPathConfig], 
        typings.konva.libShapesTextPathMod.TextPath
      ] = js.native
    inline def TextPath_=(
      x: Instantiable1[
          /* config */ js.UndefOr[TextPathConfig], 
          typings.konva.libShapesTextPathMod.TextPath
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.libShapesTextMod.Text]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Transform")
    @js.native
    open class Transform ()
      extends typings.konva.libUtilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib", "default.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.libUtilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Transformer")
    @js.native
    open class Transformer ()
      extends typings.konva.libShapesTransformerMod.Transformer {
      def this(config: TransformerConfig) = this()
    }
    @JSImport("konva/lib", "default.Transformer")
    @js.native
    def Transformer: Instantiable1[
        /* config */ js.UndefOr[TransformerConfig], 
        typings.konva.libShapesTransformerMod.Transformer
      ] = js.native
    inline def Transformer_=(
      x: Instantiable1[
          /* config */ js.UndefOr[TransformerConfig], 
          typings.konva.libShapesTransformerMod.Transformer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transformer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Tween")
    @js.native
    open class Tween protected ()
      extends typings.konva.libTweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib", "default.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib", "default.Wedge")
    @js.native
    open class Wedge ()
      extends typings.konva.libShapesWedgeMod.Wedge
    @JSImport("konva/lib", "default.Wedge")
    @js.native
    def Wedge: Instantiable0[typings.konva.libShapesWedgeMod.Wedge] = js.native
    inline def Wedge_=(x: Instantiable0[typings.konva.libShapesWedgeMod.Wedge]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wedge")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib", "default._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib", "default.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib", "default.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.stages")
    @js.native
    def stages: js.Array[typings.konva.libStageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typings.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
