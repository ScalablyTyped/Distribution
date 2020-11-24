package typings.konva.shapeMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
