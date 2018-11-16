package typings
package jestDashValidateLib.jestDashValidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate", JSImport.Namespace)
@js.native
object jestDashValidateModMembers extends js.Object {
  def createDidYouMeanMessage(unrecognized: java.lang.String, allowedOptions: js.Array[java.lang.String]): java.lang.String = js.native
  def format(value: js.Any): java.lang.String = js.native
  def logValidationWarning(name: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def logValidationWarning(name: java.lang.String, message: java.lang.String, commant: java.lang.String): scala.Unit = js.native
  def validate(config: js.Object, options: ValidationOptions): jestDashValidateLib.Anon_HasDeprecationWarnings = js.native
}

