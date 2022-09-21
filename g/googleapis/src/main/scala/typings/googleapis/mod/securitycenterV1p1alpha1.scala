package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securitycenterV1p1alpha1 {
  
  @JSImport("googleapis", "securitycenter_v1p1alpha1.Resource$Organizations")
  @js.native
  open class ResourceOrganizations protected ()
    extends typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1.ResourceOrganizations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1p1alpha1.Resource$Organizations$Operations")
  @js.native
  open class ResourceOrganizationsOperations protected ()
    extends typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1.ResourceOrganizationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "securitycenter_v1p1alpha1.Securitycenter")
  @js.native
  open class Securitycenter protected ()
    extends typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1.Securitycenter {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
