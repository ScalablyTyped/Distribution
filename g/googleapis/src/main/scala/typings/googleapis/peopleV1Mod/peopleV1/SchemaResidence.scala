package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s past or current residence.
  */
@js.native
trait SchemaResidence extends js.Object {
  /**
    * True if the residence is the person&#39;s current residence; false if the
    * residence is a past residence.
    */
  var current: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the residence.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The address of the residence.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaResidence {
  @scala.inline
  def apply(
    current: js.UndefOr[Boolean] = js.undefined,
    metadata: SchemaFieldMetadata = null,
    value: String = null
  ): SchemaResidence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResidence]
  }
}

