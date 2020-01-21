package typings.hapiHapi

import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.EnginePrototype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConstructor[T /* <: ClientOptions */] extends js.Object {
  var constructor: EnginePrototype[_]
  var options: js.UndefOr[T] = js.undefined
}

object AnonConstructor {
  @scala.inline
  def apply[T /* <: ClientOptions */](constructor: EnginePrototype[_], options: T = null): AnonConstructor[T] = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConstructor[T]]
  }
}

