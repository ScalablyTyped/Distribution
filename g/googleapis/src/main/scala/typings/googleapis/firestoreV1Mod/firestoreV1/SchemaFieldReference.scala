package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a field, such as `max(messages.time) as max_time`.
  */
@js.native
trait SchemaFieldReference extends js.Object {
  var fieldPath: js.UndefOr[String] = js.native
}

object SchemaFieldReference {
  @scala.inline
  def apply(fieldPath: String = null): SchemaFieldReference = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldReference]
  }
}

