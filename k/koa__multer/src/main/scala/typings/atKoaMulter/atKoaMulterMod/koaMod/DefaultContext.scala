package typings.atKoaMulter.atKoaMulterMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultContext extends js.Object {
  var file: typings.std.File
  var files: js.Array[typings.std.File]
}

object DefaultContext {
  @scala.inline
  def apply(file: typings.std.File, files: js.Array[typings.std.File]): DefaultContext = {
    val __obj = js.Dynamic.literal(file = file, files = files)
  
    __obj.asInstanceOf[DefaultContext]
  }
}

