package typings.jestValidate

import typings.jestTypes.configMod.Argv
import typings.jestValidate.anon.Dicts
import typings.jestValidate.anon.HasDeprecationWarnings
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-validate", "ValidationError")
  @js.native
  class ValidationError protected ()
    extends typings.jestValidate.utilsMod.ValidationError {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
  }
  
  @scala.inline
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createDidYouMeanMessage")(unrecognized.asInstanceOf[js.Any], allowedOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def logValidationWarning(name: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def logValidationWarning(name: String, message: String, comment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logValidationWarning")(name.asInstanceOf[js.Any], message.asInstanceOf[js.Any], comment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def multipleValidOptions[T /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleValidOptions")(args.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any]
  
  @scala.inline
  def validate(config: Record[String, js.Any], options: ValidationOptions): HasDeprecationWarnings = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HasDeprecationWarnings]
  
  @scala.inline
  def validateCLIOptions(argv: Argv, options: Dicts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def validateCLIOptions(argv: Argv, options: Dicts, rawArgv: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCLIOptions")(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any], rawArgv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
