package typings.itMultipart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixPush[T] extends js.Object {
  
  def push(arg0: T): Unit = js.native
}
object PrefixPush {
  
  @scala.inline
  def apply[T](push: T => Unit): PrefixPush[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[PrefixPush[T]]
  }
  
  @scala.inline
  implicit class PrefixPushOps[Self <: PrefixPush[_], T] (val x: Self with PrefixPush[T]) extends AnyVal {
    
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
    def setPush(value: T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
}
