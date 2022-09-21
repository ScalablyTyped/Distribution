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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def bootstrapWizard(): Wizard = js.native
  def bootstrapWizard(method: currentIndex | navigationLength): Double = js.native
  def bootstrapWizard(method: enable | disable | display | hide, index: Double): Unit = js.native
  def bootstrapWizard(options: WizardOptions): Wizard = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_Unit(method: next | previous | first | last | back | finish): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_remove(method: remove, index: Double, removeTabPane: Boolean): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: String): Unit = js.native
  @JSName("bootstrapWizard")
  def bootstrapWizard_show(method: show, indexOrId: Double): Unit = js.native
}
