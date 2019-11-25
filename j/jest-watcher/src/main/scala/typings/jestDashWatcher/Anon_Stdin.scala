package typings.jestDashWatcher

import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stdin extends js.Object {
  var stdin: ReadStream
  var stdout: WriteStream
}

object Anon_Stdin {
  @scala.inline
  def apply(stdin: ReadStream, stdout: WriteStream): Anon_Stdin = {
    val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Stdin]
  }
}

