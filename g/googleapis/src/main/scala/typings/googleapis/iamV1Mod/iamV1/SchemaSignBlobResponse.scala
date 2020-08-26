package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign blob response.
  */
@js.native
trait SchemaSignBlobResponse extends js.Object {
  /**
    * The id of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed blob.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaSignBlobResponse {
  @scala.inline
  def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  @scala.inline
  implicit class SchemaSignBlobResponseOps[Self <: SchemaSignBlobResponse] (val x: Self) extends AnyVal {
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

