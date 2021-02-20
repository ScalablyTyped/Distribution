package typings.jestValidate

import typings.jestTypes.configMod.Argv
import typings.jestValidate.anon.Dicts
import typings.jestValidate.anon.HasDeprecationWarnings
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-validate", "ValidationError")
  @js.native
  class ValidationError protected ()
    extends typings.jestValidate.utilsMod.ValidationError {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
  }
  
  @JSImport("jest-validate", "createDidYouMeanMessage")
  @js.native
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = js.native
  
  @JSImport("jest-validate", "format")
  @js.native
  def format(value: js.Any): String = js.native
  
  @JSImport("jest-validate", "logValidationWarning")
  @js.native
  def logValidationWarning(name: String, message: String): Unit = js.native
  @JSImport("jest-validate", "logValidationWarning")
  @js.native
  def logValidationWarning(name: String, message: String, comment: String): Unit = js.native
  
  @JSImport("jest-validate", "multipleValidOptions")
  @js.native
  def multipleValidOptions[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = js.native
  
  @JSImport("jest-validate", "validate")
  @js.native
  def validate(config: Record[String, _], options: ValidationOptions): HasDeprecationWarnings = js.native
  
  @JSImport("jest-validate", "validateCLIOptions")
  @js.native
  def validateCLIOptions(argv: Argv, options: Dicts): Boolean = js.native
  @JSImport("jest-validate", "validateCLIOptions")
  @js.native
  def validateCLIOptions(argv: Argv, options: Dicts, rawArgv: js.Array[String]): Boolean = js.native
}
