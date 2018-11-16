package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeatmapOverlayConfiguration[V /* <: java.lang.String */, TLat /* <: java.lang.String */, TLong /* <: java.lang.String */] extends BaseHeatmapConfiguration[V] {
  /**
       * The property name of your latitude coordinate in a datapoint
       * Default value: 'x'
       */
  var latField: js.UndefOr[TLat] = js.undefined
  /**
       * The property name of your longitude coordinate in a datapoint
       * Default value: 'y'
       */
  var lngField: js.UndefOr[TLong] = js.undefined
}

