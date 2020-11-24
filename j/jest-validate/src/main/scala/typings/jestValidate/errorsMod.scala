package typings.jestValidate

import typings.jestValidate.typesMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-validate/build/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  def errorMessage(option: String, received: js.Any, defaultValue: js.Any, options: ValidationOptions): Unit = js.native
  def errorMessage(
    option: String,
    received: js.Any,
    defaultValue: js.Any,
    options: ValidationOptions,
    path: js.Array[String]
  ): Unit = js.native
}
