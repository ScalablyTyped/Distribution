package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "Evented")
@js.native
class Evented () extends js.Object {
  
  // https://github.com/mapbox/mapbox-gl-js/issues/6522
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, properties: StringDictionary[js.Any]): this.type = js.native
  
  def off(): this.type = js.native
  def off(`type`: js.UndefOr[scala.Nothing], listener: js.Function): this.type = js.native
  def off(`type`: String): this.type = js.native
  def off(`type`: String, listener: js.Function): this.type = js.native
  def off(`type`: js.Any): this.type = js.native
  def off(`type`: js.Any, listener: js.Function): this.type = js.native
  
  def on(`type`: String, listener: js.Function): this.type = js.native
  
  def once(`type`: String, listener: js.Function): this.type = js.native
}
