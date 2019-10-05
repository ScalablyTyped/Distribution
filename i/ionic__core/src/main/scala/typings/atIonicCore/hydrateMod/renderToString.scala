package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/hydrate", "renderToString")
@js.native
object renderToString extends js.Object {
  def apply(html: String): js.Promise[HydrateResults] = js.native
  def apply(html: String, opts: RenderToStringOptions): js.Promise[HydrateResults] = js.native
}

