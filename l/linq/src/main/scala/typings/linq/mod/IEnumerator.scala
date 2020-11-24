package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumerator[T] extends js.Object {
  
  def current(): T = js.native
  
  def dispose(): Unit = js.native
  
  def moveNext(): Boolean = js.native
}
object IEnumerator {
  
  @scala.inline
  def apply[T](current: () => T, dispose: () => Unit, moveNext: () => Boolean): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), dispose = js.Any.fromFunction0(dispose), moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[IEnumerator[T]]
  }
  
  @scala.inline
  implicit class IEnumeratorOps[Self <: IEnumerator[_], T] (val x: Self with IEnumerator[T]) extends AnyVal {
    
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
    def setCurrent(value: () => T): Self = this.set("current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
}
