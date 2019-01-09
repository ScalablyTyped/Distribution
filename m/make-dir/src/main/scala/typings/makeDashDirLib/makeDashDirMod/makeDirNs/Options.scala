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

