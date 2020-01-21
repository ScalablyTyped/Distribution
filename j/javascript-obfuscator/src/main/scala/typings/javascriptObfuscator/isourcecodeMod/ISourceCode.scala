package typings.javascriptObfuscator.isourcecodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceCode extends js.Object {
  /**
    * @returns string
    */
  def getSourceCode(): String
  /**
    * @returns string
    */
  def getSourceMap(): String
}

object ISourceCode {
  @scala.inline
  def apply(getSourceCode: () => String, getSourceMap: () => String): ISourceCode = {
    val __obj = js.Dynamic.literal(getSourceCode = js.Any.fromFunction0(getSourceCode), getSourceMap = js.Any.fromFunction0(getSourceMap))
  
    __obj.asInstanceOf[ISourceCode]
  }
}

