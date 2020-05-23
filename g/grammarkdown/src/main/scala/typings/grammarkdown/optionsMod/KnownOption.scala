package typings.grammarkdown.optionsMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownOption extends js.Object {
  var aliasFor: js.UndefOr[js.Array[String]] = js.undefined
  var convert: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, _]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isUsage: js.UndefOr[Boolean] = js.undefined
  var longName: String
  var many: js.UndefOr[Boolean] = js.undefined
  var param: js.UndefOr[String] = js.undefined
  var shortName: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String | (Map[String, _])] = js.undefined
  var validate: js.UndefOr[
    js.Function3[/* key */ String, /* value */ String, /* raw */ RawArguments, Boolean]
  ] = js.undefined
}

object KnownOption {
  @scala.inline
  def apply(
    longName: String,
    aliasFor: js.Array[String] = null,
    convert: (/* key */ String, /* value */ String, /* raw */ RawArguments) => _ = null,
    description: String = null,
    error: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isUsage: js.UndefOr[Boolean] = js.undefined,
    many: js.UndefOr[Boolean] = js.undefined,
    param: String = null,
    shortName: String = null,
    `type`: String | (Map[String, _]) = null,
    validate: (/* key */ String, /* value */ String, /* raw */ RawArguments) => Boolean = null
  ): KnownOption = {
    val __obj = js.Dynamic.literal(longName = longName.asInstanceOf[js.Any])
    if (aliasFor != null) __obj.updateDynamic("aliasFor")(aliasFor.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(js.Any.fromFunction3(convert))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUsage)) __obj.updateDynamic("isUsage")(isUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many.get.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3(validate))
    __obj.asInstanceOf[KnownOption]
  }
}

