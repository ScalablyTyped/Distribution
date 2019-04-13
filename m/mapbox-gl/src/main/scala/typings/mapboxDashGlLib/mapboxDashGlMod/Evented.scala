package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Evented")
@js.native
class Evented () extends js.Object {
  // https://github.com/mapbox/mapbox-gl-js/issues/6522
  def fire(`type`: java.lang.String): this.type = js.native
  def fire(`type`: java.lang.String, properties: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  def off(): this.type = js.native
  def off(`type`: java.lang.String): this.type = js.native
  def off(`type`: java.lang.String, listener: js.Function): this.type = js.native
  def off(`type`: js.Any): this.type = js.native
  def off(`type`: js.Any, listener: js.Function): this.type = js.native
  def on(`type`: java.lang.String, listener: js.Function): this.type = js.native
  def once(`type`: java.lang.String, listener: js.Function): this.type = js.native
}

