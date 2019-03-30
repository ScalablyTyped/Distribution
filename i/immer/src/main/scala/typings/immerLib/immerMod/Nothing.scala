package typings
package immerLib.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use a class type for `nothing` so its type is unique */
trait Nothing extends js.Object {
  // This lets us do `Exclude<T, Nothing>`
  var `_`: js.Any
}

object Nothing {
  @scala.inline
  def apply(`_`: js.Any): Nothing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Nothing]
  }
}

