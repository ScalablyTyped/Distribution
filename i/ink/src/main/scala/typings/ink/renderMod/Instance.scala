package typings.ink.renderMod

import typings.react.mod.ReactNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  def cleanup(): Unit = js.native
  
  /**
    * Clear output.
    */
  def clear(): Unit = js.native
  
  /**
    * Replace previous root node with a new one or update props of the current root node.
    */
  var rerender: js.Function1[/* node */ ReactNode, Unit] = js.native
  
  /**
    * Manually unmount the whole Ink app.
    */
  var unmount: js.Function1[/* error */ js.UndefOr[Error | Double | Null], Unit] = js.native
  
  /**
    * Returns a promise, which resolves when app is unmounted.
    */
  var waitUntilExit: js.Function0[js.Promise[Unit]] = js.native
}
object Instance {
  
  @scala.inline
  def apply(
    cleanup: () => Unit,
    clear: () => Unit,
    rerender: /* node */ ReactNode => Unit,
    unmount: /* error */ js.UndefOr[Error | Double | Null] => Unit,
    waitUntilExit: () => js.Promise[Unit]
  ): Instance = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), clear = js.Any.fromFunction0(clear), rerender = js.Any.fromFunction1(rerender), unmount = js.Any.fromFunction1(unmount), waitUntilExit = js.Any.fromFunction0(waitUntilExit))
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCleanup(value: () => Unit): Self = this.set("cleanup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRerender(value: /* node */ ReactNode => Unit): Self = this.set("rerender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmount(value: /* error */ js.UndefOr[Error | Double | Null] => Unit): Self = this.set("unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitUntilExit(value: () => js.Promise[Unit]): Self = this.set("waitUntilExit", js.Any.fromFunction0(value))
  }
}
