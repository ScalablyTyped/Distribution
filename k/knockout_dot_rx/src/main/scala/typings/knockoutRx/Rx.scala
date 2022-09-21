package typings.knockoutRx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait Observable[T] extends StObject {
    
    def toKoObservable(): Any = js.native
    def toKoObservable(initialValue: T): Any = js.native
    
    def toKoSubscribable(): Any = js.native
  }
  
  @js.native
  trait Subject[T] extends StObject {
    
    def toKoObservable(): Any = js.native
    def toKoObservable(initialValue: T): Any = js.native
  }
}
