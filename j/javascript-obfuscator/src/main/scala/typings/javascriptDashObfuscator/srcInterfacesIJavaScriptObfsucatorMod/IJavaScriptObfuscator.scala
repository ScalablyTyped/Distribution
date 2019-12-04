package typings.javascriptDashObfuscator.srcInterfacesIJavaScriptObfsucatorMod

import typings.javascriptDashObfuscator.srcInterfacesSourceDashCodeIObfuscatedCodeMod.IObfuscatedCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJavaScriptObfuscator extends js.Object {
  /**
    * @param sourceCode
    * @returns IObfuscatedCode
    */
  def obfuscate(sourceCode: String): IObfuscatedCode
}

object IJavaScriptObfuscator {
  @scala.inline
  def apply(obfuscate: String => IObfuscatedCode): IJavaScriptObfuscator = {
    val __obj = js.Dynamic.literal(obfuscate = js.Any.fromFunction1(obfuscate))
  
    __obj.asInstanceOf[IJavaScriptObfuscator]
  }
}

