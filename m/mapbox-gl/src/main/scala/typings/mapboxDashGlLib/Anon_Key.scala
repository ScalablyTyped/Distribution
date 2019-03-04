package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var layer: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Layer
  var source: java.lang.String
  var sourceLayer: java.lang.String
  var state: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object Anon_Key {
  @scala.inline
  def apply(
    layer: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Layer,
    source: java.lang.String,
    sourceLayer: java.lang.String,
    state: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(layer = layer, source = source, sourceLayer = sourceLayer, state = state)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

