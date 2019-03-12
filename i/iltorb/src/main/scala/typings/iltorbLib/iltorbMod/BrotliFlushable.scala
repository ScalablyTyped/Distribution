package typings
package iltorbLib.iltorbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliFlushable extends js.Object {
  def flush(): scala.Unit
}

object BrotliFlushable {
  @scala.inline
  def apply(flush: () => scala.Unit): BrotliFlushable = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[BrotliFlushable]
  }
}

