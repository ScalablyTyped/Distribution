package typings.immer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use a class type for `nothing` so its type is unique */
trait Nothing_ extends js.Object {
  // This lets us do `Exclude<T, Nothing>`
  @JSName("_")
  var _underscore: js.Any
}

object Nothing_ {
  @scala.inline
  def apply(_underscore: js.Any): Nothing_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nothing_]
  }
}

