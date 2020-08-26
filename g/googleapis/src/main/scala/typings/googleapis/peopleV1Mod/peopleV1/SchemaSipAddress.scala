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
  def apply(): SchemaSipAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSipAddress]
  }
  @scala.inline
  implicit class SchemaSipAddressOps[Self <: SchemaSipAddress] (val x: Self) extends AnyVal {
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
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

