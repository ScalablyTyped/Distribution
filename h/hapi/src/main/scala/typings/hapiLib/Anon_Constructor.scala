package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constructor[T /* <: catboxLib.catboxMod.ClientOptions */] extends js.Object {
  var constructor: catboxLib.catboxMod.EnginePrototype[_]
  var options: js.UndefOr[T] = js.undefined
}

object Anon_Constructor {
  @scala.inline
  def apply[T /* <: catboxLib.catboxMod.ClientOptions */](constructor: catboxLib.catboxMod.EnginePrototype[_], options: T = null): Anon_Constructor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Constructor[T]]
  }
}

