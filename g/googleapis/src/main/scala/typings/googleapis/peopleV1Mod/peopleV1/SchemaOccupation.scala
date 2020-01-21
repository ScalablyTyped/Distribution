package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s occupation.
  */
@js.native
trait SchemaOccupation extends js.Object {
  /**
    * Metadata about the occupation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The occupation; for example, `carpenter`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaOccupation {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaOccupation = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOccupation]
  }
}

