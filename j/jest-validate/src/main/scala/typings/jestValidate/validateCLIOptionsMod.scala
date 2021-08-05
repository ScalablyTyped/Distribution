package typings.jestValidate

import typings.jestTypes.configMod.Argv
import typings.jestValidate.anon.Dicts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateCLIOptionsMod {
  
  @JSImport("jest-validate/build/validateCLIOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(argv: Argv, options: Dicts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(argv: Argv, options: Dicts, rawArgv: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rawArgv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("jest-validate/build/validateCLIOptions", "DOCUMENTATION_NOTE")
  @js.native
  val DOCUMENTATION_NOTE: String = js.native
}
