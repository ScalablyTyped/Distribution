package typings.immer.immerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use a class type for `nothing` so its type is unique */
trait Nothing extends js.Object {
  // This lets us do `Exclude<T, Nothing>`
  @JSName("_")
  var _underscore: js.Any
}

object Nothing {
  @scala.inline
  def apply(_underscore: js.Any): Nothing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nothing]
  }
}

@JSImport("immer", "nothing")
@js.native
object nothing extends TopLevel[Nothing]

