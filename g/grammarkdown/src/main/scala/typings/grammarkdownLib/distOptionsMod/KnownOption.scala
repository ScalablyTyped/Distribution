package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownOption extends js.Object {
  var aliasFor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var convert: js.UndefOr[
    js.Function3[/* key */ java.lang.String, /* value */ java.lang.String, /* raw */ RawArguments, _]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var isUsage: js.UndefOr[scala.Boolean] = js.undefined
  var longName: java.lang.String
  var many: js.UndefOr[scala.Boolean] = js.undefined
  var param: js.UndefOr[java.lang.String] = js.undefined
  var shortName: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | (stdLib.Map[java.lang.String, _])] = js.undefined
  var validate: js.UndefOr[
    js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* raw */ RawArguments, 
      scala.Boolean
    ]
  ] = js.undefined
}

object KnownOption {
  @scala.inline
  def apply(
    longName: java.lang.String,
    aliasFor: js.Array[java.lang.String] = null,
    convert: js.Function3[/* key */ java.lang.String, /* value */ java.lang.String, /* raw */ RawArguments, _] = null,
    description: java.lang.String = null,
    error: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    isUsage: js.UndefOr[scala.Boolean] = js.undefined,
    many: js.UndefOr[scala.Boolean] = js.undefined,
    param: java.lang.String = null,
    shortName: java.lang.String = null,
    `type`: java.lang.String | (stdLib.Map[java.lang.String, _]) = null,
    validate: js.Function3[
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      /* raw */ RawArguments, 
      scala.Boolean
    ] = null
  ): KnownOption = {
    val __obj = js.Dynamic.literal(longName = longName)
    if (aliasFor != null) __obj.updateDynamic("aliasFor")(aliasFor)
    if (convert != null) __obj.updateDynamic("convert")(convert)
    if (description != null) __obj.updateDynamic("description")(description)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(isUsage)) __obj.updateDynamic("isUsage")(isUsage)
    if (!js.isUndefined(many)) __obj.updateDynamic("many")(many)
    if (param != null) __obj.updateDynamic("param")(param)
    if (shortName != null) __obj.updateDynamic("shortName")(shortName)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[KnownOption]
  }
}

