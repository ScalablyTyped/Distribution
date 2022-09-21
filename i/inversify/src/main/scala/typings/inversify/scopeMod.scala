package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.RequestScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  @JSImport("inversify/lib/scope/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveToScope[T](requestScope: RequestScope, binding: Binding[T], result: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToScope")(requestScope.asInstanceOf[js.Any], binding.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveToScope[T](requestScope: RequestScope, binding: Binding[T], result: js.Promise[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveToScope")(requestScope.asInstanceOf[js.Any], binding.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tryGetFromScope[T](requestScope: RequestScope, binding: Binding[T]): T | js.Promise[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("tryGetFromScope")(requestScope.asInstanceOf[js.Any], binding.asInstanceOf[js.Any])).asInstanceOf[T | js.Promise[T] | Null]
}
