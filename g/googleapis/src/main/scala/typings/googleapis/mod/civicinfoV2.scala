package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object civicinfoV2 {
  
  @JSImport("googleapis", "civicinfo_v2.Civicinfo")
  @js.native
  open class Civicinfo protected ()
    extends typings.googleapis.civicinfoV2Mod.civicinfoV2.Civicinfo {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Divisions")
  @js.native
  open class ResourceDivisions protected ()
    extends typings.googleapis.civicinfoV2Mod.civicinfoV2.ResourceDivisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Elections")
  @js.native
  open class ResourceElections protected ()
    extends typings.googleapis.civicinfoV2Mod.civicinfoV2.ResourceElections {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "civicinfo_v2.Resource$Representatives")
  @js.native
  open class ResourceRepresentatives protected ()
    extends typings.googleapis.civicinfoV2Mod.civicinfoV2.ResourceRepresentatives {
    def this(context: APIRequestContext) = this()
  }
}
