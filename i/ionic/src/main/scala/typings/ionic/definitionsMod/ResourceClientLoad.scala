package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceClientLoad[T /* <: js.Object */] extends js.Object {
  
  def load(id: String, modifiers: ResourceClientRequestModifiers): js.Promise[T] = js.native
  def load(id: Double, modifiers: ResourceClientRequestModifiers): js.Promise[T] = js.native
}
