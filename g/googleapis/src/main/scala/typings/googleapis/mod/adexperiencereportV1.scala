package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexperiencereportV1 {
  
  @JSImport("googleapis", "adexperiencereport_v1.Adexperiencereport")
  @js.native
  open class Adexperiencereport protected ()
    extends typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1.Adexperiencereport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "adexperiencereport_v1.Resource$Sites")
  @js.native
  open class ResourceSites protected ()
    extends typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1.ResourceSites {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexperiencereport_v1.Resource$Violatingsites")
  @js.native
  open class ResourceViolatingsites protected ()
    extends typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1.ResourceViolatingsites {
    def this(context: APIRequestContext) = this()
  }
}
