package typings.knockoutRx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  
  @js.native
  trait Observable[T] extends js.Object {
    
    def toKoObservable(): js.Any = js.native
    def toKoObservable(initialValue: T): js.Any = js.native
    
    def toKoSubscribable(): js.Any = js.native
  }
  
  @js.native
  trait Subject[T] extends js.Object {
    
    def toKoObservable(): js.Any = js.native
    def toKoObservable(initialValue: T): js.Any = js.native
  }
}
