package typings.jqueryBootstrapWizard

import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.back
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.currentIndex
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.disable
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.display
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.enable
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.finish
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.first
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.hide
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.last
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.navigationLength
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.next
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.previous
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.remove
import typings.jqueryBootstrapWizard.jqueryBootstrapWizardStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def bootstrapWizard(): Wizard = js.native
  def bootstrapWizard(options: WizardOptions): Wizard = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_back(method: back): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_currentIndex(method: currentIndex): Double = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_disable(method: disable, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_display(method: display, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_enable(method: enable, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_finish(method: finish): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_first(method: first): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_hide(method: hide, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_last(method: last): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_navigationLength(method: navigationLength): Double = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_next(method: next): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_previous(method: previous): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double, removeTabPane: Boolean): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: String): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: Double): Unit = js.native
}

