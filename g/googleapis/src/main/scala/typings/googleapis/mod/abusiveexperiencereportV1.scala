package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abusiveexperiencereportV1 {
  
  @JSImport("googleapis", "abusiveexperiencereport_v1.Abusiveexperiencereport")
  @js.native
  open class Abusiveexperiencereport protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.Abusiveexperiencereport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "abusiveexperiencereport_v1.Resource$Sites")
  @js.native
  open class ResourceSites protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.ResourceSites {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "abusiveexperiencereport_v1.Resource$Violatingsites")
  @js.native
  open class ResourceViolatingsites protected ()
    extends typings.googleapis.v1Mod.abusiveexperiencereportV1.ResourceViolatingsites {
    def this(context: APIRequestContext) = this()
  }
}
