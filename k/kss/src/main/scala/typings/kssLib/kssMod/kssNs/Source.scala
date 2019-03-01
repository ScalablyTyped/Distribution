package typings
package kssLib.kssMod.kssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** The name of the file. */
  var filename: java.lang.String
  /** The line number where the KSS comment is found. */
  var line: scala.Double
  /** The full path of the file. */
  var path: java.lang.String
}

object Source {
  @scala.inline
  def apply(filename: java.lang.String, line: scala.Double, path: java.lang.String): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Source]
  }
}

