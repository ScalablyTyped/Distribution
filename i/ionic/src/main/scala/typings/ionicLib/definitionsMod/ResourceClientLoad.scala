package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceClientLoad[T /* <: js.Object */] extends js.Object {
  def load(id: java.lang.String, modifiers: ResourceClientRequestModifiers): stdLib.Promise[T] = js.native
  def load(id: scala.Double, modifiers: ResourceClientRequestModifiers): stdLib.Promise[T] = js.native
}

