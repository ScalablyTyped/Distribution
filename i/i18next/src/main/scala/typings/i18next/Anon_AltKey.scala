package typings.i18next

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

trait Anon_AltKey extends js.Object {
  /**
    * If set to false you will need to open the editor via API
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to `<body>`
    * @default 'margin-right: 605px;'
    */
  var bodyStyle: js.UndefOr[String] = js.undefined
  /**
    * Enable by adding querystring locize=true; can be set to another value or turned off by setting to false
    * @default 'locize'
    */
  var enableByQS: js.UndefOr[String | `false`] = js.undefined
  /**
    * Enable on init without the need of adding querystring locize=true
    * @default false
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the `<iframe>`
    * @default 'z-index: 2000; position: fixed; top: 0; right: 0; bottom: 0; width: 600px; box-shadow: -3px 0 5px 0 rgba(0,0,0,0.5);'
    */
  var iframeContainerStyle: js.UndefOr[String] = js.undefined
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the parent of `<iframe>`
    * @default 'height: 100%; width: 600px; border: none;'
    */
  var iframeStyle: js.UndefOr[String] = js.undefined
  /**
    * Use lng in editor, eg. if running with lng=cimode (i18next, locize)
    * @default null
    */
  var lngOverride: js.UndefOr[String | Null] = js.undefined
  /**
    * Use lng in editor taken from query string, eg. if running with lng=cimode (i18next, locize)
    * @default 'useLng'
    */
  var lngOverrideQS: js.UndefOr[String] = js.undefined
  /**
    * How the editor will open.
    * Setting to window will open a new window/tab instead
    * @default 'iframe'
    */
  var mode: js.UndefOr[iframe | window] = js.undefined
  /**
    * Handle when locize saved the edited translations, eg. reload website
    * @default noop
    */
  var onEditorSaved: js.UndefOr[js.Function2[/* lng */ Null, /* ns */ String | js.Array[String], Unit]] = js.undefined
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyModifier`
    * @default 24 (x)
    */
  var toggleKeyCode: js.UndefOr[Double] = js.undefined
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyCode`
    * @default 'ctrlKey'
    */
  var toggleKeyModifier: js.UndefOr[ctrlKey | metaKey | altKey | shiftKey] = js.undefined
}

object Anon_AltKey {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    bodyStyle: String = null,
    enableByQS: String | `false` = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    iframeContainerStyle: String = null,
    iframeStyle: String = null,
    lngOverride: String = null,
    lngOverrideQS: String = null,
    mode: iframe | window = null,
    onEditorSaved: (/* lng */ Null, /* ns */ String | js.Array[String]) => Unit = null,
    toggleKeyCode: Int | Double = null,
    toggleKeyModifier: ctrlKey | metaKey | altKey | shiftKey = null
  ): Anon_AltKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (enableByQS != null) __obj.updateDynamic("enableByQS")(enableByQS.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (iframeContainerStyle != null) __obj.updateDynamic("iframeContainerStyle")(iframeContainerStyle.asInstanceOf[js.Any])
    if (iframeStyle != null) __obj.updateDynamic("iframeStyle")(iframeStyle.asInstanceOf[js.Any])
    if (lngOverride != null) __obj.updateDynamic("lngOverride")(lngOverride.asInstanceOf[js.Any])
    if (lngOverrideQS != null) __obj.updateDynamic("lngOverrideQS")(lngOverrideQS.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onEditorSaved != null) __obj.updateDynamic("onEditorSaved")(js.Any.fromFunction2(onEditorSaved))
    if (toggleKeyCode != null) __obj.updateDynamic("toggleKeyCode")(toggleKeyCode.asInstanceOf[js.Any])
    if (toggleKeyModifier != null) __obj.updateDynamic("toggleKeyModifier")(toggleKeyModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltKey]
  }
}

