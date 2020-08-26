package typings.jsdevtoolsFilePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters[T] extends js.Object {
  var exclude: T = js.native
  var include: T = js.native
}

object Filters {
  @scala.inline
  def apply[T](exclude: T, include: T): Filters[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters[T]]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters[_], T] (val x: Self with Filters[T]) extends AnyVal {
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
    def setExclude(value: T): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def setInclude(value: T): Self = this.set("include", value.asInstanceOf[js.Any])
  }
  
}

