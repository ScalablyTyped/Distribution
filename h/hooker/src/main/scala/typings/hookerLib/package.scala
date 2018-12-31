package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hookerLib {
  type HookerPostHookFunction = js.Function2[/* result */ js.Any, /* repeated */ js.Any, IHookerPostHookResult | scala.Unit]
  type HookerPreHookFunction = js.Function1[/* repeated */ js.Any, IHookerPreHookResult | scala.Unit]
}
