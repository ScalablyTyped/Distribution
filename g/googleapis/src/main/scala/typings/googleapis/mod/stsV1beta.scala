package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stsV1beta {
  
  @JSImport("googleapis", "sts_v1beta.Resource$V1beta")
  @js.native
  open class ResourceV1beta protected ()
    extends typings.googleapis.stsV1betaMod.stsV1beta.ResourceV1beta {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sts_v1beta.Sts")
  @js.native
  open class Sts protected ()
    extends typings.googleapis.stsV1betaMod.stsV1beta.Sts {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
