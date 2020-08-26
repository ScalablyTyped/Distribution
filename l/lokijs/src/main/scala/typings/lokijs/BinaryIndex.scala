package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryIndex extends js.Object {
  var dirty: Boolean = js.native
  var name: String = js.native
  var values: js.Array[Double] = js.native
}

object BinaryIndex {
  @scala.inline
  def apply(dirty: Boolean, name: String, values: js.Array[Double]): BinaryIndex = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryIndex]
  }
  @scala.inline
  implicit class BinaryIndexOps[Self <: BinaryIndex] (val x: Self) extends AnyVal {
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
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

