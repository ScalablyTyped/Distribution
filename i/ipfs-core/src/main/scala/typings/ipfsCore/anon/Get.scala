package typings.ipfsCore.anon

import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends js.Object {
  
  def findPeer(): js.Promise[scala.Nothing] = js.native
  
  def findProvs(): AsyncGenerator[scala.Nothing, scala.Nothing, _] = js.native
  
  def get(): js.Promise[scala.Nothing] = js.native
  
  def provide(): AsyncGenerator[scala.Nothing, scala.Nothing, _] = js.native
  
  def put(): js.Promise[scala.Nothing] = js.native
  
  def query(): AsyncGenerator[scala.Nothing, scala.Nothing, _] = js.native
}
object Get {
  
  @scala.inline
  def apply(
    findPeer: () => js.Promise[scala.Nothing],
    findProvs: () => AsyncGenerator[scala.Nothing, scala.Nothing, _],
    get: () => js.Promise[scala.Nothing],
    provide: () => AsyncGenerator[scala.Nothing, scala.Nothing, _],
    put: () => js.Promise[scala.Nothing],
    query: () => AsyncGenerator[scala.Nothing, scala.Nothing, _]
  ): Get = {
    val __obj = js.Dynamic.literal(findPeer = js.Any.fromFunction0(findPeer), findProvs = js.Any.fromFunction0(findProvs), get = js.Any.fromFunction0(get), provide = js.Any.fromFunction0(provide), put = js.Any.fromFunction0(put), query = js.Any.fromFunction0(query))
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
    
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
    def setFindPeer(value: () => js.Promise[scala.Nothing]): Self = this.set("findPeer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindProvs(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, _]): Self = this.set("findProvs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Promise[scala.Nothing]): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvide(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, _]): Self = this.set("provide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: () => js.Promise[scala.Nothing]): Self = this.set("put", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, _]): Self = this.set("query", js.Any.fromFunction0(value))
  }
}
