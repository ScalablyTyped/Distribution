package typings.ionic.libUpdatesMod

import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/updates", "runNotify")
@js.native
object runNotify extends js.Object {
  def apply(env: IonicEnvironment, pkg: PersistedPackage, latestVersion: String): js.Promise[Unit] = js.native
}

