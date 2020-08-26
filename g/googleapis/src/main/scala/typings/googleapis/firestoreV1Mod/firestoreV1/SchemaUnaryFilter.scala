package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter with a single operand.
  */
@js.native
trait SchemaUnaryFilter extends js.Object {
  /**
    * The field to which to apply the operator.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.native
  /**
    * The unary operator to apply.
    */
  var op: js.UndefOr[String] = js.native
}

object SchemaUnaryFilter {
  @scala.inline
  def apply(): SchemaUnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnaryFilter]
  }
  @scala.inline
  implicit class SchemaUnaryFilterOps[Self <: SchemaUnaryFilter] (val x: Self) extends AnyVal {
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
    def setField(value: SchemaFieldReference): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
  }
  
}

