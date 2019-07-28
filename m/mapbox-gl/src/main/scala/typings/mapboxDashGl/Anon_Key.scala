package typings.mapboxDashGl

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxDashGl.mapboxDashGlMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var layer: Layer
  var source: String
  var sourceLayer: String
  var state: StringDictionary[js.Any]
}

object Anon_Key {
  @scala.inline
  def apply(layer: Layer, source: String, sourceLayer: String, state: StringDictionary[js.Any]): Anon_Key = {
    val __obj = js.Dynamic.literal(layer = layer, source = source, sourceLayer = sourceLayer, state = state)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

