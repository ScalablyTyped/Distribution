package typings.atHapiGlue.atHapiGlueMod

import typings.atHapiHapi.atHapiHapiMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/glue", "compose")
@js.native
object compose extends js.Object {
  def apply(manifest: Manifest): js.Promise[Server] = js.native
  def apply(manifest: Manifest, options: Options): js.Promise[Server] = js.native
}

