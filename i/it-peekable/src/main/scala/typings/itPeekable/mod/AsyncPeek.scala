package typings.itPeekable.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncPeek[T] extends js.Object {
  
  def peek(): js.Promise[IteratorResult[T, Unit]] = js.native
}
object AsyncPeek {
  
  @scala.inline
  def apply[T](peek: () => js.Promise[IteratorResult[T, Unit]]): AsyncPeek[T] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
    __obj.asInstanceOf[AsyncPeek[T]]
  }
  
  @scala.inline
  implicit class AsyncPeekOps[Self <: AsyncPeek[_], T] (val x: Self with AsyncPeek[T]) extends AnyVal {
    
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
    def setPeek(value: () => js.Promise[IteratorResult[T, Unit]]): Self = this.set("peek", js.Any.fromFunction0(value))
  }
}
