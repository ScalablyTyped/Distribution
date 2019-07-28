package typings.json5

import typings.json5.json5Mod.JSONReplacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quote extends js.Object {
  var quote: js.UndefOr[String] = js.undefined
  var replacer: js.UndefOr[JSONReplacer] = js.undefined
  var space: js.UndefOr[Double | String] = js.undefined
}

object Anon_Quote {
  @scala.inline
  def apply(quote: String = null, replacer: JSONReplacer = null, space: Double | String = null): Anon_Quote = {
    val __obj = js.Dynamic.literal()
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Quote]
  }
}

