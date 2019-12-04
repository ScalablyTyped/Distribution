package typings.ionic.libUpdatesMod

import typings.atIonicCliDashFramework.definitionsMod.PackageJson
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/updates", "runUpdateNotify")
@js.native
object runUpdateNotify extends js.Object {
  def apply(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = js.native
}

