package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridRowSelectorsMethods extends js.Object {
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit
  def destroy(): Unit
  def rsRenderColgroup(): Unit
}

object IgGridRowSelectorsMethods {
  @scala.inline
  def apply(changeLocale: () => Unit, destroy: () => Unit, rsRenderColgroup: () => Unit): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup))
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
}

