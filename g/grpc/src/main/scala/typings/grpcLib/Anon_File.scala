package typings
package grpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String
  var root: java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(file: java.lang.String, root: java.lang.String): Anon_File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Anon_File]
  }
}

