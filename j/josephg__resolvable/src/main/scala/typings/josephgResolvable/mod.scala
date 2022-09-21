package typings.josephgResolvable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@josephg/resolvable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): Resolvable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Resolvable[T]]
  
  @js.native
  trait Resolvable[T]
    extends js.Promise[T] {
    
    def reject(e: Any): Unit = js.native
    
    def resolve(t: T): Unit = js.native
  }
}
