package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryauthorizationV1beta1 {
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Binaryauthorization")
  @js.native
  open class Binaryauthorization protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.Binaryauthorization {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects$Attestors")
  @js.native
  open class ResourceProjectsAttestors protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjectsAttestors {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Projects$Policy")
  @js.native
  open class ResourceProjectsPolicy protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceProjectsPolicy {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "binaryauthorization_v1beta1.Resource$Systempolicy")
  @js.native
  open class ResourceSystempolicy protected ()
    extends typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1.ResourceSystempolicy {
    def this(context: APIRequestContext) = this()
  }
}
