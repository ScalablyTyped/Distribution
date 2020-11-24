package typings.ionic.projectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations/cordova/project", "getPackagePath")
@js.native
object getPackagePath extends js.Object {
  
  def apply(appName: String, platform: String): js.Promise[String] = js.native
  def apply(appName: String, platform: String, hasEmulatorRelease: GetPackagePathOptions): js.Promise[String] = js.native
}
