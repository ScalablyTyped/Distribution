package typings.inversify

import typings.inversify.interfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverMod {
  
  @JSImport("inversify/lib/resolution/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolve[T](context: Context): T | js.Promise[T] | (js.Array[T | js.Promise[T]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(context.asInstanceOf[js.Any]).asInstanceOf[T | js.Promise[T] | (js.Array[T | js.Promise[T]])]
}
