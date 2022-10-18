package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider[T] extends StObject {
  
  def apply(args: Any*): (js.Function1[/* repeated */ Any, js.Promise[T]]) | js.Promise[T] = js.native
}
