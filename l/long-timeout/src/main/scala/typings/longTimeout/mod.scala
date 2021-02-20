package typings.longTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("long-timeout", "Timeout")
  @js.native
  class Timeout protected () extends StObject {
    def this(listener: Listener, ms: Double) = this()
    
    var after: Double = js.native
    
    def close(): Unit = js.native
    
    def listener(args: js.Any*): Unit = js.native
    @JSName("listener")
    var listener_Original: Listener = js.native
    
    def ref(): Unit = js.native
    
    def start(): Unit = js.native
    
    def unref(): Unit = js.native
    
    var unreffed: Boolean = js.native
  }
  
  @JSImport("long-timeout", "clearInterval")
  @js.native
  def clearInterval(timer: Interval): Unit = js.native
  
  @JSImport("long-timeout", "clearTimeout")
  @js.native
  def clearTimeout(timer: Timeout): Unit = js.native
  
  @JSImport("long-timeout", "setInterval")
  @js.native
  def setInterval(listener: Listener, ms: Double): Interval = js.native
  
  @JSImport("long-timeout", "setTimeout")
  @js.native
  def setTimeout(listener: Listener, ms: Double): Timeout = js.native
  
  type Interval = Timeout
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}
