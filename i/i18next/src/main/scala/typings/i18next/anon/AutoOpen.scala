package typings.i18next.anon

import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextStrings.altKey
import typings.i18next.i18nextStrings.ctrlKey
import typings.i18next.i18nextStrings.iframe
import typings.i18next.i18nextStrings.metaKey
import typings.i18next.i18nextStrings.shiftKey
import typings.i18next.i18nextStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoOpen extends js.Object {
  /**
    * If set to false you will need to open the editor via API
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to `<body>`
    * @default 'margin-right: 605px;'
    */
  var bodyStyle: js.UndefOr[String] = js.native
  /**
    * Enable by adding querystring locize=true; can be set to another value or turned off by setting to false
    * @default 'locize'
    */
  var enableByQS: js.UndefOr[String | `false`] = js.native
  /**
    * Enable on init without the need of adding querystring locize=true
    * @default false
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the `<iframe>`
    * @default 'z-index: 2000; position: fixed; top: 0; right: 0; bottom: 0; width: 600px; box-shadow: -3px 0 5px 0 rgba(0,0,0,0.5);'
    */
  var iframeContainerStyle: js.UndefOr[String] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the parent of `<iframe>`
    * @default 'height: 100%; width: 600px; border: none;'
    */
  var iframeStyle: js.UndefOr[String] = js.native
  /**
    * Use lng in editor, eg. if running with lng=cimode (i18next, locize)
    * @default null
    */
  var lngOverride: js.UndefOr[String | Null] = js.native
  /**
    * Use lng in editor taken from query string, eg. if running with lng=cimode (i18next, locize)
    * @default 'useLng'
    */
  var lngOverrideQS: js.UndefOr[String] = js.native
  /**
    * How the editor will open.
    * Setting to window will open a new window/tab instead
    * @default 'iframe'
    */
  var mode: js.UndefOr[iframe | window] = js.native
  /**
    * Handle when locize saved the edited translations, eg. reload website
    * @default noop
    */
  var onEditorSaved: js.UndefOr[js.Function2[/* lng */ Null, /* ns */ String | js.Array[String], Unit]] = js.native
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyModifier`
    * @default 24 (x)
    */
  var toggleKeyCode: js.UndefOr[Double] = js.native
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyCode`
    * @default 'ctrlKey'
    */
  var toggleKeyModifier: js.UndefOr[ctrlKey | metaKey | altKey | shiftKey] = js.native
}

object AutoOpen {
  @scala.inline
  def apply(): AutoOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoOpen]
  }
  @scala.inline
  implicit class AutoOpenOps[Self <: AutoOpen] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setBodyStyle(value: String): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    @scala.inline
    def setEnableByQS(value: String | `false`): Self = this.set("enableByQS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableByQS: Self = this.set("enableByQS", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIframeContainerStyle(value: String): Self = this.set("iframeContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeContainerStyle: Self = this.set("iframeContainerStyle", js.undefined)
    @scala.inline
    def setIframeStyle(value: String): Self = this.set("iframeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeStyle: Self = this.set("iframeStyle", js.undefined)
    @scala.inline
    def setLngOverride(value: String): Self = this.set("lngOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLngOverride: Self = this.set("lngOverride", js.undefined)
    @scala.inline
    def setLngOverrideNull: Self = this.set("lngOverride", null)
    @scala.inline
    def setLngOverrideQS(value: String): Self = this.set("lngOverrideQS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLngOverrideQS: Self = this.set("lngOverrideQS", js.undefined)
    @scala.inline
    def setMode(value: iframe | window): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnEditorSaved(value: (/* lng */ Null, /* ns */ String | js.Array[String]) => Unit): Self = this.set("onEditorSaved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEditorSaved: Self = this.set("onEditorSaved", js.undefined)
    @scala.inline
    def setToggleKeyCode(value: Double): Self = this.set("toggleKeyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleKeyCode: Self = this.set("toggleKeyCode", js.undefined)
    @scala.inline
    def setToggleKeyModifier(value: ctrlKey | metaKey | altKey | shiftKey): Self = this.set("toggleKeyModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleKeyModifier: Self = this.set("toggleKeyModifier", js.undefined)
  }
  
}

