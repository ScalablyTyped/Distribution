package typings
package kssLib.kssMod.kssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** bath to source directory */
  var base: java.lang.String
  /** file contents */
  var contents: java.lang.String
  /** full path to file */
  var path: java.lang.String
}

object File {
  @scala.inline
  def apply(base: java.lang.String, contents: java.lang.String, path: java.lang.String): File = {
    val __obj = js.Dynamic.literal(base = base, contents = contents, path = path)
  
    __obj.asInstanceOf[File]
  }
}

