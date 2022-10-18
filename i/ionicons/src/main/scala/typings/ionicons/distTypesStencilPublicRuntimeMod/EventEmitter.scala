package typings.ionicons.distTypesStencilPublicRuntimeMod

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[T] extends StObject {
  
  def emit(): CustomEvent[T] = js.native
  def emit(data: T): CustomEvent[T] = js.native
}
