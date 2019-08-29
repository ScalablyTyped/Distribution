package typings.koaDashBetterDashBody

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashBetterDashBodyMod {
  import typings.koa.koaMod.Context
  import typings.std.Generator

  type Body = js.Function2[
    /* context */ Context, 
    /* next */ js.Function0[Unit], 
    Generator[js.Any, js.Any, js.Any]
  ]
}
