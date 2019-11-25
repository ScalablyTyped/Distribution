package typings.atKoaMulter.atKoaMulterMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var file: typings.std.File
  var files: js.Array[typings.std.File]
}

object Request {
  @scala.inline
  def apply(file: typings.std.File, files: js.Array[typings.std.File]): Request = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

