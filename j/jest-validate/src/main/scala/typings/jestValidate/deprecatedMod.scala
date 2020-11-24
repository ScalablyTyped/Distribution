package typings.jestValidate

import typings.jestValidate.typesMod.DeprecatedOptions
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-validate/build/deprecated", JSImport.Namespace)
@js.native
object deprecatedMod extends js.Object {
  
  def deprecationWarning(
    config: Record[String, _],
    option: String,
    deprecatedOptions: DeprecatedOptions,
    options: ValidationOptions
  ): Boolean = js.native
}
