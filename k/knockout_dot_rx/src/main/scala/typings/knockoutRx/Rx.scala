package typings.knockoutRx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait Observable[T] extends StObject {
    
    def toKoObservable(): js.Any = js.native
    def toKoObservable(initialValue: T): js.Any = js.native
    
    def toKoSubscribable(): js.Any = js.native
  }
  
  @js.native
  trait Subject[T] extends StObject {
    
    def toKoObservable(): js.Any = js.native
    def toKoObservable(initialValue: T): js.Any = js.native
  }
}
