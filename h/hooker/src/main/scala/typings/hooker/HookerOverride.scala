package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HookerOverride")
@js.native
class HookerOverride ()
  extends IHookerPostHookResult
     with IHookerPreHookResult {
  var value: js.Any = js.native
}

