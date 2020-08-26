package typings.mangopay2NodejsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers> */
@js.native
trait PartialHeaders extends js.Object {
  var Authorization: js.UndefOr[String] = js.native
  var `Content-Type`: js.UndefOr[String] = js.native
  var `Idempotency-Key`: js.UndefOr[String] = js.native
  var `User-Agent`: js.UndefOr[String] = js.native
}

object PartialHeaders {
  @scala.inline
  def apply(): PartialHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaders]
  }
  @scala.inline
  implicit class PartialHeadersOps[Self <: PartialHeaders] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: String): Self = this.set("Authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("Authorization", js.undefined)
    @scala.inline
    def `setContent-Type`(value: String): Self = this.set("Content-Type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-Type`: Self = this.set("Content-Type", js.undefined)
    @scala.inline
    def `setIdempotency-Key`(value: String): Self = this.set("Idempotency-Key", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIdempotency-Key`: Self = this.set("Idempotency-Key", js.undefined)
    @scala.inline
    def `setUser-Agent`(value: String): Self = this.set("User-Agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-Agent`: Self = this.set("User-Agent", js.undefined)
  }
  
}

