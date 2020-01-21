package typings.ink.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppProps extends js.Object {
  /**
  	 * Exit (unmount) the whole Ink app.
  	 */
  def exit(): Unit = js.native
  def exit(error: Error): Unit = js.native
}

