package typings.makeDir.mod

import typings.makeDir.Typeoffs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Use a custom `fs` implementation. For example [`graceful-fs`](https://github.com/isaacs/node-graceful-fs).
  		Using a custom `fs` implementation will block the use of the native `recursive` option if `fs.mkdir` or `fs.mkdirSync` is not the native function.
  		@default require('fs')
  		*/
  val fs: js.UndefOr[Typeoffs] = js.undefined
  /**
  		Directory [permissions](https://x-team.com/blog/file-system-permissions-umask-node-js/).
  		@default 0o777 & (~process.umask())
  		*/
  val mode: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(fs: Typeoffs = null, mode: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

