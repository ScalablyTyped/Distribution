package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constructor[T /* <: atHapiCatboxLib.atHapiCatboxMod.ClientOptions */] extends js.Object {
  var constructor: atHapiCatboxLib.atHapiCatboxMod.EnginePrototype[_]
  var options: js.UndefOr[T] = js.undefined
}

object Anon_Constructor {
  @scala.inline
  def apply[T /* <: atHapiCatboxLib.atHapiCatboxMod.ClientOptions */](constructor: atHapiCatboxLib.atHapiCatboxMod.EnginePrototype[_], options: T = null): Anon_Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Constructor[T]]
  }
}

