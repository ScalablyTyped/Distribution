package typings.lowdb.mod.lodashAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionChain[T] extends js.Object {
  
  def write(): T with js.Promise[T] = js.native
}
object FunctionChain {
  
  @scala.inline
  def apply[T](write: () => T with js.Promise[T]): FunctionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
    __obj.asInstanceOf[FunctionChain[T]]
  }
  
  @scala.inline
  implicit class FunctionChainOps[Self <: FunctionChain[_], T] (val x: Self with FunctionChain[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWrite(value: () => T with js.Promise[T]): Self = this.set("write", js.Any.fromFunction0(value))
  }
}
