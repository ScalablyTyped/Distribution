package typings.heremaps.H.map.render

import typings.heremaps.H.geo.PixelProjection
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.math.Point
import typings.heremaps.H.math.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing rendering parameters.
  */
@js.native
trait RenderingParams extends js.Object {
  /**
    * The geographical area to render. Note that it is not the same as visible viewport. Specified bounds also include H.Map.Options#margin and
    * optionally an additional margin in case of DOM node rendering for a better rendering experience.
    * @type {H.geo.Rect}
    */
  var bounds: Rect = js.native
  /**
    * Indicates whether only cached data should be considered.
    * @type {boolean}
    */
  var cacheOnly: Boolean = js.native
  /**
    * The pixelRatio to use for over-sampling in cases of high-resolution displays.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio.
    * @type {number}
    */
  var pixelRatio: Double = js.native
  /**
    * The coordinates relative to the screen center where the rendering has the highest priority. If the layer has to request and/or process data
    * asynchronously, it's recommended to prioritize the rendering close to this center.
    * @type {H.math.Point}
    */
  var priorityCenter: Point = js.native
  /**
    * The pixel projection to use to project geographical coordinates into screen coordinates and vice versa.
    * @type {H.geo.PixelProjection}
    */
  var projection: PixelProjection = js.native
  /**
    * The coordinates of the screen center in CSS pixels.
    * @type {H.math.Point}
    */
  var screenCenter: Point = js.native
  /**
    * The size of the area to render.
    * @type {H.math.Size}
    */
  var size: Size = js.native
  /**
    * The zoom level to render the data for.
    * @type {number}
    */
  var zoom: Double = js.native
}

object RenderingParams {
  @scala.inline
  def apply(
    bounds: Rect,
    cacheOnly: Boolean,
    pixelRatio: Double,
    priorityCenter: Point,
    projection: PixelProjection,
    screenCenter: Point,
    size: Size,
    zoom: Double
  ): RenderingParams = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], cacheOnly = cacheOnly.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], priorityCenter = priorityCenter.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], screenCenter = screenCenter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingParams]
  }
  @scala.inline
  implicit class RenderingParamsOps[Self <: RenderingParams] (val x: Self) extends AnyVal {
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
    def setBounds(value: Rect): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheOnly(value: Boolean): Self = this.set("cacheOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriorityCenter(value: Point): Self = this.set("priorityCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: PixelProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenCenter(value: Point): Self = this.set("screenCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

