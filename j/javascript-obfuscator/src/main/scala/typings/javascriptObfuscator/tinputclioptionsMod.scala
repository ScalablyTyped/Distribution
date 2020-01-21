package typings.javascriptObfuscator

import typings.javascriptObfuscator.iclioptionsMod.ICLIOptions
import typings.javascriptObfuscator.javascriptObfuscatorStrings.config
import typings.javascriptObfuscator.javascriptObfuscatorStrings.exclude
import typings.javascriptObfuscator.javascriptObfuscatorStrings.output
import typings.javascriptObfuscator.javascriptObfuscatorStrings.version
import typings.javascriptObfuscator.tobjectMod.TObject
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/options/TInputCLIOptions", JSImport.Namespace)
@js.native
object tinputclioptionsMod extends js.Object {
  type TInputCLIOptions = (Partial[Pick[ICLIOptions, config | exclude | output | version]]) with TObject[_]
}

