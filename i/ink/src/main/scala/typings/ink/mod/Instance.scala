package typings.ink.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
  	 * Manually unmount the whole Ink app.
  	 */
  var unmount: Unmount
  /**
  	 * Replace previous root node with a new one or update props of the current root node.
  	 */
  def rerender[Props](tree: ReactElement): Unit
  /**
  	 * Returns a promise, which resolves when app is unmounted.
  	 */
  def waitUntilExit(): js.Promise[Unit]
}

object Instance {
  @scala.inline
  def apply(rerender: ReactElement => Unit, unmount: () => Unit, waitUntilExit: () => js.Promise[Unit]): Instance = {
    val __obj = js.Dynamic.literal(rerender = js.Any.fromFunction1(rerender), unmount = js.Any.fromFunction0(unmount), waitUntilExit = js.Any.fromFunction0(waitUntilExit))
    __obj.asInstanceOf[Instance]
  }
}

