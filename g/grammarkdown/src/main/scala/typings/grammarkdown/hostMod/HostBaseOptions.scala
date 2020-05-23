package typings.grammarkdown.hostMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostBaseOptions extends js.Object {
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var knownGrammars: js.UndefOr[Record[String, String]] = js.undefined
  var useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
}

object HostBaseOptions {
  @scala.inline
  def apply(
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    knownGrammars: Record[String, String] = null,
    useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
  ): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (knownGrammars != null) __obj.updateDynamic("knownGrammars")(knownGrammars.asInstanceOf[js.Any])
    if (!js.isUndefined(useBuiltinGrammars)) __obj.updateDynamic("useBuiltinGrammars")(useBuiltinGrammars.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostBaseOptions]
  }
}

