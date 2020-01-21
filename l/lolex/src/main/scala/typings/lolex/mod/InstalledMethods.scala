package typings.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional methods that installed clock have.
  */
trait InstalledMethods extends js.Object {
  var methods: js.Array[FakeMethod]
  /**
    * Restores the original methods on the context that was passed to lolex.install,
    * or the native timers if no context was given.
    */
  def uninstall(): Unit
}

object InstalledMethods {
  @scala.inline
  def apply(methods: js.Array[FakeMethod], uninstall: () => Unit): InstalledMethods = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = js.Any.fromFunction0(uninstall))
  
    __obj.asInstanceOf[InstalledMethods]
  }
}

