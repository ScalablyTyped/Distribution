package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a field.
  */
@js.native
trait SchemaFieldMetadata extends js.Object {
  /**
    * True if the field is the primary field; false if the field is a secondary
    * field.
    */
  var primary: js.UndefOr[Boolean] = js.native
  /**
    * The source of the field.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * True if the field is verified; false if the field is unverified. A
    * verified field is typically a name, email address, phone number, or
    * website that has been confirmed to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object SchemaFieldMetadata {
  @scala.inline
  def apply(
    primary: js.UndefOr[Boolean] = js.undefined,
    source: SchemaSource = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
}

