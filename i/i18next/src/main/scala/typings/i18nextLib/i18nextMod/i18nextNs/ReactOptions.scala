package typings
package i18nextLib.i18nextMod.i18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactOptions extends js.Object {
  /**
           * set which events trigger a rerender, can be set to false or string of events
           * @default 'languageChanged loaded'
           */
  var bindI18n: js.UndefOr[java.lang.String | i18nextLib.i18nextLibNumbers.`false`] = js.undefined
  /**
           * set which events on store trigger a rerender, can be set to false or string of events
           * @default 'added removed'
           */
  var bindStore: js.UndefOr[java.lang.String | i18nextLib.i18nextLibNumbers.`false`] = js.undefined
  /**
           * set it to the default parent element created by the Trans component.
           * @default 'div'
           */
  var defaultTransParent: js.UndefOr[java.lang.String] = js.undefined
  /**
           * set it to fallback to let passed namespaces to translated hoc act as fallbacks
           * @default 'default'
           */
  var nsMode: js.UndefOr[i18nextLib.i18nextLibStrings.default | i18nextLib.i18nextLibStrings.fallback] = js.undefined
  /**
           * set to true if you like to wait for loaded in every translated hoc
           * @default false
           */
  @JSName("wait")
  var wait_FReactOptions: js.UndefOr[scala.Boolean] = js.undefined
}

