package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentAccess extends js.Object {
  var `access-oauth-token`: js.UndefOr[js.Array[String]] = js.undefined
  var `access-oauth-uri`: js.UndefOr[String] = js.undefined
  var `access-password`: js.UndefOr[String] = js.undefined
  var `access-pin`: js.UndefOr[String] = js.undefined
  var `access-user-name`: js.UndefOr[String] = js.undefined
}

object DocumentAccess {
  @scala.inline
  def apply(
    `access-oauth-token`: js.Array[String] = null,
    `access-oauth-uri`: String = null,
    `access-password`: String = null,
    `access-pin`: String = null,
    `access-user-name`: String = null
  ): DocumentAccess = {
    val __obj = js.Dynamic.literal()
    if (`access-oauth-token` != null) __obj.updateDynamic("access-oauth-token")(`access-oauth-token`.asInstanceOf[js.Any])
    if (`access-oauth-uri` != null) __obj.updateDynamic("access-oauth-uri")(`access-oauth-uri`.asInstanceOf[js.Any])
    if (`access-password` != null) __obj.updateDynamic("access-password")(`access-password`.asInstanceOf[js.Any])
    if (`access-pin` != null) __obj.updateDynamic("access-pin")(`access-pin`.asInstanceOf[js.Any])
    if (`access-user-name` != null) __obj.updateDynamic("access-user-name")(`access-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAccess]
  }
}

