package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayParam[T] extends js.Object {
  var array: js.Array[T] = js.native
}

object ArrayParam {
  @scala.inline
  def apply[T](array: js.Array[T]): ArrayParam[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayParam[T]]
  }
  @scala.inline
  implicit class ArrayParamOps[Self <: ArrayParam[_], T] (val x: Self with ArrayParam[T]) extends AnyVal {
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
    def setArrayVarargs(value: T*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[T]): Self = this.set("array", value.asInstanceOf[js.Any])
  }
  
}

