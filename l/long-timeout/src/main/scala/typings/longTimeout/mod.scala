package typings.longTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("long-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def clearInterval(timer: Interval): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(timer: Timeout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setInterval(listener: Listener, ms: Double): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(listener.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  @scala.inline
  def setTimeout(listener: Listener, ms: Double): Timeout = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(listener.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  
  type Interval = Timeout
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
}
