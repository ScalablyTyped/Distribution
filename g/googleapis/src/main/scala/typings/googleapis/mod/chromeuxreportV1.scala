package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeuxreportV1 {
  
  @JSImport("googleapis", "chromeuxreport_v1.Chromeuxreport")
  @js.native
  open class Chromeuxreport protected ()
    extends typings.googleapis.chromeuxreportV1Mod.chromeuxreportV1.Chromeuxreport {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "chromeuxreport_v1.Resource$Records")
  @js.native
  open class ResourceRecords protected ()
    extends typings.googleapis.chromeuxreportV1Mod.chromeuxreportV1.ResourceRecords {
    def this(context: APIRequestContext) = this()
  }
}
