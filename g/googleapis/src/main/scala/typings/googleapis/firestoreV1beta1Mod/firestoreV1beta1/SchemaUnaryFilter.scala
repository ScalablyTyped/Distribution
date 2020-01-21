package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

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
  def apply(field: SchemaFieldReference = null, op: String = null): SchemaUnaryFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnaryFilter]
  }
}

