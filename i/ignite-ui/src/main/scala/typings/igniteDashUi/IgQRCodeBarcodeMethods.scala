package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgQRCodeBarcodeMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns information about how the barcode is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the barcode e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): Unit
}

object IgQRCodeBarcodeMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    styleUpdated: () => Unit
  ): IgQRCodeBarcodeMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), styleUpdated = js.Any.fromFunction0(styleUpdated))
  
    __obj.asInstanceOf[IgQRCodeBarcodeMethods]
  }
}

