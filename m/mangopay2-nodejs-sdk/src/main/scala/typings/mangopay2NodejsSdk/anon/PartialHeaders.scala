package typings.mangopay2NodejsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers> */
trait PartialHeaders extends js.Object {
  var Authorization: js.UndefOr[String] = js.undefined
  var `Content-Type`: js.UndefOr[String] = js.undefined
  var `Idempotency-Key`: js.UndefOr[String] = js.undefined
  var `User-Agent`: js.UndefOr[String] = js.undefined
}

object PartialHeaders {
  @scala.inline
  def apply(
    Authorization: String = null,
    `Content-Type`: String = null,
    `Idempotency-Key`: String = null,
    `User-Agent`: String = null
  ): PartialHeaders = {
    val __obj = js.Dynamic.literal()
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    if (`Idempotency-Key` != null) __obj.updateDynamic("Idempotency-Key")(`Idempotency-Key`.asInstanceOf[js.Any])
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHeaders]
  }
}

