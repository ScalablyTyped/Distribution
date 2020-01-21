package typings.jestCore

import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStdin extends js.Object {
  var stdin: ReadStream
  var stdout: WriteStream
}

object AnonStdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): AnonStdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStdin]
  }
}

