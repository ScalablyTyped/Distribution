package typings.ionic.updatesMod

import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/updates", "runUpdateNotify")
@js.native
object runUpdateNotify extends js.Object {
  def apply(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = js.native
}

