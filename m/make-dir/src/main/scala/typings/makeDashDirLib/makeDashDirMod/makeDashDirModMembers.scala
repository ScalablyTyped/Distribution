package typings
package makeDashDirLib.makeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-dir", JSImport.Namespace)
@js.native
object makeDashDirModMembers extends js.Object {
  /**
   * Returns a `Promise` for the path to the created directory.
   * @param path Directory to create.
   */
  def apply(path: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
   * Returns a `Promise` for the path to the created directory.
   * @param path Directory to create.
   */
  def apply(path: java.lang.String, options: makeDashDirLib.makeDashDirMod.makeDirNs.Options): js.Promise[java.lang.String] = js.native
  /**
       * Returns the path to the created directory.
       * @param path Directory to create.
       */
  def sync(path: java.lang.String): java.lang.String = js.native
  /**
       * Returns the path to the created directory.
       * @param path Directory to create.
       */
  def sync(path: java.lang.String, options: makeDashDirLib.makeDashDirMod.makeDirNs.Options): java.lang.String = js.native
}

