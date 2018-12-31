package typings
package heremapsLib.HNs.mapNs.renderNs

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
  var bounds: heremapsLib.HNs.geoNs.Rect
  /**
    * Indicates whether only cached data should be considered.
    * @type {boolean}
    */
  var cacheOnly: scala.Boolean
  /**
    * The pixelRatio to use for over-sampling in cases of high-resolution displays.
    * See https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio.
    * @type {number}
    */
  var pixelRatio: scala.Double
  /**
    * The coordinates relative to the screen center where the rendering has the highest priority. If the layer has to request and/or process data
    * asynchronously, it's recommended to prioritize the rendering close to this center.
    * @type {H.math.Point}
    */
  var priorityCenter: heremapsLib.HNs.mathNs.Point
  /**
    * The pixel projection to use to project geographical coordinates into screen coordinates and vice versa.
    * @type {H.geo.PixelProjection}
    */
  var projection: heremapsLib.HNs.geoNs.PixelProjection
  /**
    * The coordinates of the screen center in CSS pixels.
    * @type {H.math.Point}
    */
  var screenCenter: heremapsLib.HNs.mathNs.Point
  /**
    * The size of the area to render.
    * @type {H.math.Size}
    */
  var size: heremapsLib.HNs.mathNs.Size
  /**
    * The zoom level to render the data for.
    * @type {number}
    */
  var zoom: scala.Double
}

