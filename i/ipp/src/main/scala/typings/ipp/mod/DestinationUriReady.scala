package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationUriReady extends js.Object {
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `destination-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-info`: js.UndefOr[String] = js.undefined
  var `destination-is-directory`: js.UndefOr[Boolean] = js.undefined
  var `destination-mandatory-access-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-name`: js.UndefOr[String] = js.undefined
  var `destination-oauth-scope`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-oauth-token`: js.UndefOr[js.Array[String]] = js.undefined
  var `destination-oauth-uri`: js.UndefOr[String] = js.undefined
  var `destination-uri`: js.UndefOr[String] = js.undefined
}

object DestinationUriReady {
  @scala.inline
  def apply(
    `destination-attributes`: js.Array[js.Object] = null,
    `destination-attributes-supported`: js.Array[String] = null,
    `destination-info`: String = null,
    `destination-is-directory`: js.UndefOr[Boolean] = js.undefined,
    `destination-mandatory-access-attributes`: js.Array[String] = null,
    `destination-name`: String = null,
    `destination-oauth-scope`: js.Array[String] = null,
    `destination-oauth-token`: js.Array[String] = null,
    `destination-oauth-uri`: String = null,
    `destination-uri`: String = null
  ): DestinationUriReady = {
    val __obj = js.Dynamic.literal()
    if (`destination-attributes` != null) __obj.updateDynamic("destination-attributes")(`destination-attributes`.asInstanceOf[js.Any])
    if (`destination-attributes-supported` != null) __obj.updateDynamic("destination-attributes-supported")(`destination-attributes-supported`.asInstanceOf[js.Any])
    if (`destination-info` != null) __obj.updateDynamic("destination-info")(`destination-info`.asInstanceOf[js.Any])
    if (!js.isUndefined(`destination-is-directory`)) __obj.updateDynamic("destination-is-directory")(`destination-is-directory`.get.asInstanceOf[js.Any])
    if (`destination-mandatory-access-attributes` != null) __obj.updateDynamic("destination-mandatory-access-attributes")(`destination-mandatory-access-attributes`.asInstanceOf[js.Any])
    if (`destination-name` != null) __obj.updateDynamic("destination-name")(`destination-name`.asInstanceOf[js.Any])
    if (`destination-oauth-scope` != null) __obj.updateDynamic("destination-oauth-scope")(`destination-oauth-scope`.asInstanceOf[js.Any])
    if (`destination-oauth-token` != null) __obj.updateDynamic("destination-oauth-token")(`destination-oauth-token`.asInstanceOf[js.Any])
    if (`destination-oauth-uri` != null) __obj.updateDynamic("destination-oauth-uri")(`destination-oauth-uri`.asInstanceOf[js.Any])
    if (`destination-uri` != null) __obj.updateDynamic("destination-uri")(`destination-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationUriReady]
  }
}

