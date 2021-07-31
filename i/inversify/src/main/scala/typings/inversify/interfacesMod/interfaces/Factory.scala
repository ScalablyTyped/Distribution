package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory[T] extends StObject {
  
  def apply(args: js.Any*): (js.Function1[/* repeated */ js.Any, T]) | T = js.native
}
