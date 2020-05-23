package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bind extends js.Object {
  var bind: js.Object
  var files: RelativeTo
}

object Bind {
  @scala.inline
  def apply(bind: js.Object, files: RelativeTo): Bind = {
    val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bind]
  }
}

