package typings
package jqueryDotBootstrapDotWizardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var bootstrapWizard: Wizard
}

object JQueryStatic {
  @scala.inline
  def apply(bootstrapWizard: Wizard): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrapWizard")(bootstrapWizard)
    __obj.asInstanceOf[JQueryStatic]
  }
}

