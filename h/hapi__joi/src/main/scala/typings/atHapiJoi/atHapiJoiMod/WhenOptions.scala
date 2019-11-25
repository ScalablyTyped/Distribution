package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenOptions extends js.Object {
  /**
    * whether to stop applying further conditions if the condition is true.
    */
  var break: js.UndefOr[Boolean] = js.undefined
  /**
    * the required condition joi type.
    */
  var is: js.UndefOr[SchemaLike] = js.undefined
  /**
    * the alternative schema type if the condition is false. Required if then or switch are missing.
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  /**
    * the list of cases. Required if then is missing.  Required if then or otherwise are missing.
    */
  var switch: js.UndefOr[js.Array[SwitchCases | SwitchDefault]] = js.undefined
  /**
    * the alternative schema type if the condition is true. Required if otherwise or switch are missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}

object WhenOptions {
  @scala.inline
  def apply(
    break: js.UndefOr[Boolean] = js.undefined,
    is: SchemaLike = null,
    otherwise: SchemaLike = null,
    switch: js.Array[SwitchCases | SwitchDefault] = null,
    `then`: SchemaLike = null
  ): WhenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(break)) __obj.updateDynamic("break")(break.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    if (switch != null) __obj.updateDynamic("switch")(switch.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhenOptions]
  }
}

