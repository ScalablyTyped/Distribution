package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/validators", JSImport.Namespace)
@js.native
object libValidatorsMod extends js.Object {
  val validators: atIonicCliDashFrameworkLib.definitionsMod.Validators = js.native
  def combine(validators: atIonicCliDashFrameworkLib.definitionsMod.Validator*): atIonicCliDashFrameworkLib.definitionsMod.Validator = js.native
  def contains(
    values: js.Array[js.UndefOr[java.lang.String]],
    hasCaseSensitive: atIonicCliDashFrameworkLib.Anon_CaseSensitive
  ): atIonicCliDashFrameworkLib.definitionsMod.Validator = js.native
  def validate(
    input: java.lang.String,
    key: java.lang.String,
    validatorsToUse: js.Array[atIonicCliDashFrameworkLib.definitionsMod.Validator]
  ): scala.Unit = js.native
}

