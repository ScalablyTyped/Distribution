package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An order on a field.
  */
@js.native
trait SchemaOrder extends js.Object {
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The field to order by.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.native
}

object SchemaOrder {
  @scala.inline
  def apply(direction: String = null, field: SchemaFieldReference = null): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrder]
  }
}

