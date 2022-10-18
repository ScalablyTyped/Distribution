package typings.interactjsTypes.coreTypesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionMethod[T] extends StObject {
  
  def apply(): T = js.native
  def apply(options: Boolean): Any = js.native
  def apply(options: Partial[OrBoolean[T]]): Any = js.native
}
