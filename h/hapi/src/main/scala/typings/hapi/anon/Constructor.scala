package typings.hapi.anon

import typings.catbox.mod.ClientOptions
import typings.catbox.mod.EnginePrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constructor[T /* <: ClientOptions */] extends js.Object {
  var constructor: EnginePrototype[_]
  var options: js.UndefOr[T] = js.undefined
}

object Constructor {
  @scala.inline
  def apply[T](constructor: EnginePrototype[_], options: T = null): Constructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constructor[T]]
  }
}

