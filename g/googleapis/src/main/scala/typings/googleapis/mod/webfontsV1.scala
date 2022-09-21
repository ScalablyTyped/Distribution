package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webfontsV1 {
  
  @JSImport("googleapis", "webfonts_v1.Resource$Webfonts")
  @js.native
  open class ResourceWebfonts protected ()
    extends typings.googleapis.webfontsV1Mod.webfontsV1.ResourceWebfonts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "webfonts_v1.Webfonts")
  @js.native
  open class Webfonts protected ()
    extends typings.googleapis.webfontsV1Mod.webfontsV1.Webfonts {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
