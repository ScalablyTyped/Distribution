package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCompilerErrors extends js.Object {
  def clear(): js.Any
  def save(): js.Any
}

object FlashCompilerErrors {
  @scala.inline
  def apply(clear: () => js.Any, save: () => js.Any): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[FlashCompilerErrors]
  }
}

