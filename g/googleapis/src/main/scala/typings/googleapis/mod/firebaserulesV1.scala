package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaserulesV1 {
  
  @JSImport("googleapis", "firebaserules_v1.Firebaserules")
  @js.native
  open class Firebaserules protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.Firebaserules {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects$Releases")
  @js.native
  open class ResourceProjectsReleases protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjectsReleases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "firebaserules_v1.Resource$Projects$Rulesets")
  @js.native
  open class ResourceProjectsRulesets protected ()
    extends typings.googleapis.firebaserulesV1Mod.firebaserulesV1.ResourceProjectsRulesets {
    def this(context: APIRequestContext) = this()
  }
}
