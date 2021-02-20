package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends StObject {
  
  val client: IClient = js.native
  
  def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  
  val max: js.UndefOr[Double] = js.native
  
  def reqgen(): js.Promise[Req] = js.native
  
  val state: js.UndefOr[Partial[S]] = js.native
}
object PaginatorDeps {
  
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */, S](client: IClient, guard: APIResponseSuccess => /* is T */ Boolean, reqgen: () => js.Promise[Req]): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
  
  @scala.inline
  implicit class PaginatorDepsMutableBuilder[Self <: PaginatorDeps[_, _], T /* <: Response[js.Array[js.Object]] */, S] (val x: Self with (PaginatorDeps[T, S])) extends AnyVal {
    
    @scala.inline
    def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuard(value: APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: Partial[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
