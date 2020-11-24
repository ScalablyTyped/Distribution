package typings.ionicCliFramework.mod

import typings.ionicCliFramework.definitionsMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework", "InputValidationError")
@js.native
class InputValidationError protected ()
  extends typings.ionicCliFramework.errorsMod.InputValidationError {
  def this(message: String, errors: js.Array[ValidationError]) = this()
}
