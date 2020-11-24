package typings.itPeekable.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peek[T] extends js.Object {
  
  def peek(): IteratorResult[T, Unit] = js.native
}
object Peek {
  
  @scala.inline
  def apply[T](peek: () => IteratorResult[T, Unit]): Peek[T] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
    __obj.asInstanceOf[Peek[T]]
  }
  
  @scala.inline
  implicit class PeekOps[Self <: Peek[_], T] (val x: Self with Peek[T]) extends AnyVal {
    
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
    def setPeek(value: () => IteratorResult[T, Unit]): Self = this.set("peek", js.Any.fromFunction0(value))
  }
}
