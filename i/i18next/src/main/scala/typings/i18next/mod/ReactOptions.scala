package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextStrings.default
import typings.i18next.i18nextStrings.fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactOptions extends js.Object {
  /**
    * Set which events trigger a re-render, can be set to false or string of events
    * @default 'languageChanged loaded'
    */
  var bindI18n: js.UndefOr[String | `false`] = js.undefined
  /**
    * Set which events on store trigger a re-render, can be set to false or string of events
    * @default 'added removed'
    */
  var bindStore: js.UndefOr[String | `false`] = js.undefined
  /**
    * Set it to the default parent element created by the Trans component.
    * @default 'div'
    */
  var defaultTransParent: js.UndefOr[String] = js.undefined
  /**
    * Function to generate an i18nKey from the defaultValue (or Trans children)
    * when no key is provided.
    * By default, the defaultValue (Trans text) itself is used as the key.
    * If you want to require keys for all translations, supply a function
    * that always throws an error.
    * @default undefined
    */
  var hashTransKey: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], js.UndefOr[_]]] = js.undefined
  /**
    * Set it to fallback to let passed namespaces to translated hoc act as fallbacks
    * @default 'default'
    */
  var nsMode: js.UndefOr[default | fallback] = js.undefined
  /**
    * Set fallback value for Trans components without children
    * @default undefined
    */
  var transEmptyNodeValue: js.UndefOr[String] = js.undefined
  /**
    * Which nodes not to convert in defaultValue generation in the Trans component.
    * @default ['br', 'strong', 'i', 'p']
    */
  var transKeepBasicHtmlNodesFor: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Convert eg. <br/> found in translations to a react component of type br
    * @default true
    */
  var transSupportBasicHtmlNodes: js.UndefOr[Boolean] = js.undefined
  /**
    * Set it to false if you do not want to use Suspense
    * @default true
    */
  var useSuspense: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true if you like to wait for loaded in every translated hoc
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
    hashTransKey: /* defaultValue */ js.UndefOr[js.Any] => js.UndefOr[_] = null,
    nsMode: default | fallback = null,
    transEmptyNodeValue: String = null,
    transKeepBasicHtmlNodesFor: js.Array[String] = null,
    transSupportBasicHtmlNodes: js.UndefOr[Boolean] = js.undefined,
    useSuspense: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): ReactOptions = {
    val __obj = js.Dynamic.literal()
    if (bindI18n != null) __obj.updateDynamic("bindI18n")(bindI18n.asInstanceOf[js.Any])
    if (bindStore != null) __obj.updateDynamic("bindStore")(bindStore.asInstanceOf[js.Any])
    if (defaultTransParent != null) __obj.updateDynamic("defaultTransParent")(defaultTransParent.asInstanceOf[js.Any])
    if (hashTransKey != null) __obj.updateDynamic("hashTransKey")(js.Any.fromFunction1(hashTransKey))
    if (nsMode != null) __obj.updateDynamic("nsMode")(nsMode.asInstanceOf[js.Any])
    if (transEmptyNodeValue != null) __obj.updateDynamic("transEmptyNodeValue")(transEmptyNodeValue.asInstanceOf[js.Any])
    if (transKeepBasicHtmlNodesFor != null) __obj.updateDynamic("transKeepBasicHtmlNodesFor")(transKeepBasicHtmlNodesFor.asInstanceOf[js.Any])
    if (!js.isUndefined(transSupportBasicHtmlNodes)) __obj.updateDynamic("transSupportBasicHtmlNodes")(transSupportBasicHtmlNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(useSuspense)) __obj.updateDynamic("useSuspense")(useSuspense.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactOptions]
  }
}

