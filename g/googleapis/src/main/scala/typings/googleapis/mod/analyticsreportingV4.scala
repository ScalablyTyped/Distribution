package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsreportingV4 {
  
  @JSImport("googleapis", "analyticsreporting_v4.Analyticsreporting")
  @js.native
  open class Analyticsreporting protected ()
    extends typings.googleapis.v4Mod.analyticsreportingV4.Analyticsreporting {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "analyticsreporting_v4.Resource$Reports")
  @js.native
  open class ResourceReports protected ()
    extends typings.googleapis.v4Mod.analyticsreportingV4.ResourceReports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "analyticsreporting_v4.Resource$Useractivity")
  @js.native
  open class ResourceUseractivity protected ()
    extends typings.googleapis.v4Mod.analyticsreportingV4.ResourceUseractivity {
    def this(context: APIRequestContext) = this()
  }
}
