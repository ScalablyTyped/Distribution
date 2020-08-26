package typings.koaMulter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  /** Optional maximum number of files per field to accept. */
  var maxCount: js.UndefOr[Double] = js.native
  /** The field name. */
  var name: String = js.native
}

object Field {
  @scala.inline
  def apply(name: String): Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
  }
  
}

