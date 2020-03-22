package typings.jestValidate

import typings.jestTypes.configMod.Argv
import typings.jestValidate.typesMod.ValidationOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ValidationError protected ()
    extends typings.jestValidate.utilsMod.ValidationError {
    def this(name: String, message: String) = this()
    def this(name: String, message: String, comment: String) = this()
  }
  
  def createDidYouMeanMessage(unrecognized: String, allowedOptions: js.Array[String]): String = js.native
  def format(value: js.Any): String = js.native
  def logValidationWarning(name: String, message: String): Unit = js.native
  def logValidationWarning(name: String, message: String, comment: String): Unit = js.native
  def multipleValidOptions[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any = js.native
  def validate(config: Record[String, _], options: ValidationOptions): AnonHasDeprecationWarnings = js.native
  def validateCLIOptions(argv: Argv, options: AnonDicts): Boolean = js.native
  def validateCLIOptions(argv: Argv, options: AnonDicts, rawArgv: js.Array[String]): Boolean = js.native
}

