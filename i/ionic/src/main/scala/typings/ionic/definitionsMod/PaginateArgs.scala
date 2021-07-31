package typings.ionic.definitionsMod

import typings.ionic.anon.PartialPaginatorState
import typings.ionic.anon.Req
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<ionic.ionic/definitions.PaginatorDeps<T, ionic.ionic/definitions.PaginatorState>, 'reqgen' | 'guard' | 'state' | 'max'> */
trait PaginateArgs[T /* <: Response[js.Array[js.Object]] */] extends StObject {
  
  def guard(res: APIResponseSuccess): /* is T */ Boolean
  @JSName("guard")
  var guard_Original: PaginatorGuard[T]
  
  var max: js.UndefOr[Double] = js.undefined
  
  def reqgen(): js.Promise[Req]
  @JSName("reqgen")
  var reqgen_Original: PaginatorRequestGenerator
  
  var state: js.UndefOr[PartialPaginatorState] = js.undefined
}
object PaginateArgs {
  
  @scala.inline
  def apply[T /* <: Response[js.Array[js.Object]] */](guard: /* res */ APIResponseSuccess => /* is T */ Boolean, reqgen: () => js.Promise[Req]): PaginateArgs[T] = {
    val __obj = js.Dynamic.literal(guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    __obj.asInstanceOf[PaginateArgs[T]]
  }
  
  @scala.inline
  implicit class PaginateArgsMutableBuilder[Self <: PaginateArgs[?], T /* <: Response[js.Array[js.Object]] */] (val x: Self & PaginateArgs[T]) extends AnyVal {
    
    @scala.inline
    def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: PartialPaginatorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
