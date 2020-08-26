package typings.logkitty.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilter extends js.Object {
  def shouldInclude(entry: Entry): Boolean = js.native
}

object IFilter {
  @scala.inline
  def apply(shouldInclude: Entry => Boolean): IFilter = {
    val __obj = js.Dynamic.literal(shouldInclude = js.Any.fromFunction1(shouldInclude))
    __obj.asInstanceOf[IFilter]
  }
  @scala.inline
  implicit class IFilterOps[Self <: IFilter] (val x: Self) extends AnyVal {
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
    def setShouldInclude(value: Entry => Boolean): Self = this.set("shouldInclude", js.Any.fromFunction1(value))
  }
  
}

