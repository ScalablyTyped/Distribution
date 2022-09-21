package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Gamesconfiguration")
@js.native
open class Gamesconfiguration protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var achievementConfigurations: ResourceAchievementconfigurations = js.native
  
  var context: APIRequestContext = js.native
  
  var imageConfigurations: ResourceImageconfigurations = js.native
  
  var leaderboardConfigurations: ResourceLeaderboardconfigurations = js.native
}
