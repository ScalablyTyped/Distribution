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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("konva", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  object Animation {
    
    @JSImport("konva", "default.Animation")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addAnimation(anim: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_addAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def animationLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_animationLoop")().asInstanceOf[Unit]
    
    @JSImport("konva", "default.Animation.animations")
    @js.native
    def animations: js.Array[js.Any] = js.native
    @scala.inline
    def animations_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animations")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def handleAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_handleAnimation")().asInstanceOf[Unit]
    
    @scala.inline
    def removeAnimation(anim: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def runFrames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_runFrames")().asInstanceOf[Unit]
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
    
    @JSImport("konva", "default.Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def mapMethod(methodName: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_mapMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def mapMethods(constructor: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mapMethods")(constructor.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): typings.konva.utilMod.Collection[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCollection")(arr.asInstanceOf[js.Any]).asInstanceOf[typings.konva.utilMod.Collection[ChildNode]]
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
    
    @scala.inline
    def drag(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_drag")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva", "default.DD._dragElements")
    @js.native
    def dragElements: Map[Double, DragStatus] = js.native
    
    @scala.inline
    def dragElements_=(x: Map[Double, DragStatus]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_dragElements")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def endDragAfter(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragAfter")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def endDragBefore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")().asInstanceOf[Unit]
    @scala.inline
    def endDragBefore(evt: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_endDragBefore")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @JSImport("konva", "default.Easings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def BackEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def BackEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def BackEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BackEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def BounceEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def BounceEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def BounceEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("BounceEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def EaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def EaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def EaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("EaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def ElasticEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def ElasticEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def ElasticEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any, a: js.Any, p: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ElasticEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def Linear(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Linear")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def StrongEaseIn(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseIn")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def StrongEaseInOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseInOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def StrongEaseOut(t: js.Any, b: js.Any, c: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("StrongEaseOut")(t.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
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
    @scala.inline
    def Blur(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Blur")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Blur_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Blur")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Brighten")
    @js.native
    def Brighten: Filter = js.native
    @scala.inline
    def Brighten(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Brighten")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Brighten_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brighten")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Contrast")
    @js.native
    def Contrast: Filter = js.native
    @scala.inline
    def Contrast(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Contrast")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Contrast_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Contrast")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Emboss")
    @js.native
    def Emboss: Filter = js.native
    @scala.inline
    def Emboss(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Emboss")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Emboss_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emboss")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Enhance")
    @js.native
    def Enhance: Filter = js.native
    @scala.inline
    def Enhance(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Enhance")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Enhance_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enhance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Grayscale")
    @js.native
    def Grayscale: Filter = js.native
    @scala.inline
    def Grayscale(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Grayscale")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Grayscale_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Grayscale")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.HSL")
    @js.native
    def HSL: Filter = js.native
    @scala.inline
    def HSL(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HSL")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def HSL_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSL")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.HSV")
    @js.native
    def HSV: Filter = js.native
    @scala.inline
    def HSV(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HSV")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def HSV_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HSV")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Invert")
    @js.native
    def Invert: Filter = js.native
    @scala.inline
    def Invert(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Invert")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Invert_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invert")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Kaleidoscope")
    @js.native
    def Kaleidoscope: Filter = js.native
    @scala.inline
    def Kaleidoscope(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Kaleidoscope")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Kaleidoscope_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Kaleidoscope")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Mask")
    @js.native
    def Mask: Filter = js.native
    @scala.inline
    def Mask(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Mask")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Mask_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mask")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Noise")
    @js.native
    def Noise: Filter = js.native
    @scala.inline
    def Noise(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Noise")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Noise_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Noise")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Pixelate")
    @js.native
    def Pixelate: Filter = js.native
    @scala.inline
    def Pixelate(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Pixelate")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Pixelate_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixelate")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Posterize")
    @js.native
    def Posterize: Filter = js.native
    @scala.inline
    def Posterize(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Posterize")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Posterize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Posterize")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.RGB")
    @js.native
    def RGB: Filter = js.native
    @scala.inline
    def RGB(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RGB")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva", "default.Filters.RGBA")
    @js.native
    def RGBA: Filter = js.native
    @scala.inline
    def RGBA(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBA")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def RGBA_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBA")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def RGB_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGB")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Sepia")
    @js.native
    def Sepia: Filter = js.native
    @scala.inline
    def Sepia(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Sepia")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Sepia_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sepia")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Solarize")
    @js.native
    def Solarize: Filter = js.native
    @scala.inline
    def Solarize(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Solarize")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Solarize_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solarize")(x.asInstanceOf[js.Any])
    
    @JSImport("konva", "default.Filters.Threshold")
    @js.native
    def Threshold: Filter = js.native
    @scala.inline
    def Threshold(imageData: ImageData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Threshold")(imageData.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
    
    @JSImport("konva", "default.Image")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromURL(url: js.Any, callback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
    
    @JSImport("konva", "default.Node")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(data: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def create(data: js.Any, container: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def createNode(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def createNode(obj: js.Any, container: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("konva", "default.Node")
  @js.native
  class NodeCls[Config /* <: NodeConfig */] () extends Node[Config] {
    def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any) = this()
  }
  
  object Path {
    
    @JSImport("konva", "default.Path")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def calcLength(x: js.Any, y: js.Any, cmd: js.Any, points: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("calcLength")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
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
    ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertEndpointToCenterParameterization")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], fa.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], psiDeg.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def getLineLength(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineLength")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
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
    ): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnCubicBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any], P4x.asInstanceOf[js.Any], P4y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    @scala.inline
    def getPointOnEllipticalArc(cx: js.Any, cy: js.Any, rx: js.Any, ry: js.Any, theta: js.Any, psi: js.Any): XY = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnEllipticalArc")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], theta.asInstanceOf[js.Any], psi.asInstanceOf[js.Any])).asInstanceOf[XY]
    
    @scala.inline
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: js.Any, fromY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getPointOnLine(dist: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, fromX: Unit, fromY: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnLine")(dist.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], fromX.asInstanceOf[js.Any], fromY.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getPointOnQuadraticBezier(pct: js.Any, P1x: js.Any, P1y: js.Any, P2x: js.Any, P2y: js.Any, P3x: js.Any, P3y: js.Any): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointOnQuadraticBezier")(pct.asInstanceOf[js.Any], P1x.asInstanceOf[js.Any], P1y.asInstanceOf[js.Any], P2x.asInstanceOf[js.Any], P2y.asInstanceOf[js.Any], P3x.asInstanceOf[js.Any], P3y.asInstanceOf[js.Any])).asInstanceOf[X]
    
    @scala.inline
    def parsePathData(data: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
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
    
    @JSImport("konva", "default.Util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("_assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
    
    @scala.inline
    def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def cloneArray(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def cloneObject[Any](obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    def colorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def createCanvasElement(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasElement")().asInstanceOf[HTMLCanvasElement]
    
    @scala.inline
    def createImageElement(): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageElement")().asInstanceOf[HTMLImageElement]
    
    @scala.inline
    def degToRad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_degToRad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def each(obj: js.Any, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def error(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def expandPoints(p: js.Any, tension: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_expandPoints")(p.asInstanceOf[js.Any], tension.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def extend(child: js.Any, parent: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def get(`val`: js.Any, `def`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`val`.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getControlPoints(x0: js.Any, y0: js.Any, x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, t: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getControlPoints")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def getFirstPointerId(evt: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getFirstPointerId")(evt.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getProjectionToLine(pt: Vector2d, line: js.Any, isClosed: js.Any): Vector2d = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToLine")(pt.asInstanceOf[js.Any], line.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[Vector2d]
    
    @scala.inline
    def getProjectionToSegment(x1: js.Any, y1: js.Any, x2: js.Any, y2: js.Any, x3: js.Any, y3: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectionToSegment")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def getRGB(color: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(color.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    @scala.inline
    def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
    
    @scala.inline
    def getRotation(radians: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRotation")(radians.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def haveIntersection(r1: IRect, r2: IRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("haveIntersection")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def hex3ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex3ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def hex6ColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hex6ColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def hexToRgb(hex: String): RGB = ^.asInstanceOf[js.Dynamic].applyDynamic("_hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[RGB]
    
    @scala.inline
    def hslColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_hslColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def inRange(`val`: js.Any, left: js.Any, right: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inRange")(`val`.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isArray(obj: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
    
    @scala.inline
    def isBoolean(obj: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    @scala.inline
    def isElement(obj: js.Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
    
    @scala.inline
    def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isInDocument(el: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isInDocument")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isNumber(obj: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    @scala.inline
    def isObject(`val`: js.Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
    
    @scala.inline
    def isPlainObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isString(obj: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def isValidSelector(selector: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def namedColorToRBA(str: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("_namedColorToRBA")(str.asInstanceOf[js.Any]).asInstanceOf[A]
    
    @scala.inline
    def prepareArrayForTween(startArray: js.Any, endArray: js.Any, isClosed: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_prepareArrayForTween")(startArray.asInstanceOf[js.Any], endArray.asInstanceOf[js.Any], isClosed.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def prepareToStringify(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_prepareToStringify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def radToDeg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_radToDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def requestAnimFrame(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAnimFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def rgbColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def rgbToHex(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_rgbToHex")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def rgbaColorToRGBA(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("_rgbaColorToRGBA")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
    
    @scala.inline
    def sign(number: Double): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("_sign")(number.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
    
    @scala.inline
    def simplifyArray(arr: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_simplifyArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def `throw`(str: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throw")(str.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
    
    @scala.inline
    def urlToImage(url: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_urlToImage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def warn(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  
  @scala.inline
  def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
  
  @scala.inline
  def isDragging(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Boolean]
  
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
