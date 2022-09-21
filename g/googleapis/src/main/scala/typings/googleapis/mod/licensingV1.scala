package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licensingV1 {
  
  @JSImport("googleapis", "licensing_v1.Licensing")
  @js.native
  open class Licensing protected ()
    extends typings.googleapis.licensingV1Mod.licensingV1.Licensing {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "licensing_v1.Resource$Licenseassignments")
  @js.native
  open class ResourceLicenseassignments protected ()
    extends typings.googleapis.licensingV1Mod.licensingV1.ResourceLicenseassignments {
    def this(context: APIRequestContext) = this()
  }
}
