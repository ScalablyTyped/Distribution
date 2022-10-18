package typings.lib0.mod

import typings.lib0.anon._empty
import typings.lib0.eventloopMod.TimeoutObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventloop {
  
  @JSImport("lib0", "eventloop")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lib0", "eventloop.Animation")
  @js.native
  open class Animation protected ()
    extends StObject
       with _empty {
    def this(timeoutId: Double) = this()
    
    /* CompleteClass */
    @JSName("_")
    var _underscore: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
  }
  
  inline def animationFrame(cb: js.Function1[/* arg0 */ Double, Unit]): TimeoutObject = ^.asInstanceOf[js.Dynamic].applyDynamic("animationFrame")(cb.asInstanceOf[js.Any]).asInstanceOf[TimeoutObject]
  
  inline def createDebouncer(timeout: Double): js.Function1[/* arg0 */ js.Function0[Unit], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDebouncer")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg0 */ js.Function0[Unit], Unit]]
  
  inline def enqueue(f: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enqueue")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def idleCallback(cb: js.Function): TimeoutObject = ^.asInstanceOf[js.Dynamic].applyDynamic("idleCallback")(cb.asInstanceOf[js.Any]).asInstanceOf[TimeoutObject]
  
  inline def interval(timeout: Double, callback: js.Function): TimeoutObject = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TimeoutObject]
  
  inline def timeout(timeout: Double, callback: js.Function): TimeoutObject = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TimeoutObject]
}
