package typings.jodata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jodata", "PrecedenceGroup")
@js.native
class PrecedenceGroup protected ()
  extends typings.jodata.jo.PrecedenceGroup {
  def this(filterClause: typings.jodata.jo.FilterClause) = this()
  /* CompleteClass */
  override def andFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
  /* CompleteClass */
  override def orFilter(filterClause: typings.jodata.jo.FilterClause): typings.jodata.jo.FilterClause = js.native
}

