package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSourceDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var coord: Coordinate
  var dataType: mapboxDashGlLib.mapboxDashGlLibStrings.source
  var isSourceLoaded: scala.Boolean
  var source: Source
  var sourceDataType: mapboxDashGlLib.mapboxDashGlLibStrings.metadata | mapboxDashGlLib.mapboxDashGlLibStrings.content
  var sourceId: java.lang.String
  var tile: js.Any
}

object MapSourceDataEvent {
  @scala.inline
  def apply(
    coord: Coordinate,
    dataType: mapboxDashGlLib.mapboxDashGlLibStrings.source,
    isSourceLoaded: scala.Boolean,
    source: Source,
    sourceDataType: mapboxDashGlLib.mapboxDashGlLibStrings.metadata | mapboxDashGlLib.mapboxDashGlLibStrings.content,
    sourceId: java.lang.String,
    target: Map,
    tile: js.Any,
    `type`: java.lang.String,
    originalEvent: js.UndefOr[scala.Nothing] = js.undefined
  ): MapSourceDataEvent = {
    val __obj = js.Dynamic.literal(coord = coord, dataType = dataType, isSourceLoaded = isSourceLoaded, source = source, sourceDataType = sourceDataType.asInstanceOf[js.Any], sourceId = sourceId, target = target, tile = tile)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(originalEvent)) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapSourceDataEvent]
  }
}

