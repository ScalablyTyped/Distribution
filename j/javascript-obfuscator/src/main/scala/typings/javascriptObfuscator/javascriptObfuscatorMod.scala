package typings.javascriptObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator", JSImport.Namespace)
@js.native
object javascriptObfuscatorMod extends js.Object {
  val version: String = js.native
  def obfuscate(sourceCode: String): ObfuscatedCode = js.native
  def obfuscate(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
  type ObfuscatedCode = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IObfuscatedCode */ js.Any
  type ObfuscatorOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TInputOptions */ js.Any
}

