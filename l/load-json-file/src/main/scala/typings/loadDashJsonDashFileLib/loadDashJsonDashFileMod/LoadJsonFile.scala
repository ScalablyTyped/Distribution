package typings
package loadDashJsonDashFileLib.loadDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadJsonFile extends js.Object {
  /**
    * Returns a promise for the parsed JSON.
    */
  def apply(filepath: java.lang.String): js.Promise[_] = js.native
  /**
    * Returns the parsed JSON.
    */
  def sync(filepath: java.lang.String): js.Any = js.native
}

