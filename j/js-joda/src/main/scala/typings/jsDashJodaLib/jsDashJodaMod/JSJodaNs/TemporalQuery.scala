package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalQuery extends js.Object {
  def queryFrom(temporal: TemporalAccessor): js.Any
}

object TemporalQuery {
  @scala.inline
  def apply(queryFrom: js.Function1[TemporalAccessor, js.Any]): TemporalQuery = {
    val __obj = js.Dynamic.literal(queryFrom = queryFrom)
  
    __obj.asInstanceOf[TemporalQuery]
  }
}

