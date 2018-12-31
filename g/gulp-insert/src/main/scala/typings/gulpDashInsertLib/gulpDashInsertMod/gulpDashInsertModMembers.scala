package typings
package gulpDashInsertLib.gulpDashInsertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-insert", JSImport.Namespace)
@js.native
object gulpDashInsertModMembers extends js.Object {
  /**
    * Appends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  def append(content: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Prepends a string onto the contents
    * @param {string} content
    * @returns {NodeJS.ReadWriteStream}
    */
  def prepend(content: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Calls a function with the contents of the file
    * @param {Transformer} transformer
    * @returns {NodeJS.ReadWriteStream}
    */
  def transform(transformer: Transformer): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
    * Wraps the contents with two strings
    * @param {string} prepend
    * @param {string} append
    * @returns {NodeJS.ReadWriteStream}
    */
  def wrap(prepend: java.lang.String, append: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

