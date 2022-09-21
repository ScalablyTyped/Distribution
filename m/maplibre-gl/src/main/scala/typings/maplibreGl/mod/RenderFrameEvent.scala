package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.renderFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RenderFrameEvent")
@js.native
open class RenderFrameEvent protected () extends Event {
  def this(`type`: String) = this()
  def this(`type`: String, data: Any) = this()
  
  var timeStamp: Double = js.native
  
  @JSName("type")
  var type_RenderFrameEvent: renderFrame = js.native
}
