package typings
package hookerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHookerOptions extends js.Object {
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var passName: js.UndefOr[scala.Boolean] = js.undefined
  var post: js.UndefOr[HookerPostHookFunction] = js.undefined
  var pre: js.UndefOr[HookerPreHookFunction] = js.undefined
}

