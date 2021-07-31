package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip", "WebSocketInterface")
@js.native
class WebSocketInterface protected ()
  extends StObject
     with Socket {
  def this(url: String) = this()
  
  def isConnected(): js.Any = js.native
  
  def isConnecting(): js.Any = js.native
}
