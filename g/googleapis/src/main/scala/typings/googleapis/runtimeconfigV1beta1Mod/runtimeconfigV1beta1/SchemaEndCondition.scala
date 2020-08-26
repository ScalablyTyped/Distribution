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
  def apply(): SchemaEndCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndCondition]
  }
  @scala.inline
  implicit class SchemaEndConditionOps[Self <: SchemaEndCondition] (val x: Self) extends AnyVal {
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
    def setCardinality(value: SchemaCardinality): Self = this.set("cardinality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardinality: Self = this.set("cardinality", js.undefined)
  }
  
}

