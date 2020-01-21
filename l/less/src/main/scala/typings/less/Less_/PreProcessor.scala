package typings.less.Less_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessor extends js.Object {
  def process(src: String, extra: PreProcessorExtraInfo): String
}

object PreProcessor {
  @scala.inline
  def apply(process: (String, PreProcessorExtraInfo) => String): PreProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
  
    __obj.asInstanceOf[PreProcessor]
  }
}

