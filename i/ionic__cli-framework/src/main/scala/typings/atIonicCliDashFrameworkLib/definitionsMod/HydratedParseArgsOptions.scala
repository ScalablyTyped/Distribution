package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydratedParseArgsOptions
  extends minimistLib.minimistMod.minimistNs.Opts {
  @JSName("alias")
  var alias_HydratedParseArgsOptions: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  @JSName("boolean")
  var boolean_HydratedParseArgsOptions: js.Array[java.lang.String]
  @JSName("default")
  var default_HydratedParseArgsOptions: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean]
  @JSName("string")
  var string_HydratedParseArgsOptions: js.Array[java.lang.String]
}

object HydratedParseArgsOptions {
  @scala.inline
  def apply(
    alias: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]],
    boolean: js.Array[java.lang.String],
    default: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean],
    string: js.Array[java.lang.String],
    `--`: js.UndefOr[scala.Boolean] = js.undefined,
    stopEarly: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: js.Function1[/* arg */ java.lang.String, scala.Boolean] = null
  ): HydratedParseArgsOptions = {
    val __obj = js.Dynamic.literal(alias = alias, boolean = boolean, default = default, string = string)
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`)
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly)
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[HydratedParseArgsOptions]
  }
}

