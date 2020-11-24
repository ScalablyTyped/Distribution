package typings.ionic.libIntegrationsMod

import typings.ionic.anon.PartialReadonlyProjectInt
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations", "IntegrationConfig")
@js.native
class IntegrationConfig () extends BaseConfig[ProjectIntegration] {
  
  def provideDefaults(c: PartialReadonlyProjectInt): ProjectIntegration = js.native
}
