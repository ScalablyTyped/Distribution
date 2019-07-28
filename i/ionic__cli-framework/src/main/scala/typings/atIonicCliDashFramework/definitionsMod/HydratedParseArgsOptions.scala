package typings.atIonicCliDashFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.minimist.minimistMod.Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydratedParseArgsOptions extends Opts {
  @JSName("alias")
  var alias_HydratedParseArgsOptions: StringDictionary[js.Array[String]]
  @JSName("boolean")
  var boolean_HydratedParseArgsOptions: js.Array[String]
  @JSName("default")
  var default_HydratedParseArgsOptions: StringDictionary[String | Boolean]
  @JSName("string")
  var string_HydratedParseArgsOptions: js.Array[String]
}

object HydratedParseArgsOptions {
  @scala.inline
  def apply(
    alias: StringDictionary[js.Array[String]],
    boolean: js.Array[String],
    default: StringDictionary[String | Boolean],
    string: js.Array[String],
    `--`: js.UndefOr[Boolean] = js.undefined,
    stopEarly: js.UndefOr[Boolean] = js.undefined,
    unknown: /* arg */ String => Boolean = null
  ): HydratedParseArgsOptions = {
    val __obj = js.Dynamic.literal(alias = alias, boolean = boolean, default = default, string = string)
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`)
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly)
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[HydratedParseArgsOptions]
  }
}

