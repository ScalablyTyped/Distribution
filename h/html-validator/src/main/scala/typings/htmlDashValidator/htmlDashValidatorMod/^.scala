package typings.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: OptionsForExternalUrlAsValidationTargetAndObjectAsResult): js.Promise[ParsedJsonAsValidationResults] = js.native
  def apply(options: OptionsForExternalUrlAsValidationTargetAndTextAsResults): js.Promise[String] = js.native
  def apply(options: OptionsForHtmlFileAsValidationTargetAndObjectAsResult): js.Promise[ParsedJsonAsValidationResults] = js.native
  def apply(options: OptionsForHtmlFileAsValidationTargetAndTextAsResults): js.Promise[String] = js.native
}

