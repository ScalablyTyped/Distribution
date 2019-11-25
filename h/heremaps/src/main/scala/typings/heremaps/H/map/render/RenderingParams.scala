package typings.heremaps.H.map.render

import typings.heremaps.H.geo.PixelProjection
import typings.heremaps.H.math.Point
import typings.heremaps.H.math.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing rendering parameters.
  */
trait RenderingParams extends js.Object {
  /**
    * The geographical area to render. Note that it is not the same as visible viewport. Specified bounds also include H.Map.Options#margin and
    * optionally an additional margin in case of DOM node rendering for a better rendering experience.
    * @type {H.geo.Rect}
    */
  var bounds: typings.heremaps.H.geo.Rect
  /**
    * Indicates whether only cached data should be considered.
    * @type {boolean}
    */
  var cacheOnly: Boolean
  /**
    * The pixelRatio to use for over-sampling in cases of high-resolution displays.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio.
    * @type {number}
    */
  var pixelRatio: Double
  /**
    * The coordinates relative to the screen center where the rendering has the highest priority. If the layer has to request and/or process data
    * asynchronously, it's recommended to prioritize the rendering close to this center.
    * @type {H.math.Point}
    */
  var priorityCenter: Point
  /**
    * The pixel projection to use to project geographical coordinates into screen coordinates and vice versa.
    * @type {H.geo.PixelProjection}
    */
  var projection: PixelProjection
  /**
    * The coordinates of the screen center in CSS pixels.
    * @type {H.math.Point}
    */
  var screenCenter: Point
  /**
    * The size of the area to render.
    * @type {H.math.Size}
    */
  var size: Size
  /**
    * The zoom level to render the data for.
    * @type {number}
    */
  var zoom: Double
}

object RenderingParams {
  @scala.inline
  def apply(
    bounds: typings.heremaps.H.geo.Rect,
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
}

