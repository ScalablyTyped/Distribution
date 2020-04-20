package typings.ink.mod

import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StdoutProps extends js.Object {
  /**
  	 * Stdout stream passed to `render()` in `options.stdout` or `process.stdout` by default.
  	 */
  val stdout: WriteStream
}

object StdoutProps {
  @scala.inline
  def apply(stdout: WriteStream): StdoutProps = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdoutProps]
  }
}

