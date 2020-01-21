package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s email address.
  */
@js.native
trait SchemaEmailAddress extends js.Object {
  /**
    * The display name of the email.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The read-only type of the email address translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the email address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The type of the email address. The type can be custom or one of these
    * predefined values:  * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The email address.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaEmailAddress {
  @scala.inline
  def apply(
    displayName: String = null,
    formattedType: String = null,
    metadata: SchemaFieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmailAddress]
  }
}

