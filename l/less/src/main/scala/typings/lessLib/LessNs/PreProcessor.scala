package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessor extends js.Object {
  def process(src: java.lang.String, extra: PreProcessorExtraInfo): java.lang.String
}

object PreProcessor {
  @scala.inline
  def apply(process: js.Function2[java.lang.String, PreProcessorExtraInfo, java.lang.String]): PreProcessor = {
    val __obj = js.Dynamic.literal(process = process)
  
    __obj.asInstanceOf[PreProcessor]
  }
}

