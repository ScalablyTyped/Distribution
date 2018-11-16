package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataOptions extends js.Object {
  var controlPosition: js.UndefOr[googlemapsLib.googleNs.mapsNs.ControlPosition] = js.undefined
  var controls: js.UndefOr[js.Array[googlemapsLib.googleNs.mapsNs.DrawingMode] | scala.Null] = js.undefined
  var drawingMode: js.UndefOr[googlemapsLib.googleNs.mapsNs.DrawingMode | scala.Null] = js.undefined
  var featureFactory: js.UndefOr[js.Function1[/* geometry */ Geometry, Feature]] = js.undefined
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  var style: js.UndefOr[StylingFunction | StyleOptions] = js.undefined
}

