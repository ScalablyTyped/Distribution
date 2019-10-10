package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleArgs extends js.Object {
  var assert: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: String
  /**
    * Undocumented properties
    */
  var normalize: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  var ref: js.UndefOr[Boolean] = js.undefined
}

object RuleArgs {
  @scala.inline
  def apply(
    name: String,
    assert: /* value */ js.Any => Boolean = null,
    message: String = null,
    normalize: /* value */ js.Any => _ = null,
    ref: js.UndefOr[Boolean] = js.undefined
  ): RuleArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (assert != null) __obj.updateDynamic("assert")(js.Any.fromFunction1(assert))
    if (message != null) __obj.updateDynamic("message")(message)
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[RuleArgs]
  }
}

