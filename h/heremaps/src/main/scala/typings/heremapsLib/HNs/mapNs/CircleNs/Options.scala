package typings
package heremapsLib.HNs.mapNs.CircleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
           * @property style {H.map.SpatialStyle=} - the style to be used when tracing the polyline
           * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
           * @property precision {number=} - The precision of a circle as a number of segments to be used when rendering the circle. The value is clamped to the range between [4 ... 360], where 60 is
           * the default. Note that the lower the value the more angular and the less circle-like the shape appears and, conversely, the higher the value the smoother and more rounded the result.
           * Thus, starting at the extreme low end of the possible values, 4 produces a square, 6 a hexagon, while 30 results in a circle-like shape, although it appears increasingly angular as
           * the zoom level increases (as you zoom in), and finally 360 produces a smooth circle.
           * @property zIndex {number=} - The z-index value of the circle, default is 0
           * @property min {number=} - The minimum zoom level for which the circle is visible, default is -Infinity
           * @property max {number=} - The maximum zoom level for which the circle is visible, default is Infinity
           * @property provider {(H.map.provider.Provider | null)=} - The provider of this object.
           * This property is only needed if a customized Implementation of ObjectProvider wants to instantiate an object.
           * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData
           */

trait Options extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var provider: js.UndefOr[heremapsLib.HNs.mapNs.providerNs.Provider] = js.undefined
  var style: js.UndefOr[
    heremapsLib.HNs.mapNs.SpatialStyle | heremapsLib.HNs.mapNs.SpatialStyleNs.Options
  ] = js.undefined
  var visibility: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

