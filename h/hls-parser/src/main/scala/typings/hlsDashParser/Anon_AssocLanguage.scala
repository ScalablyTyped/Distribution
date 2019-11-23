package typings.hlsDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssocLanguage[T] extends js.Object {
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

object Anon_AssocLanguage {
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
  ): Anon_AssocLanguage[T] = {
    val __obj = js.Dynamic.literal(groupId = groupId, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (assocLanguage != null) __obj.updateDynamic("assocLanguage")(assocLanguage)
    if (!js.isUndefined(autoselect)) __obj.updateDynamic("autoselect")(autoselect)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (characteristics != null) __obj.updateDynamic("characteristics")(characteristics)
    if (!js.isUndefined(forced)) __obj.updateDynamic("forced")(forced)
    if (instreamId != null) __obj.updateDynamic("instreamId")(instreamId)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (language != null) __obj.updateDynamic("language")(language)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_AssocLanguage[T]]
  }
}

