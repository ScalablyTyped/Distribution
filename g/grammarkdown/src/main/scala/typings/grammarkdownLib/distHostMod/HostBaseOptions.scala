package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostBaseOptions extends js.Object {
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var knownGrammars: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var useBuiltinGrammars: js.UndefOr[scala.Boolean] = js.undefined
}

object HostBaseOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    knownGrammars: stdLib.Record[java.lang.String, java.lang.String] = null,
    useBuiltinGrammars: js.UndefOr[scala.Boolean] = js.undefined
  ): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars)
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars)
    __obj.asInstanceOf[HostBaseOptions]
  }
}

