package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgQRCodeBarcodeMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns information about how the barcode is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the barcode e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): scala.Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): scala.Unit
}

object IgQRCodeBarcodeMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    exportVisualData: js.Function0[js.Object],
    flush: js.Function0[scala.Unit],
    styleUpdated: js.Function0[scala.Unit]
  ): IgQRCodeBarcodeMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeGlobalLanguage")(changeGlobalLanguage)
    __obj.updateDynamic("changeGlobalRegional")(changeGlobalRegional)
    __obj.updateDynamic("changeLocale")(changeLocale)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("exportVisualData")(exportVisualData)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("styleUpdated")(styleUpdated)
    __obj.asInstanceOf[IgQRCodeBarcodeMethods]
  }
}

