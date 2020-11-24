package typings.konva.shapeMod

import typings.konva.contextMod.Context
import typings.konva.nodeMod.NodeConfig
import typings.konva.typesMod.Vector2d
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeConfig extends NodeConfig {
  
  var dash: js.UndefOr[js.Array[Double]] = js.native
  
  var dashEnabled: js.UndefOr[Boolean] = js.native
  
  var dashOffset: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var fillEnabled: js.UndefOr[Boolean] = js.native
  
  var fillLinearGradientColorStops: js.UndefOr[js.Array[Double | String]] = js.native
  
  var fillLinearGradientEndPoint: js.UndefOr[Vector2d] = js.native
  
  var fillLinearGradientEndPointX: js.UndefOr[Double] = js.native
  
  var fillLinearGradientEndPointY: js.UndefOr[Double] = js.native
  
  var fillLinearGradientStartPoint: js.UndefOr[Vector2d] = js.native
  
  var fillLinearGradientStartPointX: js.UndefOr[Double] = js.native
  
  var fillLinearGradientStartPointY: js.UndefOr[Double] = js.native
  
  var fillPatternImage: js.UndefOr[HTMLImageElement] = js.native
  
  var fillPatternOffset: js.UndefOr[Vector2d] = js.native
  
  var fillPatternOffsetX: js.UndefOr[Double] = js.native
  
  var fillPatternOffsetY: js.UndefOr[Double] = js.native
  
  var fillPatternRepeat: js.UndefOr[String] = js.native
  
  var fillPatternRotation: js.UndefOr[Double] = js.native
  
  var fillPatternScale: js.UndefOr[Vector2d] = js.native
  
  var fillPatternScaleX: js.UndefOr[Double] = js.native
  
  var fillPatternScaleY: js.UndefOr[Double] = js.native
  
  var fillPatternX: js.UndefOr[Double] = js.native
  
  var fillPatternY: js.UndefOr[Double] = js.native
  
  var fillPriority: js.UndefOr[String] = js.native
  
  var fillRadialGradientColorStops: js.UndefOr[js.Array[Double | String]] = js.native
  
  var fillRadialGradientEndPoint: js.UndefOr[Vector2d] = js.native
  
  var fillRadialGradientEndPointX: js.UndefOr[Double] = js.native
  
  var fillRadialGradientEndPointY: js.UndefOr[Double] = js.native
  
  var fillRadialGradientEndRadius: js.UndefOr[Double] = js.native
  
  var fillRadialGradientStartPoint: js.UndefOr[Vector2d] = js.native
  
  var fillRadialGradientStartPointX: js.UndefOr[Double] = js.native
  
  var fillRadialGradientStartPointY: js.UndefOr[Double] = js.native
  
  var fillRadialGradientStartRadius: js.UndefOr[Double] = js.native
  
  var hitFunc: js.UndefOr[js.Function2[/* con */ Context, /* shape */ Shape[this.type], Unit]] = js.native
  
  var hitStrokeWidth: js.UndefOr[Double | String] = js.native
  
  var lineCap: js.UndefOr[LineCap] = js.native
  
  var lineJoin: js.UndefOr[LineJoin] = js.native
  
  var perfectDrawEnabled: js.UndefOr[Boolean] = js.native
  
  var sceneFunc: js.UndefOr[js.Function2[/* con */ Context, /* shape */ Shape[this.type], Unit]] = js.native
  
  var shadowBlur: js.UndefOr[Double] = js.native
  
  var shadowColor: js.UndefOr[String] = js.native
  
  var shadowEnabled: js.UndefOr[Boolean] = js.native
  
  var shadowForStrokeEnabled: js.UndefOr[Boolean] = js.native
  
  var shadowOffset: js.UndefOr[Vector2d] = js.native
  
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  var shadowOpacity: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var strokeEnabled: js.UndefOr[Boolean] = js.native
  
  var strokeHitEnabled: js.UndefOr[Boolean] = js.native
  
  var strokeScaleEnabled: js.UndefOr[Boolean] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ShapeConfig {
  
  @scala.inline
  def apply(): ShapeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeConfig]
  }
  
  @scala.inline
  implicit class ShapeConfigOps[Self <: ShapeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDashVarargs(value: Double*): Self = this.set("dash", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: js.Array[Double]): Self = this.set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    
    @scala.inline
    def setDashEnabled(value: Boolean): Self = this.set("dashEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashEnabled: Self = this.set("dashEnabled", js.undefined)
    
    @scala.inline
    def setDashOffset(value: Double): Self = this.set("dashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashOffset: Self = this.set("dashOffset", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillEnabled(value: Boolean): Self = this.set("fillEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillEnabled: Self = this.set("fillEnabled", js.undefined)
    
    @scala.inline
    def setFillLinearGradientColorStopsVarargs(value: (Double | String)*): Self = this.set("fillLinearGradientColorStops", js.Array(value :_*))
    
    @scala.inline
    def setFillLinearGradientColorStops(value: js.Array[Double | String]): Self = this.set("fillLinearGradientColorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientColorStops: Self = this.set("fillLinearGradientColorStops", js.undefined)
    
    @scala.inline
    def setFillLinearGradientEndPoint(value: Vector2d): Self = this.set("fillLinearGradientEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientEndPoint: Self = this.set("fillLinearGradientEndPoint", js.undefined)
    
    @scala.inline
    def setFillLinearGradientEndPointX(value: Double): Self = this.set("fillLinearGradientEndPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientEndPointX: Self = this.set("fillLinearGradientEndPointX", js.undefined)
    
    @scala.inline
    def setFillLinearGradientEndPointY(value: Double): Self = this.set("fillLinearGradientEndPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientEndPointY: Self = this.set("fillLinearGradientEndPointY", js.undefined)
    
    @scala.inline
    def setFillLinearGradientStartPoint(value: Vector2d): Self = this.set("fillLinearGradientStartPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientStartPoint: Self = this.set("fillLinearGradientStartPoint", js.undefined)
    
    @scala.inline
    def setFillLinearGradientStartPointX(value: Double): Self = this.set("fillLinearGradientStartPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientStartPointX: Self = this.set("fillLinearGradientStartPointX", js.undefined)
    
    @scala.inline
    def setFillLinearGradientStartPointY(value: Double): Self = this.set("fillLinearGradientStartPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillLinearGradientStartPointY: Self = this.set("fillLinearGradientStartPointY", js.undefined)
    
    @scala.inline
    def setFillPatternImage(value: HTMLImageElement): Self = this.set("fillPatternImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternImage: Self = this.set("fillPatternImage", js.undefined)
    
    @scala.inline
    def setFillPatternOffset(value: Vector2d): Self = this.set("fillPatternOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternOffset: Self = this.set("fillPatternOffset", js.undefined)
    
    @scala.inline
    def setFillPatternOffsetX(value: Double): Self = this.set("fillPatternOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternOffsetX: Self = this.set("fillPatternOffsetX", js.undefined)
    
    @scala.inline
    def setFillPatternOffsetY(value: Double): Self = this.set("fillPatternOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternOffsetY: Self = this.set("fillPatternOffsetY", js.undefined)
    
    @scala.inline
    def setFillPatternRepeat(value: String): Self = this.set("fillPatternRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternRepeat: Self = this.set("fillPatternRepeat", js.undefined)
    
    @scala.inline
    def setFillPatternRotation(value: Double): Self = this.set("fillPatternRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternRotation: Self = this.set("fillPatternRotation", js.undefined)
    
    @scala.inline
    def setFillPatternScale(value: Vector2d): Self = this.set("fillPatternScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternScale: Self = this.set("fillPatternScale", js.undefined)
    
    @scala.inline
    def setFillPatternScaleX(value: Double): Self = this.set("fillPatternScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternScaleX: Self = this.set("fillPatternScaleX", js.undefined)
    
    @scala.inline
    def setFillPatternScaleY(value: Double): Self = this.set("fillPatternScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternScaleY: Self = this.set("fillPatternScaleY", js.undefined)
    
    @scala.inline
    def setFillPatternX(value: Double): Self = this.set("fillPatternX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternX: Self = this.set("fillPatternX", js.undefined)
    
    @scala.inline
    def setFillPatternY(value: Double): Self = this.set("fillPatternY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPatternY: Self = this.set("fillPatternY", js.undefined)
    
    @scala.inline
    def setFillPriority(value: String): Self = this.set("fillPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillPriority: Self = this.set("fillPriority", js.undefined)
    
    @scala.inline
    def setFillRadialGradientColorStopsVarargs(value: (Double | String)*): Self = this.set("fillRadialGradientColorStops", js.Array(value :_*))
    
    @scala.inline
    def setFillRadialGradientColorStops(value: js.Array[Double | String]): Self = this.set("fillRadialGradientColorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientColorStops: Self = this.set("fillRadialGradientColorStops", js.undefined)
    
    @scala.inline
    def setFillRadialGradientEndPoint(value: Vector2d): Self = this.set("fillRadialGradientEndPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientEndPoint: Self = this.set("fillRadialGradientEndPoint", js.undefined)
    
    @scala.inline
    def setFillRadialGradientEndPointX(value: Double): Self = this.set("fillRadialGradientEndPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientEndPointX: Self = this.set("fillRadialGradientEndPointX", js.undefined)
    
    @scala.inline
    def setFillRadialGradientEndPointY(value: Double): Self = this.set("fillRadialGradientEndPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientEndPointY: Self = this.set("fillRadialGradientEndPointY", js.undefined)
    
    @scala.inline
    def setFillRadialGradientEndRadius(value: Double): Self = this.set("fillRadialGradientEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientEndRadius: Self = this.set("fillRadialGradientEndRadius", js.undefined)
    
    @scala.inline
    def setFillRadialGradientStartPoint(value: Vector2d): Self = this.set("fillRadialGradientStartPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientStartPoint: Self = this.set("fillRadialGradientStartPoint", js.undefined)
    
    @scala.inline
    def setFillRadialGradientStartPointX(value: Double): Self = this.set("fillRadialGradientStartPointX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientStartPointX: Self = this.set("fillRadialGradientStartPointX", js.undefined)
    
    @scala.inline
    def setFillRadialGradientStartPointY(value: Double): Self = this.set("fillRadialGradientStartPointY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientStartPointY: Self = this.set("fillRadialGradientStartPointY", js.undefined)
    
    @scala.inline
    def setFillRadialGradientStartRadius(value: Double): Self = this.set("fillRadialGradientStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRadialGradientStartRadius: Self = this.set("fillRadialGradientStartRadius", js.undefined)
    
    @scala.inline
    def setHitFunc(value: (/* con */ Context, /* shape */ Shape[ShapeConfig]) => Unit): Self = this.set("hitFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHitFunc: Self = this.set("hitFunc", js.undefined)
    
    @scala.inline
    def setHitStrokeWidth(value: Double | String): Self = this.set("hitStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitStrokeWidth: Self = this.set("hitStrokeWidth", js.undefined)
    
    @scala.inline
    def setLineCap(value: LineCap): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setLineJoin(value: LineJoin): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineJoin: Self = this.set("lineJoin", js.undefined)
    
    @scala.inline
    def setPerfectDrawEnabled(value: Boolean): Self = this.set("perfectDrawEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfectDrawEnabled: Self = this.set("perfectDrawEnabled", js.undefined)
    
    @scala.inline
    def setSceneFunc(value: (/* con */ Context, /* shape */ Shape[ShapeConfig]) => Unit): Self = this.set("sceneFunc", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSceneFunc: Self = this.set("sceneFunc", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowEnabled(value: Boolean): Self = this.set("shadowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowEnabled: Self = this.set("shadowEnabled", js.undefined)
    
    @scala.inline
    def setShadowForStrokeEnabled(value: Boolean): Self = this.set("shadowForStrokeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowForStrokeEnabled: Self = this.set("shadowForStrokeEnabled", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Vector2d): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffset: Self = this.set("shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOpacity: Self = this.set("shadowOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeEnabled(value: Boolean): Self = this.set("strokeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeEnabled: Self = this.set("strokeEnabled", js.undefined)
    
    @scala.inline
    def setStrokeHitEnabled(value: Boolean): Self = this.set("strokeHitEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeHitEnabled: Self = this.set("strokeHitEnabled", js.undefined)
    
    @scala.inline
    def setStrokeScaleEnabled(value: Boolean): Self = this.set("strokeScaleEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeScaleEnabled: Self = this.set("strokeScaleEnabled", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
}
