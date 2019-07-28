package typings.atJupyterlabServices

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allowstdin extends js.Object {
  /**
    * Whether to allow stdin requests.
    * The default is `true`.
    */
  var allow_stdin: js.UndefOr[Boolean] = js.undefined
  /**
    * The code to execute.
    */
  var code: String
  /**
    * Whether to execute the code as quietly as possible.
    * The default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to the abort execution queue on an error.
    * The default is `false`.
    */
  var stop_on_error: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to store history of the execution.
    * The default `true` if silent is False.
    * It is forced to  `false ` if silent is `true`.
    */
  var store_history: js.UndefOr[Boolean] = js.undefined
  /**
    * A mapping of names to expressions to be evaluated in the
    * kernel's interactive namespace.
    */
  var user_expressions: js.UndefOr[JSONObject] = js.undefined
}

object Anon_Allowstdin {
  @scala.inline
  def apply(
    code: String,
    allow_stdin: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    stop_on_error: js.UndefOr[Boolean] = js.undefined,
    store_history: js.UndefOr[Boolean] = js.undefined,
    user_expressions: JSONObject = null
  ): Anon_Allowstdin = {
    val __obj = js.Dynamic.literal(code = code)
    if (!js.isUndefined(allow_stdin)) __obj.updateDynamic("allow_stdin")(allow_stdin)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(stop_on_error)) __obj.updateDynamic("stop_on_error")(stop_on_error)
    if (!js.isUndefined(store_history)) __obj.updateDynamic("store_history")(store_history)
    if (user_expressions != null) __obj.updateDynamic("user_expressions")(user_expressions)
    __obj.asInstanceOf[Anon_Allowstdin]
  }
}

