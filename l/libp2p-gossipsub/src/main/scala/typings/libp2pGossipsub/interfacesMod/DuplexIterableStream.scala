package typings.libp2pGossipsub.interfacesMod

import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplexIterableStream[T, U, V] extends js.Object {
  
  def sink(source: T): js.Promise[U] = js.native
  
  def source(): AsyncIterator[V, _, js.UndefOr[scala.Nothing]] = js.native
}
object DuplexIterableStream {
  
  @scala.inline
  def apply[T, U, V](sink: T => js.Promise[U], source: () => AsyncIterator[V, _, js.UndefOr[scala.Nothing]]): DuplexIterableStream[T, U, V] = {
    val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = js.Any.fromFunction0(source))
    __obj.asInstanceOf[DuplexIterableStream[T, U, V]]
  }
  
  @scala.inline
  implicit class DuplexIterableStreamOps[Self <: DuplexIterableStream[_, _, _], T, U, V] (val x: Self with (DuplexIterableStream[T, U, V])) extends AnyVal {
    
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
    def setSink(value: T => js.Promise[U]): Self = this.set("sink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSource(value: () => AsyncIterator[V, _, js.UndefOr[scala.Nothing]]): Self = this.set("source", js.Any.fromFunction0(value))
  }
}
