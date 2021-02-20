package typings.konva.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.animationMod.Animation
import typings.konva.anon.A
import typings.konva.anon.DragStatus
import typings.konva.anon.X
import typings.konva.anon.XY
import typings.konva.canvasMod.Canvas
import typings.konva.imageMod.Image
import typings.konva.konvaNumbers.`-1`
import typings.konva.konvaNumbers.`0`
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
import typings.konva.utilMod.Collection
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("konva", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  object Animation {
    
    @JSImport("konva", "default.Animation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva", "default.Animation._addAnimation")
    @js.native
    def addAnimation(anim: js.Any): Unit = js.native
    
    @JSImport("konva", "default.Animation.animIdCounter")
    @js.native
    def animIdCounter: Double = js.native
    @scala.inline
    def animIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animIdCounter")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Animation.animRunning")
    @js.native
    def animRunning: Boolean = js.native
    @scala.inline
    def animRunning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animRunning")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Animation._animationLoop")
    @js.native
    def animationLoop(): Unit = js.native
    
    @JSImport("konva", "default.Animation.animations")
    @js.native
    def animations: js.Array[js.Any] = js.native
    @scala.inline
    def animations_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animations")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Animation._handleAnimation")
    @js.native
    def handleAnimation(): Unit = js.native
    
    @JSImport("konva", "default.Animation._removeAnimation")
    @js.native
    def removeAnimation(anim: js.Any): Unit = js.native
    
    @JSImport("konva", "default.Animation._runFrames")
    @js.native
    def runFrames(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Animation")
  @js.native
  class AnimationCls protected () extends Animation {
    def this(func: AnimationFn) = this()
    def this(func: AnimationFn, layers: js.Any) = this()
  }
  
  @JSImport("konva", "default.Arc")
  @js.native
  val Arc: Instantiable0[typings.konva.arcMod.Arc] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Arc")
  @js.native
  class ArcCls ()
    extends typings.konva.arcMod.Arc
  
  @JSImport("konva", "default.Arrow")
  @js.native
  val Arrow: Instantiable0[typings.konva.arrowMod.Arrow] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Arrow")
  @js.native
  class ArrowCls ()
    extends typings.konva.arrowMod.Arrow
  
  @JSImport("konva", "default.Circle")
  @js.native
  val Circle: Instantiable0[typings.konva.circleMod.Circle] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Circle")
  @js.native
  class CircleCls ()
    extends typings.konva.circleMod.Circle
  
  object Collection {
    
    @JSImport("konva", "default.Collection._mapMethod")
    @js.native
    def mapMethod(methodName: js.Any): Unit = js.native
    
    @JSImport("konva", "default.Collection.mapMethods")
    @js.native
    def mapMethods(constructor: js.Function): Unit = js.native
    
    @JSImport("konva", "default.Collection.toCollection")
    @js.native
    def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): typings.konva.utilMod.Collection[ChildNode] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Collection")
  @js.native
  class CollectionCls[Child /* <: Node[NodeConfig] */] () extends Collection[Child]
  
  @JSImport("konva", "default.Container")
  @js.native
  val Container: Instantiable0[typings.konva.containerMod.Container[Node[NodeConfig]]] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Container")
  @js.native
  class ContainerCls[ChildType /* <: Node[NodeConfig] */] ()
    extends typings.konva.containerMod.Container[ChildType]
  
  @JSImport("konva", "default.Context")
  @js.native
  val Context: Instantiable1[/* canvas */ Canvas, typings.konva.contextMod.Context] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Context")
  @js.native
  class ContextCls protected ()
    extends typings.konva.contextMod.Context {
    def this(canvas: Canvas) = this()
  }
  
  object DD {
    
    @JSImport("konva", "default.DD")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva", "default.DD._drag")
    @js.native
    def drag(evt: js.Any): Unit = js.native
    
    @JSImport("konva", "default.DD._dragElements")
    @js.native
    def dragElements: Map[Double, DragStatus] = js.native
    
    @scala.inline
    def dragElements_=(x: Map[Double, DragStatus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.DD._endDragAfter")
    @js.native
    def endDragAfter(evt: js.Any): Unit = js.native
    
    @JSImport("konva", "default.DD._endDragBefore")
    @js.native
    def endDragBefore(): Unit = js.native
    @JSImport("konva", "default.DD._endDragBefore")
    @js.native
    def endDragBefore(evt: js.Any): Unit = js.native
    
    @JSImport("konva", "default.DD.isDragging")
    @js.native
    val isDragging: Boolean = js.native
    
    @JSImport("konva", "default.DD.justDragged")
    @js.native
    def justDragged: Boolean = js.native
    @scala.inline
    def justDragged_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justDragged")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.DD.node")
    @js.native
    val node: Node[NodeConfig] = js.native
  }
  
  object Easings {
    
    @JSImport("konva", "default.Easings.BackEaseIn")
    @js.native
    def BackEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.BackEaseInOut")
    @js.native
    def BackEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.BackEaseOut")
    @js.native
    def BackEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.BounceEaseIn")
    @js.native
    def BounceEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.BounceEaseInOut")
    @js.native
    def BounceEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.BounceEaseOut")
    @js.native
    def BounceEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.EaseIn")
    @js.native
    def EaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.EaseInOut")
    @js.native
    def EaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.EaseOut")
    @js.native
    def EaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.ElasticEaseIn")
    @js.native
    def ElasticEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.ElasticEaseInOut")
    @js.native
    def ElasticEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.ElasticEaseOut")
    @js.native
    def ElasticEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.Linear")
    @js.native
    def Linear(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.StrongEaseIn")
    @js.native
    def StrongEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.StrongEaseInOut")
    @js.native
    def StrongEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Easings.StrongEaseOut")
    @js.native
    def StrongEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = js.native
  }
  
  @JSImport("konva", "default.Ellipse")
  @js.native
  val Ellipse: Instantiable0[typings.konva.ellipseMod.Ellipse] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Ellipse")
  @js.native
  class EllipseCls ()
    extends typings.konva.ellipseMod.Ellipse
  
  @JSImport("konva", "default.FastLayer")
  @js.native
  val FastLayer: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.FastLayer")
  @js.native
  class FastLayerCls protected ()
    extends typings.konva.fastLayerMod.FastLayer {
    def this(attrs: js.Any) = this()
  }
  
  object Filters {
    
    @JSImport("konva", "default.Filters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("konva", "default.Filters.Blur")
    @js.native
    def Blur: Filter = js.native
    @JSImport("konva", "default.Filters.Blur")
    @js.native
    def Blur(imageData: ImageData): Unit = js.native
    @scala.inline
    def Blur_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Blur")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Brighten")
    @js.native
    def Brighten: Filter = js.native
    @JSImport("konva", "default.Filters.Brighten")
    @js.native
    def Brighten(imageData: ImageData): Unit = js.native
    @scala.inline
    def Brighten_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brighten")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Contrast")
    @js.native
    def Contrast: Filter = js.native
    @JSImport("konva", "default.Filters.Contrast")
    @js.native
    def Contrast(imageData: ImageData): Unit = js.native
    @scala.inline
    def Contrast_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Emboss")
    @js.native
    def Emboss: Filter = js.native
    @JSImport("konva", "default.Filters.Emboss")
    @js.native
    def Emboss(imageData: ImageData): Unit = js.native
    @scala.inline
    def Emboss_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emboss")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Enhance")
    @js.native
    def Enhance: Filter = js.native
    @JSImport("konva", "default.Filters.Enhance")
    @js.native
    def Enhance(imageData: ImageData): Unit = js.native
    @scala.inline
    def Enhance_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enhance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Grayscale")
    @js.native
    def Grayscale: Filter = js.native
    @JSImport("konva", "default.Filters.Grayscale")
    @js.native
    def Grayscale(imageData: ImageData): Unit = js.native
    @scala.inline
    def Grayscale_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.HSL")
    @js.native
    def HSL: Filter = js.native
    @JSImport("konva", "default.Filters.HSL")
    @js.native
    def HSL(imageData: ImageData): Unit = js.native
    @scala.inline
    def HSL_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSL")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.HSV")
    @js.native
    def HSV: Filter = js.native
    @JSImport("konva", "default.Filters.HSV")
    @js.native
    def HSV(imageData: ImageData): Unit = js.native
    @scala.inline
    def HSV_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSV")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Invert")
    @js.native
    def Invert: Filter = js.native
    @JSImport("konva", "default.Filters.Invert")
    @js.native
    def Invert(imageData: ImageData): Unit = js.native
    @scala.inline
    def Invert_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invert")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Kaleidoscope")
    @js.native
    def Kaleidoscope: Filter = js.native
    @JSImport("konva", "default.Filters.Kaleidoscope")
    @js.native
    def Kaleidoscope(imageData: ImageData): Unit = js.native
    @scala.inline
    def Kaleidoscope_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Kaleidoscope")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Mask")
    @js.native
    def Mask: Filter = js.native
    @JSImport("konva", "default.Filters.Mask")
    @js.native
    def Mask(imageData: ImageData): Unit = js.native
    @scala.inline
    def Mask_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mask")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Noise")
    @js.native
    def Noise: Filter = js.native
    @JSImport("konva", "default.Filters.Noise")
    @js.native
    def Noise(imageData: ImageData): Unit = js.native
    @scala.inline
    def Noise_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Noise")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Pixelate")
    @js.native
    def Pixelate: Filter = js.native
    @JSImport("konva", "default.Filters.Pixelate")
    @js.native
    def Pixelate(imageData: ImageData): Unit = js.native
    @scala.inline
    def Pixelate_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixelate")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Posterize")
    @js.native
    def Posterize: Filter = js.native
    @JSImport("konva", "default.Filters.Posterize")
    @js.native
    def Posterize(imageData: ImageData): Unit = js.native
    @scala.inline
    def Posterize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Posterize")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.RGB")
    @js.native
    def RGB: Filter = js.native
    @JSImport("konva", "default.Filters.RGB")
    @js.native
    def RGB(imageData: ImageData): Unit = js.native
    
    @JSImport("konva", "default.Filters.RGBA")
    @js.native
    def RGBA: Filter = js.native
    @JSImport("konva", "default.Filters.RGBA")
    @js.native
    def RGBA(imageData: ImageData): Unit = js.native
    @scala.inline
    def RGBA_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBA")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def RGB_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGB")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Sepia")
    @js.native
    def Sepia: Filter = js.native
    @JSImport("konva", "default.Filters.Sepia")
    @js.native
    def Sepia(imageData: ImageData): Unit = js.native
    @scala.inline
    def Sepia_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sepia")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Solarize")
    @js.native
    def Solarize: Filter = js.native
    @JSImport("konva", "default.Filters.Solarize")
    @js.native
    def Solarize(imageData: ImageData): Unit = js.native
    @scala.inline
    def Solarize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solarize")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Threshold")
    @js.native
    def Threshold: Filter = js.native
    @JSImport("konva", "default.Filters.Threshold")
    @js.native
    def Threshold(imageData: ImageData): Unit = js.native
    @scala.inline
    def Threshold_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("konva", "default.Group")
  @js.native
  val Group: Instantiable0[typings.konva.groupMod.Group] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Group")
  @js.native
  class GroupCls ()
    extends typings.konva.groupMod.Group
  
  object Image {
    
    @JSImport("konva", "default.Image.fromURL")
    @js.native
    def fromURL(url: js.Any, callback: js.Any): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Image")
  @js.native
  class ImageCls () extends Image
  
  @JSImport("konva", "default.Label")
  @js.native
  val Label: Instantiable1[/* config */ js.Any, typings.konva.labelMod.Label] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Label")
  @js.native
  class LabelCls protected ()
    extends typings.konva.labelMod.Label {
    def this(config: js.Any) = this()
  }
  
  @JSImport("konva", "default.Layer")
  @js.native
  val Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Layer")
  @js.native
  class LayerCls ()
    extends typings.konva.layerMod.Layer {
    def this(config: LayerConfig) = this()
  }
  
  @JSImport("konva", "default.Line")
  @js.native
  val Line: Instantiable1[
    /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
    typings.konva.lineMod.Line[LineConfig]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Line")
  @js.native
  class LineCls[Config /* <: LineConfig */] ()
    extends typings.konva.lineMod.Line[Config] {
    def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
  }
  
  object Node {
    
    @JSImport("konva", "default.Node.create")
    @js.native
    def create(data: js.Any): js.Any = js.native
    @JSImport("konva", "default.Node.create")
    @js.native
    def create(data: js.Any, container: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Node._createNode")
    @js.native
    def createNode(obj: js.Any): js.Any = js.native
    @JSImport("konva", "default.Node._createNode")
    @js.native
    def createNode(obj: js.Any, container: js.Any): js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Node")
  @js.native
  class NodeCls[Config /* <: NodeConfig */] () extends Node[Config] {
    def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
  }
  
  object Path {
    
    @JSImport("konva", "default.Path.calcLength")
    @js.native
    def calcLength(x: js.Any, y: js.Any, cmd: js.Any, points: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Path.convertEndpointToCenterParameterization")
    @js.native
    def convertEndpointToCenterParameterization(
      x1: js.Any,
      y1: js.Any,
      x2: js.Any,
      y2: js.Any,
      fa: js.Any,
      fs: js.Any,
      rx: js.Any,
      ry: js.Any,
      psiDeg: js.Any
    ): js.Array[_] = js.native
    
    @JSImport("konva", "default.Path.getLineLength")
    @js.native
    def getLineLength(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): Double = js.native
    
    @JSImport("konva", "default.Path.getPointOnCubicBezier")
    @js.native
    def getPointOnCubicBezier(
      pct: js.Any,
      P1x: js.Any,
      P1y: js.Any,
      P2x: js.Any,
      P2y: js.Any,
      P3x: js.Any,
      P3y: js.Any,
      P4x: js.Any,
      P4y: js.Any
    ): X = js.native
    
    @JSImport("konva", "default.Path.getPointOnEllipticalArc")
    @js.native
    def getPointOnEllipticalArc(cx: js.Any, cy: js.Any, rx: js.Any, ry: js.Any, theta: js.Any, psi: js.Any): XY = js.native
    
    @JSImport("konva", "default.Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any): js.Any = js.native
    @JSImport("konva", "default.Path.getPointOnLine")
    @js.native
    def getPointOnLine(
      dist: js.Any,
      P1x: js.Any,
      P1y: js.Any,
      P2x: js.Any,
      P2y: js.Any,
      fromX: js.UndefOr[scala.Nothing],
      fromY: js.Any
    ): js.Any = js.native
    @JSImport("konva", "default.Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any): js.Any = js.native
    @JSImport("konva", "default.Path.getPointOnLine")
    @js.native
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any, fromY: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Path.getPointOnQuadraticBezier")
    @js.native
    def getPointOnQuadraticBezier(pct: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, P3x: js.Any, P3y: js.Any): X = js.native
    
    @JSImport("konva", "default.Path.parsePathData")
    @js.native
    def parsePathData(data: js.Any): js.Array[_] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Path")
  @js.native
  class PathCls () extends Path {
    def this(config: PathConfig) = this()
  }
  
  @JSImport("konva", "default.Rect")
  @js.native
  val Rect: Instantiable0[typings.konva.rectMod.Rect] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Rect")
  @js.native
  class RectCls ()
    extends typings.konva.rectMod.Rect
  
  @JSImport("konva", "default.RegularPolygon")
  @js.native
  val RegularPolygon: Instantiable0[typings.konva.regularPolygonMod.RegularPolygon] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.RegularPolygon")
  @js.native
  class RegularPolygonCls ()
    extends typings.konva.regularPolygonMod.RegularPolygon
  
  @JSImport("konva", "default.Ring")
  @js.native
  val Ring: Instantiable0[typings.konva.ringMod.Ring] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Ring")
  @js.native
  class RingCls ()
    extends typings.konva.ringMod.Ring
  
  @JSImport("konva", "default.Shape")
  @js.native
  val Shape: Instantiable1[
    /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
    typings.konva.shapeMod.Shape[ShapeConfig]
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Shape")
  @js.native
  class ShapeCls[Config /* <: ShapeConfig */] ()
    extends typings.konva.shapeMod.Shape[Config] {
    def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
  }
  
  @JSImport("konva", "default.Sprite")
  @js.native
  val Sprite: Instantiable1[/* config */ js.Any, typings.konva.spriteMod.Sprite] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Sprite")
  @js.native
  class SpriteCls protected ()
    extends typings.konva.spriteMod.Sprite {
    def this(config: js.Any) = this()
  }
  
  @JSImport("konva", "default.Stage")
  @js.native
  val Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Stage")
  @js.native
  class StageCls protected ()
    extends typings.konva.stageMod.Stage {
    def this(config: StageConfig) = this()
  }
  
  @JSImport("konva", "default.Star")
  @js.native
  val Star: Instantiable0[typings.konva.starMod.Star] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Star")
  @js.native
  class StarCls ()
    extends typings.konva.starMod.Star
  
  @JSImport("konva", "default.Tag")
  @js.native
  val Tag: Instantiable0[typings.konva.labelMod.Tag] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Tag")
  @js.native
  class TagCls ()
    extends typings.konva.labelMod.Tag
  
  @JSImport("konva", "default.Text")
  @js.native
  val Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.textMod.Text] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Text")
  @js.native
  class TextCls ()
    extends typings.konva.textMod.Text {
    def this(config: TextConfig) = this()
  }
  
  @JSImport("konva", "default.TextPath")
  @js.native
  val TextPath: Instantiable1[/* config */ js.UndefOr[TextPathConfig], typings.konva.textPathMod.TextPath] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.TextPath")
  @js.native
  class TextPathCls ()
    extends typings.konva.textPathMod.TextPath {
    def this(config: TextPathConfig) = this()
  }
  
  @JSImport("konva", "default.Transform")
  @js.native
  val Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Transform")
  @js.native
  class TransformCls ()
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
  class TransformerCls ()
    extends typings.konva.transformerMod.Transformer {
    def this(config: TransformerConfig) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Tween")
  @js.native
  class TweenCls protected () extends Tween {
    def this(config: TweenConfig) = this()
  }
  
  object Util {
    
    @JSImport("konva", "default.Util._assign")
    @js.native
    def assign[T, U](target: T, source: U): T with U = js.native
    
    @JSImport("konva", "default.Util._capitalize")
    @js.native
    def capitalize(str: String): String = js.native
    
    @JSImport("konva", "default.Util.cloneArray")
    @js.native
    def cloneArray(arr: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util.cloneObject")
    @js.native
    def cloneObject[Any](obj: Any): Any = js.native
    
    @JSImport("konva", "default.Util.colorToRGBA")
    @js.native
    def colorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util.createCanvasElement")
    @js.native
    def createCanvasElement(): HTMLCanvasElement = js.native
    
    @JSImport("konva", "default.Util.createImageElement")
    @js.native
    def createImageElement(): HTMLImageElement = js.native
    
    @JSImport("konva", "default.Util._degToRad")
    @js.native
    def degToRad(deg: Double): Double = js.native
    
    @JSImport("konva", "default.Util.each")
    @js.native
    def each(obj: js.Any, func: js.Any): Unit = js.native
    
    @JSImport("konva", "default.Util.error")
    @js.native
    def error(str: String): Unit = js.native
    
    @JSImport("konva", "default.Util._expandPoints")
    @js.native
    def expandPoints(p: js.Any, tension: js.Any): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util.extend")
    @js.native
    def extend(child: js.Any, parent: js.Any): Unit = js.native
    
    @JSImport("konva", "default.Util.get")
    @js.native
    def get(`val`: js.Any, `def`: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Util._getControlPoints")
    @js.native
    def getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util._getFirstPointerId")
    @js.native
    def getFirstPointerId(evt: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Util._getProjectionToLine")
    @js.native
    def getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d = js.native
    
    @JSImport("konva", "default.Util._getProjectionToSegment")
    @js.native
    def getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util.getRGB")
    @js.native
    def getRGB(color: String): RGB = js.native
    
    @JSImport("konva", "default.Util.getRandomColor")
    @js.native
    def getRandomColor(): String = js.native
    
    @JSImport("konva", "default.Util._getRotation")
    @js.native
    def getRotation(radians: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Util.haveIntersection")
    @js.native
    def haveIntersection(r1: IRect, r2: IRect): Boolean = js.native
    
    @JSImport("konva", "default.Util._hex3ColorToRGBA")
    @js.native
    def hex3ColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util._hex6ColorToRGBA")
    @js.native
    def hex6ColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util._hexToRgb")
    @js.native
    def hexToRgb(hex: String): RGB = js.native
    
    @JSImport("konva", "default.Util._hslColorToRGBA")
    @js.native
    def hslColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util._inRange")
    @js.native
    def inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean = js.native
    
    @JSImport("konva", "default.Util._isArray")
    @js.native
    def isArray(obj: js.Any): /* is std.Array<any> */ Boolean = js.native
    
    @JSImport("konva", "default.Util._isBoolean")
    @js.native
    def isBoolean(obj: js.Any): /* is boolean */ Boolean = js.native
    
    @JSImport("konva", "default.Util._isElement")
    @js.native
    def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
    
    @JSImport("konva", "default.Util._isFunction")
    @js.native
    def isFunction(obj: js.Any): Boolean = js.native
    
    @JSImport("konva", "default.Util._isInDocument")
    @js.native
    def isInDocument(el: js.Any): Boolean = js.native
    
    @JSImport("konva", "default.Util._isNumber")
    @js.native
    def isNumber(obj: js.Any): /* is number */ Boolean = js.native
    
    @JSImport("konva", "default.Util.isObject")
    @js.native
    def isObject(`val`: js.Any): /* is std.Object */ Boolean = js.native
    
    @JSImport("konva", "default.Util._isPlainObject")
    @js.native
    def isPlainObject(obj: js.Any): Boolean = js.native
    
    @JSImport("konva", "default.Util._isString")
    @js.native
    def isString(obj: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("konva", "default.Util.isValidSelector")
    @js.native
    def isValidSelector(selector: js.Any): Boolean = js.native
    
    @JSImport("konva", "default.Util._namedColorToRBA")
    @js.native
    def namedColorToRBA(str: String): A = js.native
    
    @JSImport("konva", "default.Util._prepareArrayForTween")
    @js.native
    def prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util._prepareToStringify")
    @js.native
    def prepareToStringify(obj: js.Any): js.Any = js.native
    
    @JSImport("konva", "default.Util._radToDeg")
    @js.native
    def radToDeg(rad: Double): Double = js.native
    
    @JSImport("konva", "default.Util.requestAnimFrame")
    @js.native
    def requestAnimFrame(callback: js.Function): Unit = js.native
    
    @JSImport("konva", "default.Util._rgbColorToRGBA")
    @js.native
    def rgbColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util._rgbToHex")
    @js.native
    def rgbToHex(r: Double, g: Double, b: Double): String = js.native
    
    @JSImport("konva", "default.Util._rgbaColorToRGBA")
    @js.native
    def rgbaColorToRGBA(str: String): RGBA = js.native
    
    @JSImport("konva", "default.Util._sign")
    @js.native
    def sign(number: Double): `1` | `0` | `-1` = js.native
    
    @JSImport("konva", "default.Util._simplifyArray")
    @js.native
    def simplifyArray(arr: js.Array[_]): js.Array[_] = js.native
    
    @JSImport("konva", "default.Util._urlToImage")
    @js.native
    def urlToImage(url: String, callback: js.Function): Unit = js.native
    
    @JSImport("konva", "default.Util.warn")
    @js.native
    def warn(str: String): Unit = js.native
    
    @JSImport("konva", "default.Util.throw")
    @js.native
    def `throw`(str: String): scala.Nothing = js.native
  }
  
  @JSImport("konva", "default.Wedge")
  @js.native
  val Wedge: Instantiable0[typings.konva.wedgeMod.Wedge] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Wedge")
  @js.native
  class WedgeCls ()
    extends typings.konva.wedgeMod.Wedge
  
  @JSImport("konva", "default.angleDeg")
  @js.native
  def angleDeg: Boolean = js.native
  @scala.inline
  def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.dragButtons")
  @js.native
  def dragButtons: js.Array[Double] = js.native
  @scala.inline
  def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.dragDistance")
  @js.native
  def dragDistance: Double = js.native
  @scala.inline
  def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.hitOnDragEnabled")
  @js.native
  def hitOnDragEnabled: Boolean = js.native
  @scala.inline
  def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.isDragReady")
  @js.native
  def isDragReady(): Boolean = js.native
  
  @JSImport("konva", "default.isDragging")
  @js.native
  def isDragging(): Boolean = js.native
  
  @JSImport("konva", "default.pixelRatio")
  @js.native
  def pixelRatio: Double = js.native
  @scala.inline
  def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.showWarnings")
  @js.native
  def showWarnings: Boolean = js.native
  @scala.inline
  def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("konva", "default.stages")
  @js.native
  val stages: js.Array[typings.konva.stageMod.Stage] = js.native
  
  object Tween
}
