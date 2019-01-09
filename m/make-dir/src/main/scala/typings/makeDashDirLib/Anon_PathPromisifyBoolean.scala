package typings
package makeDashDirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPromisifyBoolean extends js.Object {
  /**
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Boolean]
}

