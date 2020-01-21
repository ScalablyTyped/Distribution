package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s SIP address. Session Initial Protocol addresses are used for
  * VoIP communications to make voice or video calls over the internet.
  */
@js.native
trait SchemaSipAddress extends js.Object {
  /**
    * The read-only type of the SIP address translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the SIP address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The type of the SIP address. The type can be custom or or one of these
    * predefined values:  * `home` * `work` * `mobile` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The SIP address in the [RFC
    * 3261 19.1](https://tools.ietf.org/html/rfc3261#section-19.1) SIP URI
    * format.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaSipAddress {
  @scala.inline
  def apply(
    formattedType: String = null,
    metadata: SchemaFieldMetadata = null,
    `type`: String = null,
    value: String = null
  ): SchemaSipAddress = {
    val __obj = js.Dynamic.literal()
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSipAddress]
  }
}

