package typings.jestValidate

import typings.jestTypes.configMod.Argv
import typings.jestValidate.anon.Dicts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate/build/validateCLIOptions", JSImport.Namespace)
@js.native
object validateCLIOptionsMod extends js.Object {
  val DOCUMENTATION_NOTE: String = js.native
  def default(argv: Argv, options: Dicts): Boolean = js.native
  def default(argv: Argv, options: Dicts, rawArgv: js.Array[String]): Boolean = js.native
}

