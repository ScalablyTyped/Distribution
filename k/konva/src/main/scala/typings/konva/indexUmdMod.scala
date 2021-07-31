package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Blur
import typings.konva.anon.Browser
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
import typings.konva.anon.TypeofCollection
import typings.konva.anon.TypeofImage
import typings.konva.anon.TypeofNode
import typings.konva.anon.TypeofPath
import typings.konva.anon.TypeofTween
import typings.konva.canvasMod.ICanvasConfig
import typings.konva.layerMod.LayerConfig
import typings.konva.lineMod.LineConfig
import typings.konva.nodeMod.NodeConfig
import typings.konva.pathMod.PathConfig
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.StageConfig
import typings.konva.textMod.TextConfig
import typings.konva.textPathMod.TextPathConfig
import typings.konva.transformerMod.TransformerConfig
import typings.konva.tweenMod.TweenConfig
import typings.konva.typesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexUmdMod {
  
  object default {
    
    @JSImport("konva/types/index-umd", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Animation")
    @js.native
    class Animation protected ()
      extends typings.konva.animationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    @scala.inline
    def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Arc")
    @js.native
    class Arc ()
      extends typings.konva.arcMod.Arc
    @JSImport("konva/types/index-umd", "default.Arc")
    @js.native
    def Arc: Instantiable0[typings.konva.arcMod.Arc] = js.native
    @scala.inline
    def Arc_=(x: Instantiable0[typings.konva.arcMod.Arc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Arrow")
    @js.native
    class Arrow ()
      extends typings.konva.arrowMod.Arrow
    @JSImport("konva/types/index-umd", "default.Arrow")
    @js.native
    def Arrow: Instantiable0[typings.konva.arrowMod.Arrow] = js.native
    @scala.inline
    def Arrow_=(x: Instantiable0[typings.konva.arrowMod.Arrow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Canvas")
    @js.native
    class Canvas protected ()
      extends typings.konva.canvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas] = js.native
    @scala.inline
    def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Circle")
    @js.native
    class Circle ()
      extends typings.konva.circleMod.Circle
    @JSImport("konva/types/index-umd", "default.Circle")
    @js.native
    def Circle: Instantiable0[typings.konva.circleMod.Circle] = js.native
    @scala.inline
    def Circle_=(x: Instantiable0[typings.konva.circleMod.Circle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Collection")
    @js.native
    class Collection[Child /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.utilMod.Collection[Child]
    @JSImport("konva/types/index-umd", "default.Collection")
    @js.native
    def Collection: TypeofCollection = js.native
    @scala.inline
    def Collection_=(x: TypeofCollection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Container")
    @js.native
    class Container[ChildType /* <: typings.konva.nodeMod.Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    @JSImport("konva/types/index-umd", "default.Container")
    @js.native
    def Container: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]] = js.native
    @scala.inline
    def Container_=(x: Instantiable0[typings.konva.containerMod.Container[typings.konva.nodeMod.Node[NodeConfig]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Context")
    @js.native
    class Context protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: typings.konva.canvasMod.Canvas) = this()
    }
    @JSImport("konva/types/index-umd", "default.Context")
    @js.native
    def Context: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context] = js.native
    @scala.inline
    def Context_=(x: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.DD")
    @js.native
    def DD: Drag = js.native
    @scala.inline
    def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    @scala.inline
    def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Ellipse")
    @js.native
    class Ellipse ()
      extends typings.konva.ellipseMod.Ellipse
    @JSImport("konva/types/index-umd", "default.Ellipse")
    @js.native
    def Ellipse: Instantiable0[typings.konva.ellipseMod.Ellipse] = js.native
    @scala.inline
    def Ellipse_=(x: Instantiable0[typings.konva.ellipseMod.Ellipse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.FastLayer")
    @js.native
    class FastLayer protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer] = js.native
    @scala.inline
    def FastLayer_=(x: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.Filters")
    @js.native
    def Filters: Blur = js.native
    @scala.inline
    def Filters_=(x: Blur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Filters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Group")
    @js.native
    class Group ()
      extends typings.konva.groupMod.Group
    @JSImport("konva/types/index-umd", "default.Group")
    @js.native
    def Group: Instantiable0[typings.konva.groupMod.Group] = js.native
    @scala.inline
    def Group_=(x: Instantiable0[typings.konva.groupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Image")
    @js.native
    class Image ()
      extends typings.konva.imageMod.Image
    @JSImport("konva/types/index-umd", "default.Image")
    @js.native
    def Image: TypeofImage = js.native
    @scala.inline
    def Image_=(x: TypeofImage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Label")
    @js.native
    class Label protected ()
      extends typings.konva.labelMod.Label {
      def this(config: js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Label")
    @js.native
    def Label: Instantiable1[/* config */ js.Any, typings.konva.labelMod.Label] = js.native
    @scala.inline
    def Label_=(x: Instantiable1[/* config */ js.Any, typings.konva.labelMod.Label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Layer")
    @js.native
    class Layer ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
    @scala.inline
    def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Line")
    @js.native
    class Line[Config /* <: LineConfig */] ()
      extends typings.konva.lineMod.Line[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Line")
    @js.native
    def Line: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
        typings.konva.lineMod.Line[LineConfig]
      ] = js.native
    @scala.inline
    def Line_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
          typings.konva.lineMod.Line[LineConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Node")
    @js.native
    class Node[Config /* <: NodeConfig */] ()
      extends typings.konva.nodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Node")
    @js.native
    def Node: TypeofNode = js.native
    @scala.inline
    def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Path")
    @js.native
    class Path ()
      extends typings.konva.pathMod.Path {
      def this(config: PathConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Path")
    @js.native
    def Path: TypeofPath = js.native
    @scala.inline
    def Path_=(x: TypeofPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Rect")
    @js.native
    class Rect ()
      extends typings.konva.rectMod.Rect
    @JSImport("konva/types/index-umd", "default.Rect")
    @js.native
    def Rect: Instantiable0[typings.konva.rectMod.Rect] = js.native
    @scala.inline
    def Rect_=(x: Instantiable0[typings.konva.rectMod.Rect]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.RegularPolygon")
    @js.native
    class RegularPolygon ()
      extends typings.konva.regularPolygonMod.RegularPolygon
    @JSImport("konva/types/index-umd", "default.RegularPolygon")
    @js.native
    def RegularPolygon: Instantiable0[typings.konva.regularPolygonMod.RegularPolygon] = js.native
    @scala.inline
    def RegularPolygon_=(x: Instantiable0[typings.konva.regularPolygonMod.RegularPolygon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Ring")
    @js.native
    class Ring ()
      extends typings.konva.ringMod.Ring
    @JSImport("konva/types/index-umd", "default.Ring")
    @js.native
    def Ring: Instantiable0[typings.konva.ringMod.Ring] = js.native
    @scala.inline
    def Ring_=(x: Instantiable0[typings.konva.ringMod.Ring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ring")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Shape")
    @js.native
    class Shape[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
        typings.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    @scala.inline
    def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
          typings.konva.shapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Sprite")
    @js.native
    class Sprite protected ()
      extends typings.konva.spriteMod.Sprite {
      def this(config: js.Any) = this()
    }
    @JSImport("konva/types/index-umd", "default.Sprite")
    @js.native
    def Sprite: Instantiable1[/* config */ js.Any, typings.konva.spriteMod.Sprite] = js.native
    @scala.inline
    def Sprite_=(x: Instantiable1[/* config */ js.Any, typings.konva.spriteMod.Sprite]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Stage")
    @js.native
    class Stage protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
    @scala.inline
    def Stage_=(x: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Star")
    @js.native
    class Star ()
      extends typings.konva.starMod.Star
    @JSImport("konva/types/index-umd", "default.Star")
    @js.native
    def Star: Instantiable0[typings.konva.starMod.Star] = js.native
    @scala.inline
    def Star_=(x: Instantiable0[typings.konva.starMod.Star]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Star")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Tag")
    @js.native
    class Tag ()
      extends typings.konva.labelMod.Tag
    @JSImport("konva/types/index-umd", "default.Tag")
    @js.native
    def Tag: Instantiable0[typings.konva.labelMod.Tag] = js.native
    @scala.inline
    def Tag_=(x: Instantiable0[typings.konva.labelMod.Tag]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Text")
    @js.native
    class Text ()
      extends typings.konva.textMod.Text {
      def this(config: TextConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Text")
    @js.native
    def Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.textMod.Text] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.TextPath")
    @js.native
    class TextPath ()
      extends typings.konva.textPathMod.TextPath {
      def this(config: TextPathConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.TextPath")
    @js.native
    def TextPath: Instantiable1[/* config */ js.UndefOr[TextPathConfig], typings.konva.textPathMod.TextPath] = js.native
    @scala.inline
    def TextPath_=(x: Instantiable1[/* config */ js.UndefOr[TextPathConfig], typings.konva.textPathMod.TextPath]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Text_=(x: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.textMod.Text]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Transform")
    @js.native
    class Transform ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/types/index-umd", "default.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
    @scala.inline
    def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Transformer")
    @js.native
    class Transformer ()
      extends typings.konva.transformerMod.Transformer {
      def this(config: TransformerConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Transformer")
    @js.native
    def Transformer: Instantiable1[
        /* config */ js.UndefOr[TransformerConfig], 
        typings.konva.transformerMod.Transformer
      ] = js.native
    @scala.inline
    def Transformer_=(
      x: Instantiable1[
          /* config */ js.UndefOr[TransformerConfig], 
          typings.konva.transformerMod.Transformer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transformer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Tween")
    @js.native
    class Tween protected ()
      extends typings.konva.tweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/types/index-umd", "default.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    @scala.inline
    def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.UA")
    @js.native
    def UA: Browser = js.native
    @scala.inline
    def UA_=(x: Browser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UA")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.Util")
    @js.native
    def Util: Assign = js.native
    @scala.inline
    def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/types/index-umd", "default.Wedge")
    @js.native
    class Wedge ()
      extends typings.konva.wedgeMod.Wedge
    @JSImport("konva/types/index-umd", "default.Wedge")
    @js.native
    def Wedge: Instantiable0[typings.konva.wedgeMod.Wedge] = js.native
    @scala.inline
    def Wedge_=(x: Instantiable0[typings.konva.wedgeMod.Wedge]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wedge")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    @scala.inline
    def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.captureTouchEventsEnabled")
    @js.native
    def captureTouchEventsEnabled: Boolean = js.native
    @scala.inline
    def captureTouchEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureTouchEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    @scala.inline
    def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.document")
    @js.native
    def document: js.Any = js.native
    @scala.inline
    def document_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    @scala.inline
    def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    @scala.inline
    def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    @scala.inline
    def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getAngle(angle: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSImport("konva/types/index-umd", "default._global")
    @js.native
    def global: js.Any = js.native
    
    @scala.inline
    def global_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    @scala.inline
    def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.ids")
    @js.native
    def ids: js.Any = js.native
    @scala.inline
    def ids_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ids")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.inDblClickWindow")
    @js.native
    def inDblClickWindow: Boolean = js.native
    @scala.inline
    def inDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDblClickWindow")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def injectGlobal(Konva: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/types/index-umd", "default.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    @scala.inline
    def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    @scala.inline
    def isDragging(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[js.Any]
    
    @JSImport("konva/types/index-umd", "default.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    @scala.inline
    def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.listenClickTap")
    @js.native
    def listenClickTap: Boolean = js.native
    @scala.inline
    def listenClickTap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listenClickTap")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.names")
    @js.native
    def names: js.Any = js.native
    @scala.inline
    def names_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("names")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def parseUA(userAgent: js.Any): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("_parseUA")(userAgent.asInstanceOf[js.Any]).asInstanceOf[Browser]
    
    @JSImport("konva/types/index-umd", "default.pixelRatio")
    @js.native
    def pixelRatio: js.Any = js.native
    @scala.inline
    def pixelRatio_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default._pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    
    @scala.inline
    def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    @scala.inline
    def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.stages")
    @js.native
    def stages: js.Array[typings.konva.stageMod.Stage] = js.native
    @scala.inline
    def stages_=(x: js.Array[typings.konva.stageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/index-umd", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
