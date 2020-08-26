package typings.htmlTableify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Header config object for key `T`. */
@js.native
trait Header[T] extends js.Object {
  /** Text align of the column. */
  var align: js.UndefOr[Alignment] = js.native
  /** Key in data object. */
  var name: T = js.native
  /** Title of the column. */
  var title: js.UndefOr[String] = js.native
}

object Header {
  @scala.inline
  def apply[T](name: T): Header[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header[T]]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header[_], T] (val x: Self with Header[T]) extends AnyVal {
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
    def setName(value: T): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: Alignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

