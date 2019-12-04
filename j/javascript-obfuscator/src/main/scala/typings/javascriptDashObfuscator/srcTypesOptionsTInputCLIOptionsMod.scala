package typings.javascriptDashObfuscator

import typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.config
import typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.exclude
import typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.output
import typings.javascriptDashObfuscator.javascriptDashObfuscatorStrings.version
import typings.javascriptDashObfuscator.srcInterfacesOptionsICLIOptionsMod.ICLIOptions
import typings.javascriptDashObfuscator.srcTypesTObjectMod.TObject
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/options/TInputCLIOptions", JSImport.Namespace)
@js.native
object srcTypesOptionsTInputCLIOptionsMod extends js.Object {
  type TInputCLIOptions = (Partial[Pick[ICLIOptions, config | exclude | output | version]]) with TObject[_]
}

