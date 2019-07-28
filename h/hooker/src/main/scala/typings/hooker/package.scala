package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooker {
  type HookerPostHookFunction = js.Function2[/* result */ js.Any, /* repeated */ js.Any, IHookerPostHookResult | Unit]
  type HookerPreHookFunction = js.Function1[/* repeated */ js.Any, IHookerPreHookResult | Unit]
}
