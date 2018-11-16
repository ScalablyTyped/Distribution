package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapSourceDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]] {
  var coord: Coordinate
  var dataType: mapboxDashGlLib.mapboxDashGlLibStrings.source
  var isSourceLoaded: scala.Boolean
  var source: Style
  var sourceDataType: mapboxDashGlLib.mapboxDashGlLibStrings.metadata | mapboxDashGlLib.mapboxDashGlLibStrings.content
  var sourceId: java.lang.String
  var tile: js.Any
}

