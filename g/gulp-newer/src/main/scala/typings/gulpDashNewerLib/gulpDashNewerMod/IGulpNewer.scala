package typings
package gulpDashNewerLib.gulpDashNewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpNewer extends js.Object {
  /**
       * Create a transform stream that passes through files whose modification time
       * is more recent than the corresponding destination file's modification time.
       * @param dest Path to destination directory or file.
       */
  def apply(dest: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
       * Create a transform stream that passes through files whose modification time
       * is more recent than the corresponding destination file's modification time.
       */
  def apply(options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

