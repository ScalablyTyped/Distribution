package typings.longTimeout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("long-timeout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clearInterval(timer: Interval): Unit = js.native
  
  def clearTimeout(timer: Timeout): Unit = js.native
  
  def setInterval(listener: Listener, ms: Double): Interval = js.native
  
  def setTimeout(listener: Listener, ms: Double): Timeout = js.native
  
  @js.native
  class Timeout protected () extends js.Object {
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
  
  type Interval = Timeout
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
}
