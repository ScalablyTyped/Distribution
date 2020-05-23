package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecedenceGroup extends js.Object {
  def andFilter(filterClause: FilterClause): FilterClause
  def orFilter(filterClause: FilterClause): FilterClause
}

object PrecedenceGroup {
  @scala.inline
  def apply(andFilter: FilterClause => FilterClause, orFilter: FilterClause => FilterClause): PrecedenceGroup = {
    val __obj = js.Dynamic.literal(andFilter = js.Any.fromFunction1(andFilter), orFilter = js.Any.fromFunction1(orFilter))
    __obj.asInstanceOf[PrecedenceGroup]
  }
}

