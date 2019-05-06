package typings
package ioniconsLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter[T] extends js.Object {
  def emit(): stdLib.CustomEvent[T] = js.native
  def emit(data: T): stdLib.CustomEvent[T] = js.native
}

