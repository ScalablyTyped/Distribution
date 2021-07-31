package typings.jestValidate

import typings.jestValidate.typesMod.DeprecatedOptions
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("jest-validate/build/deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deprecationWarning(
    config: Record[String, js.Any],
    option: String,
    deprecatedOptions: DeprecatedOptions,
    options: ValidationOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarning")(config.asInstanceOf[js.Any], option.asInstanceOf[js.Any], deprecatedOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
