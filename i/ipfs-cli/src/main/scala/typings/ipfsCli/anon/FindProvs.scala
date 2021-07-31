package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindProvs extends StObject {
  
  def findPeer(): js.Promise[scala.Nothing]
  
  def findProvs(): AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]
  
  def get(): js.Promise[scala.Nothing]
  
  def provide(): AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]
  
  def put(): js.Promise[scala.Nothing]
  
  def query(): AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]
}
object FindProvs {
  
  @scala.inline
  def apply(
    findPeer: () => js.Promise[scala.Nothing],
    findProvs: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any],
    get: () => js.Promise[scala.Nothing],
    provide: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any],
    put: () => js.Promise[scala.Nothing],
    query: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]
  ): FindProvs = {
    val __obj = js.Dynamic.literal(findPeer = js.Any.fromFunction0(findPeer), findProvs = js.Any.fromFunction0(findProvs), get = js.Any.fromFunction0(get), provide = js.Any.fromFunction0(provide), put = js.Any.fromFunction0(put), query = js.Any.fromFunction0(query))
    __obj.asInstanceOf[FindProvs]
  }
  
  @scala.inline
  implicit class FindProvsMutableBuilder[Self <: FindProvs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindPeer(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "findPeer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindProvs(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]): Self = StObject.set(x, "findProvs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvide(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]): Self = StObject.set(x, "provide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "put", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQuery(value: () => AsyncGenerator[scala.Nothing, scala.Nothing, js.Any]): Self = StObject.set(x, "query", js.Any.fromFunction0(value))
  }
}
