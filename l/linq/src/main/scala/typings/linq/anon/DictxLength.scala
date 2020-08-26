package typings.linq.anon

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictxLength[TCollection] extends /* x */ NumberDictionary[TCollection] {
  var length: Double = js.native
}

object DictxLength {
  @scala.inline
  def apply[TCollection](length: Double): DictxLength[TCollection] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxLength[TCollection]]
  }
  @scala.inline
  implicit class DictxLengthOps[Self <: DictxLength[_], TCollection] (val x: Self with DictxLength[TCollection]) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

