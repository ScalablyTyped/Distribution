package typings
package makeDashDirLib.makeDashDirMod.makeDirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default: `require('fs')`
    *
    * Use a custom `fs` implementation. For example [`graceful-fs`](https://github.com/isaacs/node-graceful-fs).
    */
  var fs: js.UndefOr[makeDashDirLib.Anon_AccessAccessSync] = js.undefined
  /**
    * Default: `0o777 & (~process.umask())`
    *
    * Directory [permissions](https://x-team.com/blog/file-system-permissions-umask-node-js/).
    */
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(fs: makeDashDirLib.Anon_AccessAccessSync = null, mode: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

