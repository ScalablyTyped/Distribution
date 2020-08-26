package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  /** The target state id */
  var id: String = js.native
  /** An optional conversion function when reading, e.g. `"(val − 32) * 5/9"` */
  var read: js.UndefOr[String] = js.native
  /** An optional conversion function when reading, e.g. `"(val * 9/5) + 32"` */
  var write: js.UndefOr[String] = js.native
}

object Id {
  @scala.inline
  def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setWrite(value: String): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

