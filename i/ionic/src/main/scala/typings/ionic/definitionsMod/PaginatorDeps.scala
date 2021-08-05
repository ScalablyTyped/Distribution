package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends StObject {
  
  val client: IClient
  
  def guard(res: APIResponseSuccess): /* is T */ Boolean
  
  val max: js.UndefOr[Double] = js.undefined
  
  def reqgen(): js.Promise[Req]
  
  val state: js.UndefOr[Partial[S]] = js.undefined
}
object PaginatorDeps {
  
  inline def apply[T /* <: Response[js.Array[js.Object]] */, S](client: IClient, guard: APIResponseSuccess => /* is T */ Boolean, reqgen: () => js.Promise[Req]): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
  
  extension [Self <: PaginatorDeps[?, ?], T /* <: Response[js.Array[js.Object]] */, S](x: Self & (PaginatorDeps[T, S])) {
    
    inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setGuard(value: APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    inline def setState(value: Partial[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
