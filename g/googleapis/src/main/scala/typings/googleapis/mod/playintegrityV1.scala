package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playintegrityV1 {
  
  @JSImport("googleapis", "playintegrity_v1.Playintegrity")
  @js.native
  open class Playintegrity protected ()
    extends typings.googleapis.playintegrityV1Mod.playintegrityV1.Playintegrity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "playintegrity_v1.Resource$V1")
  @js.native
  open class ResourceV1 protected ()
    extends typings.googleapis.playintegrityV1Mod.playintegrityV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
}
