package typings.i18next.i18nextMod

import typings.i18next.i18nextNumbers.`false`
import typings.i18next.i18nextStrings.default
import typings.i18next.i18nextStrings.fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactOptions extends js.Object {
  /**
    * set which events trigger a rerender, can be set to false or string of events
    * @default 'languageChanged loaded'
    */
  var bindI18n: js.UndefOr[String | `false`] = js.undefined
  /**
    * set which events on store trigger a rerender, can be set to false or string of events
    * @default 'added removed'
    */
  var bindStore: js.UndefOr[String | `false`] = js.undefined
  /**
    * set it to the default parent element created by the Trans component.
    * @default 'div'
    */
  var defaultTransParent: js.UndefOr[String] = js.undefined
  /**
    * set it to fallback to let passed namespaces to translated hoc act as fallbacks
    * @default 'default'
    */
  var nsMode: js.UndefOr[default | fallback] = js.undefined
  /**
    * set to true if you like to wait for loaded in every translated hoc
    * @default false
    */
  @JSName("wait")
  var wait_FReactOptions: js.UndefOr[Boolean] = js.undefined
}

object ReactOptions {
  @scala.inline
  def apply(
    bindI18n: String | `false` = null,
    bindStore: String | `false` = null,
    defaultTransParent: String = null,
    nsMode: default | fallback = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): ReactOptions = {
    val __obj = js.Dynamic.literal()
    if (bindI18n != null) __obj.updateDynamic("bindI18n")(bindI18n.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore.asInstanceOf[js.Any])
    if (defaultTransParent != null) __obj.updateDynamic("defaultTransParent")(defaultTransParent)
    if (nsMode != null) __obj.updateDynamic("nsMode")(nsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[ReactOptions]
  }
}

