package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeconfigV1 {
  
  @JSImport("googleapis", "runtimeconfig_v1.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "runtimeconfig_v1.Runtimeconfig")
  @js.native
  open class Runtimeconfig protected ()
    extends typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.Runtimeconfig {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
