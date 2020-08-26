package typings.i18next.mod

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextStrings.fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactOptions extends js.Object {
  /**
    * Set which events trigger a re-render, can be set to false or string of events
    * @default 'languageChanged'
    */
  var bindI18n: js.UndefOr[String | `false`] = js.native
  /**
    * Set which events on store trigger a re-render, can be set to false or string of events
    * @default ''
    */
  var bindI18nStore: js.UndefOr[String | `false`] = js.native
  /**
    * Set it to the default parent element created by the Trans component.
    * @default 'div'
    */
  var defaultTransParent: js.UndefOr[String] = js.native
  /**
    * Function to generate an i18nKey from the defaultValue (or Trans children)
    * when no key is provided.
    * By default, the defaultValue (Trans text) itself is used as the key.
    * If you want to require keys for all translations, supply a function
    * that always throws an error.
    * @default undefined
    */
  var hashTransKey: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], js.UndefOr[_]]] = js.native
  /**
    * Set it to fallback to let passed namespaces to translated hoc act as fallbacks
    * @default 'default'
    */
  var nsMode: js.UndefOr[typings.i18next.i18nextStrings.default | fallback] = js.native
  /**
    * Set fallback value for Trans components without children
    * @default undefined
    */
  var transEmptyNodeValue: js.UndefOr[String] = js.native
  /**
    * Which nodes not to convert in defaultValue generation in the Trans component.
    * @default ['br', 'strong', 'i', 'p']
    */
  var transKeepBasicHtmlNodesFor: js.UndefOr[js.Array[String]] = js.native
  /**
    * Convert eg. <br/> found in translations to a react component of type br
    * @default true
    */
  var transSupportBasicHtmlNodes: js.UndefOr[Boolean] = js.native
  /**
    * Set it to false if you do not want to use Suspense
    * @default true
    */
  var useSuspense: js.UndefOr[Boolean] = js.native
  /**
    * Set to true if you like to wait for loaded in every translated hoc
    * @default false
    */
  @JSName("wait")
  var wait_FReactOptions: js.UndefOr[Boolean] = js.native
}

object ReactOptions {
  @scala.inline
  def apply(): ReactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactOptions]
  }
  @scala.inline
  implicit class ReactOptionsOps[Self <: ReactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindI18n(value: String | `false`): Self = this.set("bindI18n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindI18n: Self = this.set("bindI18n", js.undefined)
    @scala.inline
    def setBindI18nStore(value: String | `false`): Self = this.set("bindI18nStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindI18nStore: Self = this.set("bindI18nStore", js.undefined)
    @scala.inline
    def setDefaultTransParent(value: String): Self = this.set("defaultTransParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTransParent: Self = this.set("defaultTransParent", js.undefined)
    @scala.inline
    def setHashTransKey(value: /* defaultValue */ js.UndefOr[js.Any] => js.UndefOr[_]): Self = this.set("hashTransKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHashTransKey: Self = this.set("hashTransKey", js.undefined)
    @scala.inline
    def setNsMode(value: typings.i18next.i18nextStrings.default | fallback): Self = this.set("nsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsMode: Self = this.set("nsMode", js.undefined)
    @scala.inline
    def setTransEmptyNodeValue(value: String): Self = this.set("transEmptyNodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransEmptyNodeValue: Self = this.set("transEmptyNodeValue", js.undefined)
    @scala.inline
    def setTransKeepBasicHtmlNodesForVarargs(value: String*): Self = this.set("transKeepBasicHtmlNodesFor", js.Array(value :_*))
    @scala.inline
    def setTransKeepBasicHtmlNodesFor(value: js.Array[String]): Self = this.set("transKeepBasicHtmlNodesFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransKeepBasicHtmlNodesFor: Self = this.set("transKeepBasicHtmlNodesFor", js.undefined)
    @scala.inline
    def setTransSupportBasicHtmlNodes(value: Boolean): Self = this.set("transSupportBasicHtmlNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransSupportBasicHtmlNodes: Self = this.set("transSupportBasicHtmlNodes", js.undefined)
    @scala.inline
    def setUseSuspense(value: Boolean): Self = this.set("useSuspense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSuspense: Self = this.set("useSuspense", js.undefined)
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

