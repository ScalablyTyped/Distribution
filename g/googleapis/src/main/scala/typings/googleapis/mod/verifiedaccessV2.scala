package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifiedaccessV2 {
  
  @JSImport("googleapis", "verifiedaccess_v2.Resource$Challenge")
  @js.native
  open class ResourceChallenge protected ()
    extends typings.googleapis.verifiedaccessV2Mod.verifiedaccessV2.ResourceChallenge {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "verifiedaccess_v2.Verifiedaccess")
  @js.native
  open class Verifiedaccess protected ()
    extends typings.googleapis.verifiedaccessV2Mod.verifiedaccessV2.Verifiedaccess {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
