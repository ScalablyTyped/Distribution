package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.Headers>> */
trait DeepPartialPartialHeaders extends js.Object {
  var Authorization: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  var `Content-Type`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  var `Idempotency-Key`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
  var `User-Agent`: js.UndefOr[DeepPartial[js.UndefOr[String]]] = js.undefined
}

object DeepPartialPartialHeaders {
  @scala.inline
  def apply(
    Authorization: DeepPartial[js.UndefOr[String]] = null,
    `Content-Type`: DeepPartial[js.UndefOr[String]] = null,
    `Idempotency-Key`: DeepPartial[js.UndefOr[String]] = null,
    `User-Agent`: DeepPartial[js.UndefOr[String]] = null
  ): DeepPartialPartialHeaders = {
    val __obj = js.Dynamic.literal()
    if (Authorization != null) __obj.updateDynamic("Authorization")(Authorization.asInstanceOf[js.Any])
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    if (`Idempotency-Key` != null) __obj.updateDynamic("Idempotency-Key")(`Idempotency-Key`.asInstanceOf[js.Any])
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPartialPartialHeaders]
  }
}

