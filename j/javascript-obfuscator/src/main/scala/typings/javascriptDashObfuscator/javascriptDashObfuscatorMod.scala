package typings.javascriptDashObfuscator

import typings.javascriptDashObfuscator.srcInterfacesSourceDashCodeIObfuscatedCodeMod.IObfuscatedCode
import typings.javascriptDashObfuscator.srcTypesOptionsTInputOptionsMod.TInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator", JSImport.Namespace)
@js.native
object javascriptDashObfuscatorMod extends js.Object {
  def obfuscate(sourceCode: String): ObfuscatedCode = js.native
  def obfuscate(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
  type ObfuscatedCode = IObfuscatedCode
  type ObfuscatorOptions = TInputOptions
}

