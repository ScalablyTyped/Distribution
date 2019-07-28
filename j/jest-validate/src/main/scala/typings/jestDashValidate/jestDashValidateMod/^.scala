package typings.jestDashValidate.jestDashValidateMod

import typings.jestDashValidate.Anon_HasDeprecationWarnings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = js.native
  def format(value: js.Any): String = js.native
  def logValidationWarning(name: String, message: String): Unit = js.native
  def logValidationWarning(name: String, message: String, commant: String): Unit = js.native
  def validate(config: js.Object, options: ValidationOptions): Anon_HasDeprecationWarnings = js.native
}

