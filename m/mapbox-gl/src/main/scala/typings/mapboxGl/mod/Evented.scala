package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "Evented")
@js.native
open class Evented () extends StObject {
  
  // https://github.com/mapbox/mapbox-gl-js/issues/6522
  def fire(`type`: String): this.type = js.native
  def fire(`type`: String, properties: StringDictionary[Any]): this.type = js.native
  
  def off(): this.type = js.native
  def off(`type`: String): this.type = js.native
  def off(`type`: String, listener: EventedListener): this.type = js.native
  def off(`type`: Any): this.type = js.native
  def off(`type`: Any, listener: EventedListener): this.type = js.native
  def off(`type`: Unit, listener: EventedListener): this.type = js.native
  
  def on(`type`: String, listener: EventedListener): this.type = js.native
  
  def once(`type`: String, listener: EventedListener): this.type = js.native
}
