package typings.konva

import typings.konva.anon.Width
import typings.konva.anon.Y
import typings.konva.canvasMod.HitCanvas
import typings.konva.canvasMod.SceneCanvas
import typings.konva.contextMod.Context
import typings.konva.konvaStrings.auto
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.Vector2d
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod {
  
  @JSImport("konva/types/Shape", "Shape")
  @js.native
  class Shape[Config /* <: ShapeConfig */] () extends Node[Config] {
    def this(config: Config) = this()
    
    def __getFillPattern(): CanvasPattern = js.native
    
    def __getLinearGradient(): CanvasGradient = js.native
    
    def __getRadialGradient(): CanvasGradient = js.native
    
    var _centroid: Boolean = js.native
    
    def _fillFunc(ctx: Context): Unit = js.native
    
    def _fillFuncHit(ctx: Context): Unit = js.native
    
    def _getFillPattern(): js.Any = js.native
    
    def _getLinearGradient(): js.Any = js.native
    
    def _getRadialGradient(): js.Any = js.native
    
    def _getShadowRGBA(): String = js.native
    
    def _hasShadow(): Boolean = js.native
    
    def _strokeFunc(ctx: Context): Unit = js.native
    
    def _strokeFuncHit(ctx: Context): Unit = js.native
    
    def _useBufferCanvas(): Boolean = js.native
    def _useBufferCanvas(forceFill: Boolean): Boolean = js.native
    
    var colorKey: String = js.native
    
    def dash(): js.Array[Double] = js.native
    def dash(v: js.Array[Double]): this.type = js.native
    
    def dashEnabled(): Boolean = js.native
    def dashEnabled(v: Boolean): this.type = js.native
    @JSName("dashEnabled")
    var dashEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def dashOffset(): Double = js.native
    def dashOffset(v: Double): this.type = js.native
    @JSName("dashOffset")
    var dashOffset_Original: GetSet[Double, this.type] = js.native
    
    @JSName("dash")
    var dash_Original: GetSet[js.Array[Double], this.type] = js.native
    
    def drawHit(can: HitCanvas): this.type = js.native
    def drawHit(can: HitCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def drawHitFromCache(): this.type = js.native
    def drawHitFromCache(alphaThreshold: Double): this.type = js.native
    
    def drawScene(can: SceneCanvas): this.type = js.native
    def drawScene(can: SceneCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def fill(): String = js.native
    def fill(v: String): this.type = js.native
    
    def fillEnabled(): Boolean = js.native
    def fillEnabled(v: Boolean): this.type = js.native
    @JSName("fillEnabled")
    var fillEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def fillLinearGradientColorStops(): js.Array[Double | String] = js.native
    def fillLinearGradientColorStops(v: js.Array[Double | String]): this.type = js.native
    @JSName("fillLinearGradientColorStops")
    var fillLinearGradientColorStops_Original: GetSet[js.Array[Double | String], this.type] = js.native
    
    def fillLinearGradientEndPoint(): Vector2d = js.native
    def fillLinearGradientEndPoint(v: Vector2d): this.type = js.native
    
    def fillLinearGradientEndPointX(): Double = js.native
    def fillLinearGradientEndPointX(v: Double): this.type = js.native
    @JSName("fillLinearGradientEndPointX")
    var fillLinearGradientEndPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillLinearGradientEndPointY(): Double = js.native
    def fillLinearGradientEndPointY(v: Double): this.type = js.native
    @JSName("fillLinearGradientEndPointY")
    var fillLinearGradientEndPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillLinearGradientEndPoint")
    var fillLinearGradientEndPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillLinearGradientStartPoint(): Vector2d = js.native
    def fillLinearGradientStartPoint(v: Vector2d): this.type = js.native
    
    def fillLinearGradientStartPointX(): Double = js.native
    def fillLinearGradientStartPointX(v: Double): this.type = js.native
    @JSName("fillLinearGradientStartPointX")
    var fillLinearGradientStartPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillLinearGradientStartPointY(): Double = js.native
    def fillLinearGradientStartPointY(v: Double): this.type = js.native
    @JSName("fillLinearGradientStartPointY")
    var fillLinearGradientStartPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillLinearGradientStartPoint")
    var fillLinearGradientStartPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillLinearRadialEndPoint(): Vector2d = js.native
    def fillLinearRadialEndPoint(v: Vector2d): this.type = js.native
    
    def fillLinearRadialEndPointX(): Double = js.native
    def fillLinearRadialEndPointX(v: Double): this.type = js.native
    @JSName("fillLinearRadialEndPointX")
    var fillLinearRadialEndPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillLinearRadialEndPointY(): Double = js.native
    def fillLinearRadialEndPointY(v: Double): this.type = js.native
    @JSName("fillLinearRadialEndPointY")
    var fillLinearRadialEndPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillLinearRadialEndPoint")
    var fillLinearRadialEndPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillLinearRadialStartPoint(): Vector2d = js.native
    def fillLinearRadialStartPoint(v: Vector2d): this.type = js.native
    
    def fillLinearRadialStartPointX(): Double = js.native
    def fillLinearRadialStartPointX(v: Double): this.type = js.native
    @JSName("fillLinearRadialStartPointX")
    var fillLinearRadialStartPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillLinearRadialStartPointY(): Double = js.native
    def fillLinearRadialStartPointY(v: Double): this.type = js.native
    @JSName("fillLinearRadialStartPointY")
    var fillLinearRadialStartPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillLinearRadialStartPoint")
    var fillLinearRadialStartPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillPatternImage(): HTMLImageElement = js.native
    def fillPatternImage(v: HTMLImageElement): this.type = js.native
    @JSName("fillPatternImage")
    var fillPatternImage_Original: GetSet[HTMLImageElement, this.type] = js.native
    
    def fillPatternOffset(): Vector2d = js.native
    def fillPatternOffset(v: Vector2d): this.type = js.native
    
    def fillPatternOffsetX(): Double = js.native
    def fillPatternOffsetX(v: Double): this.type = js.native
    @JSName("fillPatternOffsetX")
    var fillPatternOffsetX_Original: GetSet[Double, this.type] = js.native
    
    def fillPatternOffsetY(): Double = js.native
    def fillPatternOffsetY(v: Double): this.type = js.native
    @JSName("fillPatternOffsetY")
    var fillPatternOffsetY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillPatternOffset")
    var fillPatternOffset_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillPatternRepeat(): String = js.native
    def fillPatternRepeat(v: String): this.type = js.native
    @JSName("fillPatternRepeat")
    var fillPatternRepeat_Original: GetSet[String, this.type] = js.native
    
    def fillPatternRotation(): Double = js.native
    def fillPatternRotation(v: Double): this.type = js.native
    @JSName("fillPatternRotation")
    var fillPatternRotation_Original: GetSet[Double, this.type] = js.native
    
    def fillPatternScale(): Vector2d = js.native
    def fillPatternScale(v: Vector2d): this.type = js.native
    
    def fillPatternScaleX(): Double = js.native
    def fillPatternScaleX(v: Double): this.type = js.native
    @JSName("fillPatternScaleX")
    var fillPatternScaleX_Original: GetSet[Double, this.type] = js.native
    
    def fillPatternScaleY(): Double = js.native
    def fillPatternScaleY(v: Double): this.type = js.native
    @JSName("fillPatternScaleY")
    var fillPatternScaleY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillPatternScale")
    var fillPatternScale_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillPatternX(): Double = js.native
    def fillPatternX(v: Double): this.type = js.native
    @JSName("fillPatternX")
    var fillPatternX_Original: GetSet[Double, this.type] = js.native
    
    def fillPatternY(): Double = js.native
    def fillPatternY(v: Double): this.type = js.native
    @JSName("fillPatternY")
    var fillPatternY_Original: GetSet[Double, this.type] = js.native
    
    def fillPriority(): String = js.native
    def fillPriority(v: String): this.type = js.native
    @JSName("fillPriority")
    var fillPriority_Original: GetSet[String, this.type] = js.native
    
    def fillRadialGradientColorStops(): js.Array[Double | String] = js.native
    def fillRadialGradientColorStops(v: js.Array[Double | String]): this.type = js.native
    @JSName("fillRadialGradientColorStops")
    var fillRadialGradientColorStops_Original: GetSet[js.Array[Double | String], this.type] = js.native
    
    def fillRadialGradientEndPoint(): Vector2d = js.native
    def fillRadialGradientEndPoint(v: Vector2d): this.type = js.native
    
    def fillRadialGradientEndPointX(): Double = js.native
    def fillRadialGradientEndPointX(v: Double): this.type = js.native
    @JSName("fillRadialGradientEndPointX")
    var fillRadialGradientEndPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillRadialGradientEndPointY(): Double = js.native
    def fillRadialGradientEndPointY(v: Double): this.type = js.native
    @JSName("fillRadialGradientEndPointY")
    var fillRadialGradientEndPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillRadialGradientEndPoint")
    var fillRadialGradientEndPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillRadialGradientEndRadius(): Double = js.native
    def fillRadialGradientEndRadius(v: Double): this.type = js.native
    @JSName("fillRadialGradientEndRadius")
    var fillRadialGradientEndRadius_Original: GetSet[Double, this.type] = js.native
    
    def fillRadialGradientStartPoint(): Vector2d = js.native
    def fillRadialGradientStartPoint(v: Vector2d): this.type = js.native
    
    def fillRadialGradientStartPointX(): Double = js.native
    def fillRadialGradientStartPointX(v: Double): this.type = js.native
    @JSName("fillRadialGradientStartPointX")
    var fillRadialGradientStartPointX_Original: GetSet[Double, this.type] = js.native
    
    def fillRadialGradientStartPointY(): Double = js.native
    def fillRadialGradientStartPointY(v: Double): this.type = js.native
    @JSName("fillRadialGradientStartPointY")
    var fillRadialGradientStartPointY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fillRadialGradientStartPoint")
    var fillRadialGradientStartPoint_Original: GetSet[Vector2d, this.type] = js.native
    
    def fillRadialGradientStartRadius(): Double = js.native
    def fillRadialGradientStartRadius(v: Double): this.type = js.native
    @JSName("fillRadialGradientStartRadius")
    var fillRadialGradientStartRadius_Original: GetSet[Double, this.type] = js.native
    
    @JSName("fill")
    var fill_Original: GetSet[String, this.type] = js.native
    
    def getCanvas(): SceneCanvas = js.native
    
    def getClientRect(config: ShapegGetClientRectConfig): Y = js.native
    
    def getContext(): Context = js.native
    
    def getHitFunc(): js.Any = js.native
    
    def getSceneFunc(): js.Any = js.native
    
    def getSelfRect(): Width = js.native
    
    def getShadowRGBA(): js.Any = js.native
    
    def getStrokeHitEnabled(): Boolean = js.native
    
    def hasFill(): js.Any = js.native
    
    def hasHitStroke(): js.Any = js.native
    
    def hasPointerCapture(pointerId: Double): Boolean = js.native
    
    def hasShadow(): js.Any = js.native
    
    def hasStroke(): js.Any = js.native
    
    def hitFunc(): ShapeConfigHandler[this.type] = js.native
    def hitFunc(v: ShapeConfigHandler[this.type]): this.type = js.native
    @JSName("hitFunc")
    var hitFunc_Original: GetSet[ShapeConfigHandler[this.type], this.type] = js.native
    
    def hitStrokeWidth(): Double | auto = js.native
    def hitStrokeWidth(v: Double): this.type = js.native
    @JSName("hitStrokeWidth")
    var hitStrokeWidth_Original: GetSet[Double | auto, this.type] = js.native
    @JSName("hitStrokeWidth")
    def hitStrokeWidth_auto(v: auto): this.type = js.native
    
    def intersects(point: js.Any): Boolean = js.native
    
    def lineCap(): LineCap = js.native
    def lineCap(v: LineCap): this.type = js.native
    @JSName("lineCap")
    var lineCap_Original: GetSet[LineCap, this.type] = js.native
    
    def lineJoin(): LineJoin = js.native
    def lineJoin(v: LineJoin): this.type = js.native
    @JSName("lineJoin")
    var lineJoin_Original: GetSet[LineJoin, this.type] = js.native
    
    def perfectDrawEnabled(): Boolean = js.native
    def perfectDrawEnabled(v: Boolean): this.type = js.native
    @JSName("perfectDrawEnabled")
    var perfectDrawEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def releaseCapture(pointerId: Double): Unit = js.native
    
    def sceneFunc(): ShapeConfigHandler[this.type] = js.native
    def sceneFunc(v: ShapeConfigHandler[this.type]): this.type = js.native
    @JSName("sceneFunc")
    var sceneFunc_Original: GetSet[ShapeConfigHandler[this.type], this.type] = js.native
    
    def setPointerCapture(pointerId: Double): Unit = js.native
    
    def setStrokeHitEnabled(`val`: Double): Unit = js.native
    
    def shadowBlur(): Double = js.native
    def shadowBlur(v: Double): this.type = js.native
    @JSName("shadowBlur")
    var shadowBlur_Original: GetSet[Double, this.type] = js.native
    
    def shadowColor(): String = js.native
    def shadowColor(v: String): this.type = js.native
    @JSName("shadowColor")
    var shadowColor_Original: GetSet[String, this.type] = js.native
    
    def shadowEnabled(): Boolean = js.native
    def shadowEnabled(v: Boolean): this.type = js.native
    @JSName("shadowEnabled")
    var shadowEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def shadowForStrokeEnabled(): Boolean = js.native
    def shadowForStrokeEnabled(v: Boolean): this.type = js.native
    @JSName("shadowForStrokeEnabled")
    var shadowForStrokeEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def shadowOffset(): Vector2d = js.native
    def shadowOffset(v: Vector2d): this.type = js.native
    
    def shadowOffsetX(): Double = js.native
    def shadowOffsetX(v: Double): this.type = js.native
    @JSName("shadowOffsetX")
    var shadowOffsetX_Original: GetSet[Double, this.type] = js.native
    
    def shadowOffsetY(): Double = js.native
    def shadowOffsetY(v: Double): this.type = js.native
    @JSName("shadowOffsetY")
    var shadowOffsetY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("shadowOffset")
    var shadowOffset_Original: GetSet[Vector2d, this.type] = js.native
    
    def shadowOpacity(): Double = js.native
    def shadowOpacity(v: Double): this.type = js.native
    @JSName("shadowOpacity")
    var shadowOpacity_Original: GetSet[Double, this.type] = js.native
    
    def stroke(): String = js.native
    def stroke(v: String): this.type = js.native
    
    def strokeEnabled(): Boolean = js.native
    def strokeEnabled(v: Boolean): this.type = js.native
    @JSName("strokeEnabled")
    var strokeEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def strokeHitEnabled(): Boolean = js.native
    def strokeHitEnabled(v: Boolean): this.type = js.native
    @JSName("strokeHitEnabled")
    var strokeHitEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def strokeLinearGradientColorStops(): js.Array[Double | String] = js.native
    def strokeLinearGradientColorStops(v: js.Array[Double | String]): this.type = js.native
    @JSName("strokeLinearGradientColorStops")
    var strokeLinearGradientColorStops_Original: GetSet[js.Array[Double | String], this.type] = js.native
    
    def strokeScaleEnabled(): Boolean = js.native
    def strokeScaleEnabled(v: Boolean): this.type = js.native
    @JSName("strokeScaleEnabled")
    var strokeScaleEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def strokeWidth(): Double = js.native
    def strokeWidth(v: Double): this.type = js.native
    @JSName("strokeWidth")
    var strokeWidth_Original: GetSet[Double, this.type] = js.native
    
    @JSName("stroke")
    var stroke_Original: GetSet[String, this.type] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.konva.konvaStrings.butt
    - typings.konva.konvaStrings.round
    - typings.konva.konvaStrings.square
  */
  trait LineCap extends StObject
  object LineCap {
    
    inline def butt: typings.konva.konvaStrings.butt = "butt".asInstanceOf[typings.konva.konvaStrings.butt]
    
    inline def round: typings.konva.konvaStrings.round = "round".asInstanceOf[typings.konva.konvaStrings.round]
    
    inline def square: typings.konva.konvaStrings.square = "square".asInstanceOf[typings.konva.konvaStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.konva.konvaStrings.round
    - typings.konva.konvaStrings.bevel
    - typings.konva.konvaStrings.miter
  */
  trait LineJoin extends StObject
  object LineJoin {
    
    inline def bevel: typings.konva.konvaStrings.bevel = "bevel".asInstanceOf[typings.konva.konvaStrings.bevel]
    
    inline def miter: typings.konva.konvaStrings.miter = "miter".asInstanceOf[typings.konva.konvaStrings.miter]
    
    inline def round: typings.konva.konvaStrings.round = "round".asInstanceOf[typings.konva.konvaStrings.round]
  }
  
  trait ShapeConfig
    extends StObject
       with NodeConfig {
    
    var dash: js.UndefOr[js.Array[Double]] = js.undefined
    
    var dashEnabled: js.UndefOr[Boolean] = js.undefined
    
    var dashOffset: js.UndefOr[Double] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillEnabled: js.UndefOr[Boolean] = js.undefined
    
    var fillLinearGradientColorStops: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var fillLinearGradientEndPoint: js.UndefOr[Vector2d] = js.undefined
    
    var fillLinearGradientEndPointX: js.UndefOr[Double] = js.undefined
    
    var fillLinearGradientEndPointY: js.UndefOr[Double] = js.undefined
    
    var fillLinearGradientStartPoint: js.UndefOr[Vector2d] = js.undefined
    
    var fillLinearGradientStartPointX: js.UndefOr[Double] = js.undefined
    
    var fillLinearGradientStartPointY: js.UndefOr[Double] = js.undefined
    
    var fillPatternImage: js.UndefOr[HTMLImageElement] = js.undefined
    
    var fillPatternOffset: js.UndefOr[Vector2d] = js.undefined
    
    var fillPatternOffsetX: js.UndefOr[Double] = js.undefined
    
    var fillPatternOffsetY: js.UndefOr[Double] = js.undefined
    
    var fillPatternRepeat: js.UndefOr[String] = js.undefined
    
    var fillPatternRotation: js.UndefOr[Double] = js.undefined
    
    var fillPatternScale: js.UndefOr[Vector2d] = js.undefined
    
    var fillPatternScaleX: js.UndefOr[Double] = js.undefined
    
    var fillPatternScaleY: js.UndefOr[Double] = js.undefined
    
    var fillPatternX: js.UndefOr[Double] = js.undefined
    
    var fillPatternY: js.UndefOr[Double] = js.undefined
    
    var fillPriority: js.UndefOr[String] = js.undefined
    
    var fillRadialGradientColorStops: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var fillRadialGradientEndPoint: js.UndefOr[Vector2d] = js.undefined
    
    var fillRadialGradientEndPointX: js.UndefOr[Double] = js.undefined
    
    var fillRadialGradientEndPointY: js.UndefOr[Double] = js.undefined
    
    var fillRadialGradientEndRadius: js.UndefOr[Double] = js.undefined
    
    var fillRadialGradientStartPoint: js.UndefOr[Vector2d] = js.undefined
    
    var fillRadialGradientStartPointX: js.UndefOr[Double] = js.undefined
    
    var fillRadialGradientStartPointY: js.UndefOr[Double] = js.undefined
    
    var fillRadialGradientStartRadius: js.UndefOr[Double] = js.undefined
    
    var hitFunc: js.UndefOr[js.Function2[/* con */ Context, /* shape */ Shape[this.type], Unit]] = js.undefined
    
    var hitStrokeWidth: js.UndefOr[Double | String] = js.undefined
    
    var lineCap: js.UndefOr[LineCap] = js.undefined
    
    var lineJoin: js.UndefOr[LineJoin] = js.undefined
    
    var perfectDrawEnabled: js.UndefOr[Boolean] = js.undefined
    
    var sceneFunc: js.UndefOr[js.Function2[/* con */ Context, /* shape */ Shape[this.type], Unit]] = js.undefined
    
    var shadowBlur: js.UndefOr[Double] = js.undefined
    
    var shadowColor: js.UndefOr[String] = js.undefined
    
    var shadowEnabled: js.UndefOr[Boolean] = js.undefined
    
    var shadowForStrokeEnabled: js.UndefOr[Boolean] = js.undefined
    
    var shadowOffset: js.UndefOr[Vector2d] = js.undefined
    
    var shadowOffsetX: js.UndefOr[Double] = js.undefined
    
    var shadowOffsetY: js.UndefOr[Double] = js.undefined
    
    var shadowOpacity: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeEnabled: js.UndefOr[Boolean] = js.undefined
    
    var strokeHitEnabled: js.UndefOr[Boolean] = js.undefined
    
    var strokeScaleEnabled: js.UndefOr[Boolean] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object ShapeConfig {
    
    inline def apply(): ShapeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeConfig]
    }
    
    extension [Self <: ShapeConfig](x: Self) {
      
      inline def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
      
      inline def setDashEnabled(value: Boolean): Self = StObject.set(x, "dashEnabled", value.asInstanceOf[js.Any])
      
      inline def setDashEnabledUndefined: Self = StObject.set(x, "dashEnabled", js.undefined)
      
      inline def setDashOffset(value: Double): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
      
      inline def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
      
      inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
      
      inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value :_*))
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillEnabled(value: Boolean): Self = StObject.set(x, "fillEnabled", value.asInstanceOf[js.Any])
      
      inline def setFillEnabledUndefined: Self = StObject.set(x, "fillEnabled", js.undefined)
      
      inline def setFillLinearGradientColorStops(value: js.Array[Double | String]): Self = StObject.set(x, "fillLinearGradientColorStops", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientColorStopsUndefined: Self = StObject.set(x, "fillLinearGradientColorStops", js.undefined)
      
      inline def setFillLinearGradientColorStopsVarargs(value: (Double | String)*): Self = StObject.set(x, "fillLinearGradientColorStops", js.Array(value :_*))
      
      inline def setFillLinearGradientEndPoint(value: Vector2d): Self = StObject.set(x, "fillLinearGradientEndPoint", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientEndPointUndefined: Self = StObject.set(x, "fillLinearGradientEndPoint", js.undefined)
      
      inline def setFillLinearGradientEndPointX(value: Double): Self = StObject.set(x, "fillLinearGradientEndPointX", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientEndPointXUndefined: Self = StObject.set(x, "fillLinearGradientEndPointX", js.undefined)
      
      inline def setFillLinearGradientEndPointY(value: Double): Self = StObject.set(x, "fillLinearGradientEndPointY", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientEndPointYUndefined: Self = StObject.set(x, "fillLinearGradientEndPointY", js.undefined)
      
      inline def setFillLinearGradientStartPoint(value: Vector2d): Self = StObject.set(x, "fillLinearGradientStartPoint", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientStartPointUndefined: Self = StObject.set(x, "fillLinearGradientStartPoint", js.undefined)
      
      inline def setFillLinearGradientStartPointX(value: Double): Self = StObject.set(x, "fillLinearGradientStartPointX", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientStartPointXUndefined: Self = StObject.set(x, "fillLinearGradientStartPointX", js.undefined)
      
      inline def setFillLinearGradientStartPointY(value: Double): Self = StObject.set(x, "fillLinearGradientStartPointY", value.asInstanceOf[js.Any])
      
      inline def setFillLinearGradientStartPointYUndefined: Self = StObject.set(x, "fillLinearGradientStartPointY", js.undefined)
      
      inline def setFillPatternImage(value: HTMLImageElement): Self = StObject.set(x, "fillPatternImage", value.asInstanceOf[js.Any])
      
      inline def setFillPatternImageUndefined: Self = StObject.set(x, "fillPatternImage", js.undefined)
      
      inline def setFillPatternOffset(value: Vector2d): Self = StObject.set(x, "fillPatternOffset", value.asInstanceOf[js.Any])
      
      inline def setFillPatternOffsetUndefined: Self = StObject.set(x, "fillPatternOffset", js.undefined)
      
      inline def setFillPatternOffsetX(value: Double): Self = StObject.set(x, "fillPatternOffsetX", value.asInstanceOf[js.Any])
      
      inline def setFillPatternOffsetXUndefined: Self = StObject.set(x, "fillPatternOffsetX", js.undefined)
      
      inline def setFillPatternOffsetY(value: Double): Self = StObject.set(x, "fillPatternOffsetY", value.asInstanceOf[js.Any])
      
      inline def setFillPatternOffsetYUndefined: Self = StObject.set(x, "fillPatternOffsetY", js.undefined)
      
      inline def setFillPatternRepeat(value: String): Self = StObject.set(x, "fillPatternRepeat", value.asInstanceOf[js.Any])
      
      inline def setFillPatternRepeatUndefined: Self = StObject.set(x, "fillPatternRepeat", js.undefined)
      
      inline def setFillPatternRotation(value: Double): Self = StObject.set(x, "fillPatternRotation", value.asInstanceOf[js.Any])
      
      inline def setFillPatternRotationUndefined: Self = StObject.set(x, "fillPatternRotation", js.undefined)
      
      inline def setFillPatternScale(value: Vector2d): Self = StObject.set(x, "fillPatternScale", value.asInstanceOf[js.Any])
      
      inline def setFillPatternScaleUndefined: Self = StObject.set(x, "fillPatternScale", js.undefined)
      
      inline def setFillPatternScaleX(value: Double): Self = StObject.set(x, "fillPatternScaleX", value.asInstanceOf[js.Any])
      
      inline def setFillPatternScaleXUndefined: Self = StObject.set(x, "fillPatternScaleX", js.undefined)
      
      inline def setFillPatternScaleY(value: Double): Self = StObject.set(x, "fillPatternScaleY", value.asInstanceOf[js.Any])
      
      inline def setFillPatternScaleYUndefined: Self = StObject.set(x, "fillPatternScaleY", js.undefined)
      
      inline def setFillPatternX(value: Double): Self = StObject.set(x, "fillPatternX", value.asInstanceOf[js.Any])
      
      inline def setFillPatternXUndefined: Self = StObject.set(x, "fillPatternX", js.undefined)
      
      inline def setFillPatternY(value: Double): Self = StObject.set(x, "fillPatternY", value.asInstanceOf[js.Any])
      
      inline def setFillPatternYUndefined: Self = StObject.set(x, "fillPatternY", js.undefined)
      
      inline def setFillPriority(value: String): Self = StObject.set(x, "fillPriority", value.asInstanceOf[js.Any])
      
      inline def setFillPriorityUndefined: Self = StObject.set(x, "fillPriority", js.undefined)
      
      inline def setFillRadialGradientColorStops(value: js.Array[Double | String]): Self = StObject.set(x, "fillRadialGradientColorStops", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientColorStopsUndefined: Self = StObject.set(x, "fillRadialGradientColorStops", js.undefined)
      
      inline def setFillRadialGradientColorStopsVarargs(value: (Double | String)*): Self = StObject.set(x, "fillRadialGradientColorStops", js.Array(value :_*))
      
      inline def setFillRadialGradientEndPoint(value: Vector2d): Self = StObject.set(x, "fillRadialGradientEndPoint", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientEndPointUndefined: Self = StObject.set(x, "fillRadialGradientEndPoint", js.undefined)
      
      inline def setFillRadialGradientEndPointX(value: Double): Self = StObject.set(x, "fillRadialGradientEndPointX", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientEndPointXUndefined: Self = StObject.set(x, "fillRadialGradientEndPointX", js.undefined)
      
      inline def setFillRadialGradientEndPointY(value: Double): Self = StObject.set(x, "fillRadialGradientEndPointY", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientEndPointYUndefined: Self = StObject.set(x, "fillRadialGradientEndPointY", js.undefined)
      
      inline def setFillRadialGradientEndRadius(value: Double): Self = StObject.set(x, "fillRadialGradientEndRadius", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientEndRadiusUndefined: Self = StObject.set(x, "fillRadialGradientEndRadius", js.undefined)
      
      inline def setFillRadialGradientStartPoint(value: Vector2d): Self = StObject.set(x, "fillRadialGradientStartPoint", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientStartPointUndefined: Self = StObject.set(x, "fillRadialGradientStartPoint", js.undefined)
      
      inline def setFillRadialGradientStartPointX(value: Double): Self = StObject.set(x, "fillRadialGradientStartPointX", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientStartPointXUndefined: Self = StObject.set(x, "fillRadialGradientStartPointX", js.undefined)
      
      inline def setFillRadialGradientStartPointY(value: Double): Self = StObject.set(x, "fillRadialGradientStartPointY", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientStartPointYUndefined: Self = StObject.set(x, "fillRadialGradientStartPointY", js.undefined)
      
      inline def setFillRadialGradientStartRadius(value: Double): Self = StObject.set(x, "fillRadialGradientStartRadius", value.asInstanceOf[js.Any])
      
      inline def setFillRadialGradientStartRadiusUndefined: Self = StObject.set(x, "fillRadialGradientStartRadius", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHitFunc(value: (/* con */ Context, /* shape */ Shape[ShapeConfig]) => Unit): Self = StObject.set(x, "hitFunc", js.Any.fromFunction2(value))
      
      inline def setHitFuncUndefined: Self = StObject.set(x, "hitFunc", js.undefined)
      
      inline def setHitStrokeWidth(value: Double | String): Self = StObject.set(x, "hitStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setHitStrokeWidthUndefined: Self = StObject.set(x, "hitStrokeWidth", js.undefined)
      
      inline def setLineCap(value: LineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineJoin(value: LineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setPerfectDrawEnabled(value: Boolean): Self = StObject.set(x, "perfectDrawEnabled", value.asInstanceOf[js.Any])
      
      inline def setPerfectDrawEnabledUndefined: Self = StObject.set(x, "perfectDrawEnabled", js.undefined)
      
      inline def setSceneFunc(value: (/* con */ Context, /* shape */ Shape[ShapeConfig]) => Unit): Self = StObject.set(x, "sceneFunc", js.Any.fromFunction2(value))
      
      inline def setSceneFuncUndefined: Self = StObject.set(x, "sceneFunc", js.undefined)
      
      inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowEnabled(value: Boolean): Self = StObject.set(x, "shadowEnabled", value.asInstanceOf[js.Any])
      
      inline def setShadowEnabledUndefined: Self = StObject.set(x, "shadowEnabled", js.undefined)
      
      inline def setShadowForStrokeEnabled(value: Boolean): Self = StObject.set(x, "shadowForStrokeEnabled", value.asInstanceOf[js.Any])
      
      inline def setShadowForStrokeEnabledUndefined: Self = StObject.set(x, "shadowForStrokeEnabled", js.undefined)
      
      inline def setShadowOffset(value: Vector2d): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
      
      inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
      
      inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeEnabled(value: Boolean): Self = StObject.set(x, "strokeEnabled", value.asInstanceOf[js.Any])
      
      inline def setStrokeEnabledUndefined: Self = StObject.set(x, "strokeEnabled", js.undefined)
      
      inline def setStrokeHitEnabled(value: Boolean): Self = StObject.set(x, "strokeHitEnabled", value.asInstanceOf[js.Any])
      
      inline def setStrokeHitEnabledUndefined: Self = StObject.set(x, "strokeHitEnabled", js.undefined)
      
      inline def setStrokeScaleEnabled(value: Boolean): Self = StObject.set(x, "strokeScaleEnabled", value.asInstanceOf[js.Any])
      
      inline def setStrokeScaleEnabledUndefined: Self = StObject.set(x, "strokeScaleEnabled", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  type ShapeConfigHandler[TTarget] = js.Function2[/* ctx */ Context, /* shape */ TTarget, Unit]
  
  trait ShapegGetClientRectConfig extends StObject {
    
    var relativeTo: js.UndefOr[Node[NodeConfig]] = js.undefined
    
    var skipShadow: js.UndefOr[Boolean] = js.undefined
    
    var skipStroke: js.UndefOr[Boolean] = js.undefined
    
    var skipTransform: js.UndefOr[Boolean] = js.undefined
  }
  object ShapegGetClientRectConfig {
    
    inline def apply(): ShapegGetClientRectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapegGetClientRectConfig]
    }
    
    extension [Self <: ShapegGetClientRectConfig](x: Self) {
      
      inline def setRelativeTo(value: Node[NodeConfig]): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
      
      inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
      
      inline def setSkipShadow(value: Boolean): Self = StObject.set(x, "skipShadow", value.asInstanceOf[js.Any])
      
      inline def setSkipShadowUndefined: Self = StObject.set(x, "skipShadow", js.undefined)
      
      inline def setSkipStroke(value: Boolean): Self = StObject.set(x, "skipStroke", value.asInstanceOf[js.Any])
      
      inline def setSkipStrokeUndefined: Self = StObject.set(x, "skipStroke", js.undefined)
      
      inline def setSkipTransform(value: Boolean): Self = StObject.set(x, "skipTransform", value.asInstanceOf[js.Any])
      
      inline def setSkipTransformUndefined: Self = StObject.set(x, "skipTransform", js.undefined)
    }
  }
}
