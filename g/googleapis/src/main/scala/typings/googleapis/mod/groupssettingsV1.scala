package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupssettingsV1 {
  
  @JSImport("googleapis", "groupssettings_v1.Groupssettings")
  @js.native
  open class Groupssettings protected ()
    extends typings.googleapis.groupssettingsV1Mod.groupssettingsV1.Groupssettings {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "groupssettings_v1.Resource$Groups")
  @js.native
  open class ResourceGroups protected ()
    extends typings.googleapis.groupssettingsV1Mod.groupssettingsV1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
}
