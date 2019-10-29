package typings.javascriptDashObfuscator.srcInterfacesSourceDashCodeIObfuscatedCodeMod

import typings.javascriptDashObfuscator.srcInterfacesIInitializableMod.IInitializable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObfuscatedCode
  extends IInitializable[js.Tuple2[String, String]] {
  /**
    * @return {string}
    */
  def getObfuscatedCode(): String
  /**
    * @return {string}
    */
  def getSourceMap(): String
}

object IObfuscatedCode {
  @scala.inline
  def apply(
    getObfuscatedCode: () => String,
    getSourceMap: () => String,
    initialize: js.Tuple2[String, String] => Unit
  ): IObfuscatedCode = {
    val __obj = js.Dynamic.literal(getObfuscatedCode = js.Any.fromFunction0(getObfuscatedCode), getSourceMap = js.Any.fromFunction0(getSourceMap), initialize = js.Any.fromFunction1(initialize))
  
    __obj.asInstanceOf[IObfuscatedCode]
  }
}

