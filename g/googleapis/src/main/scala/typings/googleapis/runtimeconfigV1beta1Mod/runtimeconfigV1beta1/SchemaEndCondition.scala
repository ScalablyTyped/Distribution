package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The condition that a Waiter resource is waiting for.
  */
@js.native
trait SchemaEndCondition extends js.Object {
  /**
    * The cardinality of the `EndCondition`.
    */
  var cardinality: js.UndefOr[SchemaCardinality] = js.native
}

object SchemaEndCondition {
  @scala.inline
  def apply(cardinality: SchemaCardinality = null): SchemaEndCondition = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEndCondition]
  }
}

