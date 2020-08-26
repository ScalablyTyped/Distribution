package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecedenceGroup extends js.Object {
  def andFilter(filterClause: FilterClause): FilterClause = js.native
  def orFilter(filterClause: FilterClause): FilterClause = js.native
}

object PrecedenceGroup {
  @scala.inline
  def apply(andFilter: FilterClause => FilterClause, orFilter: FilterClause => FilterClause): PrecedenceGroup = {
    val __obj = js.Dynamic.literal(andFilter = js.Any.fromFunction1(andFilter), orFilter = js.Any.fromFunction1(orFilter))
    __obj.asInstanceOf[PrecedenceGroup]
  }
  @scala.inline
  implicit class PrecedenceGroupOps[Self <: PrecedenceGroup] (val x: Self) extends AnyVal {
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
    def setAndFilter(value: FilterClause => FilterClause): Self = this.set("andFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setOrFilter(value: FilterClause => FilterClause): Self = this.set("orFilter", js.Any.fromFunction1(value))
  }
  
}

