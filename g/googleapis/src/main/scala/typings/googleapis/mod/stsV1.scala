package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stsV1 {
  
  @JSImport("googleapis", "sts_v1.Resource$V1")
  @js.native
  open class ResourceV1 protected ()
    extends typings.googleapis.stsV1Mod.stsV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sts_v1.Sts")
  @js.native
  open class Sts protected ()
    extends typings.googleapis.stsV1Mod.stsV1.Sts {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
