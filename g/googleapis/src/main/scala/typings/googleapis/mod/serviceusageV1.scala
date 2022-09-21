package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceusageV1 {
  
  @JSImport("googleapis", "serviceusage_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceusage_v1.Resource$Services")
  @js.native
  open class ResourceServices protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceusage_v1.Serviceusage")
  @js.native
  open class Serviceusage protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.Serviceusage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
