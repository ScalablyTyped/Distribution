package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  /** The target state id */
  var id: String
  /** An optional conversion function when reading, e.g. `"(val − 32) * 5/9"` */
  var read: js.UndefOr[String] = js.undefined
  /** An optional conversion function when reading, e.g. `"(val * 9/5) + 32"` */
  var write: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(id: String, read: String = null, write: String = null): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

