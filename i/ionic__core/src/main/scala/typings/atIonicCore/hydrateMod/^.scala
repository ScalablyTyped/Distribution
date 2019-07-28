package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/hydrate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hydrateDocument(doc: js.Any): js.Promise[HydrateResults] = js.native
  def hydrateDocument(doc: js.Any, opts: HydrateDocumentOptions): js.Promise[HydrateResults] = js.native
  def renderToString(html: String): js.Promise[HydrateResults] = js.native
  def renderToString(html: String, opts: RenderToStringOptions): js.Promise[HydrateResults] = js.native
}

