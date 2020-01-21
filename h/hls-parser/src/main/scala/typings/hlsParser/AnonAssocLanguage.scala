package typings.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssocLanguage[T] extends js.Object {
  var assocLanguage: js.UndefOr[String] = js.undefined
  var autoselect: js.UndefOr[Boolean] = js.undefined
  var channels: js.UndefOr[String] = js.undefined
  var characteristics: js.UndefOr[String] = js.undefined
  var forced: js.UndefOr[Boolean] = js.undefined
  var groupId: String
  var instreamId: js.UndefOr[String] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: T
  var uri: js.UndefOr[String] = js.undefined
}

object AnonAssocLanguage {
  @scala.inline
  def apply[T](
    groupId: String,
    name: String,
    `type`: T,
    assocLanguage: String = null,
    autoselect: js.UndefOr[Boolean] = js.undefined,
    channels: String = null,
    characteristics: String = null,
    forced: js.UndefOr[Boolean] = js.undefined,
    instreamId: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    uri: String = null
  ): AnonAssocLanguage[T] = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assocLanguage != null) __obj.updateDynamic("assocLanguage")(assocLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(autoselect)) __obj.updateDynamic("autoselect")(autoselect.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (characteristics != null) __obj.updateDynamic("characteristics")(characteristics.asInstanceOf[js.Any])
    if (!js.isUndefined(forced)) __obj.updateDynamic("forced")(forced.asInstanceOf[js.Any])
    if (instreamId != null) __obj.updateDynamic("instreamId")(instreamId.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssocLanguage[T]]
  }
}

