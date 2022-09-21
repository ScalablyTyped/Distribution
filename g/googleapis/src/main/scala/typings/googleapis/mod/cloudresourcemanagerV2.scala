package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudresourcemanagerV2 {
  
  @JSImport("googleapis", "cloudresourcemanager_v2.Cloudresourcemanager")
  @js.native
  open class Cloudresourcemanager protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.Cloudresourcemanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v2.Resource$Folders")
  @js.native
  open class ResourceFolders protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.ResourceFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudresourcemanager_v2.Resource$Operations")
  @js.native
  open class ResourceOperations protected ()
    extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
