package typings.ionic.libIntegrationsCordovaConfigMod

import typings.ionic.definitionsMod.ProjectIntegration
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/config", "loadCordovaConfig")
@js.native
object loadCordovaConfig extends js.Object {
  def apply(integration: Required[ProjectIntegration]): js.Promise[ConfigConfig] = js.native
}

