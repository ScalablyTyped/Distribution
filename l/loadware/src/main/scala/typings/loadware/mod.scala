package typings.loadware

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[F /* <: AnyFunction */](loadable: Loadable[F]*): js.Array[F] = ^.asInstanceOf[js.Dynamic].apply(loadable.asInstanceOf[js.Any]).asInstanceOf[js.Array[F]]
  
  @JSImport("loadware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AnyFunction = js.Function
  
  type Loadable[F /* <: AnyFunction */] = String | F | RecursiveLoadable[F]
  
  @js.native
  trait RecursiveLoadable[F /* <: AnyFunction */]
    extends StObject
       with Array[F | Loadable[F]]
}
