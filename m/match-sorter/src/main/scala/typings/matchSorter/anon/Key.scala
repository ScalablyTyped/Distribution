package typings.matchSorter.anon

import typings.matchSorter.mod.KeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key[T] extends js.Object {
  var key: KeyOptions[T] = js.native
}

object Key {
  @scala.inline
  def apply[T](key: KeyOptions[T]): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key[_], T] (val x: Self with Key[T]) extends AnyVal {
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
    def setKeyFunction1(value: T => String | js.Array[String]): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: KeyOptions[T]): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

