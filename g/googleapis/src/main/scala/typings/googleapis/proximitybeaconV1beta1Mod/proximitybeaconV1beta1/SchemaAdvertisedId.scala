package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a unique identifier of a beacon as broadcast by the device.
  */
@js.native
trait SchemaAdvertisedId extends js.Object {
  /**
    * The actual beacon identifier, as broadcast by the beacon hardware. Must
    * be [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
    * requests, and will be so encoded (with padding) in responses. The base64
    * encoding should be of the binary byte-stream and not any textual (such as
    * hex) representation thereof. Required.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier type. Required.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAdvertisedId {
  @scala.inline
  def apply(): SchemaAdvertisedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertisedId]
  }
  @scala.inline
  implicit class SchemaAdvertisedIdOps[Self <: SchemaAdvertisedId] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

