package typings.javascriptObfuscator

import typings.javascriptObfuscator.iobfuscatedcodeMod.IObfuscatedCode
import typings.javascriptObfuscator.tinputoptionsMod.TInputOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator", JSImport.Namespace)
@js.native
object javascriptObfuscatorMod extends js.Object {
  def obfuscate(sourceCode: String): ObfuscatedCode = js.native
  def obfuscate(sourceCode: String, inputOptions: ObfuscatorOptions): ObfuscatedCode = js.native
  type ObfuscatedCode = IObfuscatedCode
  type ObfuscatorOptions = TInputOptions
}

