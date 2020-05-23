package typings.jestCore.anon

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdin extends js.Object {
  var stdin: ReadStream
  var stdout: WriteStream
}

object Stdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): Stdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdin]
  }
}

