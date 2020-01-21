package typings.iltorb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliFlushable extends js.Object {
  def flush(): Unit
}

object BrotliFlushable {
  @scala.inline
  def apply(flush: () => Unit): BrotliFlushable = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[BrotliFlushable]
  }
}

