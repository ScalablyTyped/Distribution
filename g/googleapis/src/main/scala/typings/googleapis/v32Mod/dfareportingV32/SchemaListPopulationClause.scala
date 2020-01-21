package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group clause made up of list population terms representing constraints
  * joined by ORs.
  */
@js.native
trait SchemaListPopulationClause extends js.Object {
  /**
    * Terms of this list population clause. Each clause is made up of list
    * population terms representing constraints and are joined by ORs.
    */
  var terms: js.UndefOr[js.Array[SchemaListPopulationTerm]] = js.native
}

object SchemaListPopulationClause {
  @scala.inline
  def apply(terms: js.Array[SchemaListPopulationTerm] = null): SchemaListPopulationClause = {
    val __obj = js.Dynamic.literal()
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPopulationClause]
  }
}

