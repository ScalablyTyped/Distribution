package typings.ionic.libIntegrationsCordovaProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/project", "getPackagePath")
@js.native
object getPackagePath extends js.Object {
  def apply(appName: String, platform: String): js.Promise[String] = js.native
  def apply(appName: String, platform: String, hasEmulatorRelease: GetPackagePathOptions): js.Promise[String] = js.native
}

