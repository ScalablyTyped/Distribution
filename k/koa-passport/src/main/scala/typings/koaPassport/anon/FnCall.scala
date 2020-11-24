package typings.koaPassport.anon

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[TUser, TID](
    fn: js.Function2[
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
      Unit
    ]
  ): Unit = js.native
  def apply[TUser, TID, TR /* <: IncomingMessage */](
    fn: js.Function3[
      /* req */ TR, 
      /* user */ TUser, 
      /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
      Unit
    ]
  ): Unit = js.native
}
