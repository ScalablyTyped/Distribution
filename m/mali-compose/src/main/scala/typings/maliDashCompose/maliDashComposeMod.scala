package typings.maliDashCompose

import typings.mali.maliMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mali-compose", JSImport.Namespace)
@js.native
object maliDashComposeMod extends js.Object {
  def apply(
    middleware: js.Array[
      js.Function2[/* ctx */ Context, /* next */ js.Function0[js.Promise[Unit]], js.Promise[Unit]]
    ]
  ): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[Unit]], js.Promise[Unit]] = js.native
}

