package typings.hapi

import typings.catbox.catboxMod.ClientOptions
import typings.catbox.catboxMod.EnginePrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constructor[T /* <: ClientOptions */] extends js.Object {
  var constructor: EnginePrototype[_]
  var options: js.UndefOr[T] = js.undefined
}

object Anon_Constructor {
  @scala.inline
  def apply[T /* <: ClientOptions */](constructor: EnginePrototype[_], options: T = null): Anon_Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Constructor[T]]
  }
}

