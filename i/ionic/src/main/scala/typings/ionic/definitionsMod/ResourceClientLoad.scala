package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceClientLoad[T /* <: js.Object */] extends StObject {
  
  def load(id: String, modifiers: ResourceClientRequestModifiers): js.Promise[T] = js.native
  def load(id: Double, modifiers: ResourceClientRequestModifiers): js.Promise[T] = js.native
}
