package typings.jestValidate

import typings.jestValidate.anon.HasDeprecationWarnings
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("jest-validate/build/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: Record[String, js.Any], options: ValidationOptions): HasDeprecationWarnings = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HasDeprecationWarnings]
}
