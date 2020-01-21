package typings.mapboxGl

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var layer: Layer
  var source: String
  var sourceLayer: String
  var state: StringDictionary[js.Any]
}

object AnonKey {
  @scala.inline
  def apply(layer: Layer, source: String, sourceLayer: String, state: StringDictionary[js.Any]): AnonKey = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceLayer = sourceLayer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

