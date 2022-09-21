package typings.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.animationMod.Animation
import typings.konva.anon.A
import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.canvasMod.Canvas
import typings.konva.imageMod.Image
import typings.konva.imageMod.ImageConfig
import typings.konva.konvaNumbers.`-1`
import typings.konva.konvaNumbers.`1`
import typings.konva.layerMod.LayerConfig
import typings.konva.lineMod.LineConfig
import typings.konva.nodeMod.Filter
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.pathMod.Path
import typings.konva.pathMod.PathConfig
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.StageConfig
import typings.konva.textMod.TextConfig
import typings.konva.textPathMod.TextPathConfig
import typings.konva.transformerMod.TransformerConfig
import typings.konva.tweenMod.Tween
import typings.konva.tweenMod.TweenConfig
import typings.konva.typesMod.AnimationFn
import typings.konva.typesMod.IRect
import typings.konva.typesMod.RGB
import typings.konva.typesMod.RGBA
import typings.konva.typesMod.Vector2d
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("konva", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object Animation {
      
      @JSImport("konva", "default.Animation")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addAnimation(anim: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_addAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("konva", "default.Animation.animIdCounter")
      @js.native
      def animIdCounter: Double = js.native
      inline def animIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animIdCounter")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Animation.animRunning")
      @js.native
      def animRunning: Boolean = js.native
      inline def animRunning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animRunning")(x.asInstanceOf[js.Any])
      
      inline def animationLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_animationLoop")().asInstanceOf[Unit]
      
      @JSImport("konva", "default.Animation.animations")
      @js.native
      def animations: js.Array[Any] = js.native
      inline def animations_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animations")(x.asInstanceOf[js.Any])
      
      inline def handleAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_handleAnimation")().asInstanceOf[Unit]
      
      inline def removeAnimation(anim: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def runFrames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_runFrames")().asInstanceOf[Unit]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Animation")
    @js.native
    open class AnimationCls protected () extends Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    
    @JSImport("konva", "default.Arc")
    @js.native
    val Arc: Instantiable0[typings.konva.arcMod.Arc] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Arc")
    @js.native
    open class ArcCls ()
      extends typings.konva.arcMod.Arc
    
    @JSImport("konva", "default.Arrow")
    @js.native
    val Arrow: Instantiable0[typings.konva.arrowMod.Arrow] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Arrow")
    @js.native
    open class ArrowCls ()
      extends typings.konva.arrowMod.Arrow
    
    @JSImport("konva", "default.Circle")
    @js.native
    val Circle: Instantiable0[typings.konva.circleMod.Circle] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Circle")
    @js.native
    open class CircleCls ()
      extends typings.konva.circleMod.Circle
    
    @JSImport("konva", "default.Container")
    @js.native
    val Container: Instantiable0[typings.konva.containerMod.Container[Node[NodeConfig]]] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Container")
    @js.native
    open class ContainerCls[ChildType /* <: Node[NodeConfig] */] ()
      extends typings.konva.containerMod.Container[ChildType]
    
    @JSImport("konva", "default.Context")
    @js.native
    val Context: Instantiable1[/* canvas */ Canvas, typings.konva.contextMod.Context] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Context")
    @js.native
    open class ContextCls protected ()
      extends typings.konva.contextMod.Context {
      def this(canvas: Canvas) = this()
    }
    
    object DD {
      
      @JSImport("konva", "default.DD")
      @js.native
      val ^ : js.Any = js.native
      
      inline def drag(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drag")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("konva", "default.DD._dragElements")
      @js.native
      def dragElements: Map[Double, typings.konva.anon.Node] = js.native
      
      inline def dragElements_=(x: Map[Double, typings.konva.anon.Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
      
      inline def endDragAfter(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragAfter")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def endDragBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")().asInstanceOf[Unit]
      inline def endDragBefore(evt: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("konva", "default.DD.isDragging")
      @js.native
      val isDragging: Boolean = js.native
      
      @JSImport("konva", "default.DD.justDragged")
      @js.native
      def justDragged: Boolean = js.native
      inline def justDragged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justDragged")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.DD.node")
      @js.native
      val node: Node[NodeConfig] = js.native
    }
    
    object Easings {
      
      @JSImport("konva", "default.Easings")
      @js.native
      val ^ : js.Any = js.native
      
      inline def BackEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def BackEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def BackEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def BounceEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def BounceEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def BounceEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def EaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def EaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def EaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def ElasticEaseIn(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def ElasticEaseInOut(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def ElasticEaseOut(t: Any, b: Any, c: Any, d: Any, a: Any, p: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def Linear(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def StrongEaseIn(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def StrongEaseInOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def StrongEaseOut(t: Any, b: Any, c: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    @JSImport("konva", "default.Ellipse")
    @js.native
    val Ellipse: Instantiable0[typings.konva.ellipseMod.Ellipse] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Ellipse")
    @js.native
    open class EllipseCls ()
      extends typings.konva.ellipseMod.Ellipse
    
    @JSImport("konva", "default.FastLayer")
    @js.native
    val FastLayer: Instantiable1[/* attrs */ Any, typings.konva.fastLayerMod.FastLayer] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.FastLayer")
    @js.native
    open class FastLayerCls protected ()
      extends typings.konva.fastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    
    object Filters {
      
      @JSImport("konva", "default.Filters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("konva", "default.Filters.Blur")
      @js.native
      def Blur: Filter = js.native
      inline def Blur(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Blur")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Blur_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Blur")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Brighten")
      @js.native
      def Brighten: Filter = js.native
      inline def Brighten(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Brighten")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Brighten_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brighten")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Contrast")
      @js.native
      def Contrast: Filter = js.native
      inline def Contrast(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Contrast")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Contrast_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Emboss")
      @js.native
      def Emboss: Filter = js.native
      inline def Emboss(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Emboss")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Emboss_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emboss")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Enhance")
      @js.native
      def Enhance: Filter = js.native
      inline def Enhance(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Enhance")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Enhance_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enhance")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Grayscale")
      @js.native
      def Grayscale: Filter = js.native
      inline def Grayscale(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Grayscale")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Grayscale_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Grayscale")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.HSL")
      @js.native
      def HSL: Filter = js.native
      inline def HSL(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HSL")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def HSL_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSL")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.HSV")
      @js.native
      def HSV: Filter = js.native
      inline def HSV(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HSV")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def HSV_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSV")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Invert")
      @js.native
      def Invert: Filter = js.native
      inline def Invert(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Invert_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invert")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Kaleidoscope")
      @js.native
      def Kaleidoscope: Filter = js.native
      inline def Kaleidoscope(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Kaleidoscope")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Kaleidoscope_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Kaleidoscope")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Mask")
      @js.native
      def Mask: Filter = js.native
      inline def Mask(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Mask")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Mask_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mask")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Noise")
      @js.native
      def Noise: Filter = js.native
      inline def Noise(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Noise")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Noise_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Noise")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Pixelate")
      @js.native
      def Pixelate: Filter = js.native
      inline def Pixelate(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Pixelate")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Pixelate_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixelate")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Posterize")
      @js.native
      def Posterize: Filter = js.native
      inline def Posterize(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Posterize")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Posterize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Posterize")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.RGB")
      @js.native
      def RGB: Filter = js.native
      inline def RGB(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("konva", "default.Filters.RGBA")
      @js.native
      def RGBA: Filter = js.native
      inline def RGBA(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBA")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def RGBA_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBA")(x.asInstanceOf[js.Any])
      
      inline def RGB_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGB")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Sepia")
      @js.native
      def Sepia: Filter = js.native
      inline def Sepia(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Sepia")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Sepia_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sepia")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Solarize")
      @js.native
      def Solarize: Filter = js.native
      inline def Solarize(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Solarize")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Solarize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solarize")(x.asInstanceOf[js.Any])
      
      @JSImport("konva", "default.Filters.Threshold")
      @js.native
      def Threshold: Filter = js.native
      inline def Threshold(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Threshold")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def Threshold_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("konva", "default.Group")
    @js.native
    val Group: Instantiable0[typings.konva.groupMod.Group] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Group")
    @js.native
    open class GroupCls ()
      extends typings.konva.groupMod.Group
    
    object Image {
      
      @JSImport("konva", "default.Image")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromURL(url: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def fromURL(url: Any, callback: Any, onError: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Image")
    @js.native
    open class ImageCls protected () extends Image {
      def this(attrs: ImageConfig) = this()
    }
    
    @JSImport("konva", "default.Label")
    @js.native
    val Label: Instantiable1[/* config */ js.UndefOr[Any], typings.konva.labelMod.Label] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Label")
    @js.native
    open class LabelCls ()
      extends typings.konva.labelMod.Label {
      def this(config: Any) = this()
    }
    
    @JSImport("konva", "default.Layer")
    @js.native
    val Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Layer")
    @js.native
    open class LayerCls ()
      extends typings.konva.layerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    
    @JSImport("konva", "default.Line")
    @js.native
    val Line: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.lineMod.Line[LineConfig]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Line")
    @js.native
    open class LineCls[Config /* <: LineConfig */] ()
      extends typings.konva.lineMod.Line[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    
    object Node {
      
      @JSImport("konva", "default.Node")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def create(data: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def createNode(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def createNode(obj: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Node")
    @js.native
    open class NodeCls[Config /* <: NodeConfig */] () extends Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    
    object Path {
      
      @JSImport("konva", "default.Path")
      @js.native
      val ^ : js.Any = js.native
      
      inline def calcLength(x: Any, y: Any, cmd: Any, points: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calcLength")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def convertEndpointToCenterParameterization(x1: Any, y1: Any, x2: Any, y2: Any, fa: Any, fs: Any, rx: Any, ry: Any, psiDeg: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertEndpointToCenterParameterization")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], fa.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], psiDeg.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      
      inline def getLineLength(x1: Any, y1: Any, x2: Any, y2: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineLength")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def getPointOnCubicBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any, P4x: Any, P4y: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnCubicBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any], P4x.asInstanceOf[js.Any], P4y.asInstanceOf[js.Any])).asInstanceOf[X]
      
      inline def getPointOnEllipticalArc(cx: Any, cy: Any, rx: Any, ry: Any, theta: Any, psi: Any): XY = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnEllipticalArc")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[XY]
      
      inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Any, fromY: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def getPointOnLine(dist: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, fromX: Unit, fromY: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def getPointOnQuadraticBezier(pct: Any, P1x: Any, P1y: Any, P2x: Any, P2y: Any, P3x: Any, P3y: Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnQuadraticBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any])).asInstanceOf[X]
      
      inline def parsePathData(data: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Path")
    @js.native
    open class PathCls () extends Path {
      def this(config: PathConfig) = this()
    }
    
    @JSImport("konva", "default.Rect")
    @js.native
    val Rect: Instantiable0[typings.konva.rectMod.Rect] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Rect")
    @js.native
    open class RectCls ()
      extends typings.konva.rectMod.Rect
    
    @JSImport("konva", "default.RegularPolygon")
    @js.native
    val RegularPolygon: Instantiable0[typings.konva.regularPolygonMod.RegularPolygon] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.RegularPolygon")
    @js.native
    open class RegularPolygonCls ()
      extends typings.konva.regularPolygonMod.RegularPolygon
    
    @JSImport("konva", "default.Ring")
    @js.native
    val Ring: Instantiable0[typings.konva.ringMod.Ring] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Ring")
    @js.native
    open class RingCls ()
      extends typings.konva.ringMod.Ring
    
    @JSImport("konva", "default.Shape")
    @js.native
    val Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typings.konva.shapeMod.Shape[ShapeConfig]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Shape")
    @js.native
    open class ShapeCls[Config /* <: ShapeConfig */] ()
      extends typings.konva.shapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    
    @JSImport("konva", "default.Sprite")
    @js.native
    val Sprite: Instantiable1[/* config */ Any, typings.konva.spriteMod.Sprite] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Sprite")
    @js.native
    open class SpriteCls protected ()
      extends typings.konva.spriteMod.Sprite {
      def this(config: Any) = this()
    }
    
    @JSImport("konva", "default.Stage")
    @js.native
    val Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Stage")
    @js.native
    open class StageCls protected ()
      extends typings.konva.stageMod.Stage {
      def this(config: StageConfig) = this()
    }
    
    @JSImport("konva", "default.Star")
    @js.native
    val Star: Instantiable0[typings.konva.starMod.Star] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Star")
    @js.native
    open class StarCls ()
      extends typings.konva.starMod.Star
    
    @JSImport("konva", "default.Tag")
    @js.native
    val Tag: Instantiable0[typings.konva.labelMod.Tag] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Tag")
    @js.native
    open class TagCls ()
      extends typings.konva.labelMod.Tag
    
    @JSImport("konva", "default.Text")
    @js.native
    val Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.textMod.Text] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Text")
    @js.native
    open class TextCls ()
      extends typings.konva.textMod.Text {
      def this(config: TextConfig) = this()
    }
    
    @JSImport("konva", "default.TextPath")
    @js.native
    val TextPath: Instantiable1[/* config */ js.UndefOr[TextPathConfig], typings.konva.textPathMod.TextPath] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.TextPath")
    @js.native
    open class TextPathCls ()
      extends typings.konva.textPathMod.TextPath {
      def this(config: TextPathConfig) = this()
    }
    
    @JSImport("konva", "default.Transform")
    @js.native
    val Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Transform")
    @js.native
    open class TransformCls ()
      extends typings.konva.utilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    
    @JSImport("konva", "default.Transformer")
    @js.native
    val Transformer: Instantiable1[
        /* config */ js.UndefOr[TransformerConfig], 
        typings.konva.transformerMod.Transformer
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Transformer")
    @js.native
    open class TransformerCls ()
      extends typings.konva.transformerMod.Transformer {
      def this(config: TransformerConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Tween")
    @js.native
    open class TweenCls protected () extends Tween {
      def this(config: TweenConfig) = this()
    }
    
    object Util {
      
      @JSImport("konva", "default.Util")
      @js.native
      val ^ : js.Any = js.native
      
      inline def _degToRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_degToRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def _radToDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_radToDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("_assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
      
      inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def cloneArray(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      inline def cloneObject[Any](obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def colorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def createCanvasElement(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasElement")().asInstanceOf[HTMLCanvasElement]
      
      inline def createImageElement(): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageElement")().asInstanceOf[HTMLImageElement]
      
      inline def degToRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degToRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def each(obj: Any, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def error(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getFirstPointerId(evt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getFirstPointerId")(evt.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def getProjectionToLine(pt: Vector2d, line: Any, isClosed: Any): Vector2d = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToLine")(pt.asInstanceOf[js.Any], line.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[Vector2d]
      
      inline def getProjectionToSegment(x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToSegment")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      
      inline def getRGB(color: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
      
      inline def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
      
      inline def getRotation(radians: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRotation")(radians.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def haveIntersection(r1: IRect, r2: IRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("haveIntersection")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def hex3ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex3ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def hex6ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex6ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def hexToRgb(hex: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("_hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB]
      
      inline def hslColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hslColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def inRange(`val`: Any, left: Any, right: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inRange")(`val`.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isArray(obj: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
      
      inline def isBoolean(obj: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
      
      inline def isElement(obj: Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
      
      inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isInDocument(el: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isInDocument")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isNumber(obj: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
      
      inline def isObject(`val`: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
      
      inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isString(obj: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
      
      inline def isValidSelector(selector: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def namedColorToRBA(str: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("_namedColorToRBA")(str.asInstanceOf[js.Any]).asInstanceOf[A]
      
      inline def prepareArrayForTween(startArray: Any, endArray: Any, isClosed: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_prepareArrayForTween")(startArray.asInstanceOf[js.Any], endArray.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      
      inline def prepareToStringify(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_prepareToStringify")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def radToDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radToDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def requestAnimFrame(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def rgbColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def rgbToHex(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def rgbaColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbaColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
      
      inline def sign(number: Double): `1` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("_sign")(number.asInstanceOf[js.Any]).asInstanceOf[`1` | `-1`]
      
      inline def `throw`(str: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(str.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
      
      inline def urlToImage(url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_urlToImage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def warn(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSImport("konva", "default.Wedge")
    @js.native
    val Wedge: Instantiable0[typings.konva.wedgeMod.Wedge] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("konva", "default.Wedge")
    @js.native
    open class WedgeCls ()
      extends typings.konva.wedgeMod.Wedge
    
    @JSImport("konva", "default.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.enableTrace")
    @js.native
    def enableTrace: Double = js.native
    inline def enableTrace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Boolean]
    
    @JSImport("konva", "default.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.stages")
    @js.native
    val stages: js.Array[typings.konva.stageMod.Stage] = js.native
  }
  
  object Konva {
    
    type Animation = typings.konva.animationMod.Animation
    
    type Arc = typings.konva.arcMod.Arc
    
    type ArcConfig = typings.konva.arcMod.ArcConfig
    
    type Arrow = typings.konva.arrowMod.Arrow
    
    type ArrowConfig = typings.konva.arrowMod.ArrowConfig
    
    type Circle = typings.konva.circleMod.Circle
    
    type CircleConfig = typings.konva.circleMod.CircleConfig
    
    type Container = typings.konva.containerMod.Container[typings.konva.mod.Konva.Node]
    
    type ContainerConfig = typings.konva.containerMod.ContainerConfig
    
    type Context = typings.konva.contextMod.Context
    
    type Ellipse = typings.konva.ellipseMod.Ellipse
    
    type EllipseConfig = typings.konva.ellipseMod.EllipseConfig
    
    type FastLayer = typings.konva.fastLayerMod.FastLayer
    
    type Group = typings.konva.groupMod.Group
    
    type GroupConfig = typings.konva.groupMod.GroupConfig
    
    type Image = typings.konva.imageMod.Image
    
    type ImageConfig = typings.konva.imageMod.ImageConfig
    
    type KonvaEventListener[This, EventType] = typings.konva.nodeMod.KonvaEventListener[This, EventType]
    
    type KonvaEventObject[EventType] = typings.konva.nodeMod.KonvaEventObject[EventType]
    
    type KonvaPointerEvent = typings.konva.pointerEventsMod.KonvaPointerEvent
    
    type Label = typings.konva.labelMod.Label
    
    type LabelConfig = typings.konva.labelMod.LabelConfig
    
    type Layer = typings.konva.layerMod.Layer
    
    type LayerConfig = typings.konva.layerMod.LayerConfig
    
    type Line = typings.konva.lineMod.Line[typings.konva.lineMod.LineConfig]
    
    type LineConfig = typings.konva.lineMod.LineConfig
    
    type Node = typings.konva.nodeMod.Node[typings.konva.nodeMod.NodeConfig]
    
    type NodeConfig = typings.konva.nodeMod.NodeConfig
    
    type Path = typings.konva.pathMod.Path
    
    type PathConfig = typings.konva.pathMod.PathConfig
    
    type Rect = typings.konva.rectMod.Rect
    
    type RectConfig = typings.konva.rectMod.RectConfig
    
    type RegularPolygon = typings.konva.regularPolygonMod.RegularPolygon
    
    type RegularPolygonConfig = typings.konva.regularPolygonMod.RegularPolygonConfig
    
    type Ring = typings.konva.ringMod.Ring
    
    type RingConfig = typings.konva.ringMod.RingConfig
    
    type Shape = typings.konva.shapeMod.Shape[typings.konva.shapeMod.ShapeConfig]
    
    type ShapeConfig = typings.konva.shapeMod.ShapeConfig
    
    type Sprite = typings.konva.spriteMod.Sprite
    
    type SpriteConfig = typings.konva.spriteMod.SpriteConfig
    
    type Stage = typings.konva.stageMod.Stage
    
    type StageConfig = typings.konva.stageMod.StageConfig
    
    type Star = typings.konva.starMod.Star
    
    type StarConfig = typings.konva.starMod.StarConfig
    
    type Tag = typings.konva.labelMod.Tag
    
    type TagConfig = typings.konva.labelMod.TagConfig
    
    type Text = typings.konva.textMod.Text
    
    type TextConfig = typings.konva.textMod.TextConfig
    
    type TextPath = typings.konva.textPathMod.TextPath
    
    type TextPathConfig = typings.konva.textPathMod.TextPathConfig
    
    type Transform = typings.konva.utilMod.Transform
    
    type Transformer = typings.konva.transformerMod.Transformer
    
    type TransformerConfig = typings.konva.transformerMod.TransformerConfig
    
    type Tween = typings.konva.tweenMod.Tween
    
    type TweenConfig = typings.konva.tweenMod.TweenConfig
    
    type Vector2d = typings.konva.typesMod.Vector2d
    
    type Wedge = typings.konva.wedgeMod.Wedge
    
    type WedgeConfig = typings.konva.wedgeMod.WedgeConfig
  }
}
