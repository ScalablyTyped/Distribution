package typings.localizedDashStrings.localizedDashStringsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var customLanguageInterface: js.UndefOr[GetInterfaceLanguageCallback] = js.undefined
  var logsEnabled: js.UndefOr[Boolean] = js.undefined
  var pseudo: js.UndefOr[Boolean] = js.undefined
  var pseudoMultipleLanguages: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    customLanguageInterface: GetInterfaceLanguageCallback = null,
    logsEnabled: js.UndefOr[Boolean] = js.undefined,
    pseudo: js.UndefOr[Boolean] = js.undefined,
    pseudoMultipleLanguages: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (customLanguageInterface != null) __obj.updateDynamic("customLanguageInterface")(customLanguageInterface)
    if (!js.isUndefined(logsEnabled)) __obj.updateDynamic("logsEnabled")(logsEnabled)
    if (!js.isUndefined(pseudo)) __obj.updateDynamic("pseudo")(pseudo)
    if (!js.isUndefined(pseudoMultipleLanguages)) __obj.updateDynamic("pseudoMultipleLanguages")(pseudoMultipleLanguages)
    __obj.asInstanceOf[Options]
  }
}

