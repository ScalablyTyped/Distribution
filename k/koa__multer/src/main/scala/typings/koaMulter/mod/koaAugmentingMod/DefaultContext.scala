package typings.koaMulter.mod.koaAugmentingMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultContext extends js.Object {
  var file: File
  var files: js.Array[File]
}

object DefaultContext {
  @scala.inline
  def apply(file: File, files: js.Array[File]): DefaultContext = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultContext]
  }
}

