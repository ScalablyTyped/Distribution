package typings.jsdevtoolsOno

import typings.jsdevtoolsOno.anon.Message
import typings.jsdevtoolsOno.typesMod.ErrorLike
import typings.jsdevtoolsOno.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/ono/esm/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalizeArgs[E /* <: ErrorLike */, P /* <: js.Object */](args: js.Array[_], options: OnoOptions): Message[E, P] = js.native
  def normalizeOptions(): OnoOptions = js.native
  def normalizeOptions(options: OnoOptions): OnoOptions = js.native
}

