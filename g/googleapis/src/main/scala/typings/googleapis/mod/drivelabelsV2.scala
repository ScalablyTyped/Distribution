package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drivelabelsV2 {
  
  @JSImport("googleapis", "drivelabels_v2.Drivelabels")
  @js.native
  open class Drivelabels protected ()
    extends typings.googleapis.drivelabelsV2Mod.drivelabelsV2.Drivelabels {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "drivelabels_v2.Resource$Labels")
  @js.native
  open class ResourceLabels protected ()
    extends typings.googleapis.drivelabelsV2Mod.drivelabelsV2.ResourceLabels {
    def this(context: APIRequestContext) = this()
  }
}
