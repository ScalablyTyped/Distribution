package typings.maplibreGl.mod

import typings.std.MessageChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ThrottledInvoker")
@js.native
open class ThrottledInvoker protected () extends StObject {
  def this(callback: js.Function) = this()
  
  var _callback: js.Function = js.native
  
  var _channel: MessageChannel = js.native
  
  var _triggered: Boolean = js.native
  
  def remove(): scala.Unit = js.native
  
  def trigger(): scala.Unit = js.native
}
