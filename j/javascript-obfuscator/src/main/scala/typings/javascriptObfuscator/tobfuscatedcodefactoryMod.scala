package typings.javascriptObfuscator

import typings.javascriptObfuscator.iobfuscatedcodeMod.IObfuscatedCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/container/source-code/TObfuscatedCodeFactory", JSImport.Namespace)
@js.native
object tobfuscatedcodefactoryMod extends js.Object {
  type TObfuscatedCodeFactory = js.Function2[/* obfuscatedCode */ String, /* sourceMap */ String, IObfuscatedCode]
}

