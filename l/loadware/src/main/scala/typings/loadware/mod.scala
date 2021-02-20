package typings.loadware

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loadware", JSImport.Namespace)
  @js.native
  def apply[F /* <: AnyFunction */](loadable: Loadable[F]*): js.Array[F] = js.native
  
  type AnyFunction = js.Function
  
  type Loadable[F /* <: AnyFunction */] = String | F | RecursiveLoadable[F]
  
  @js.native
  trait RecursiveLoadable[F /* <: AnyFunction */] extends Array[F | Loadable[F]]
}
