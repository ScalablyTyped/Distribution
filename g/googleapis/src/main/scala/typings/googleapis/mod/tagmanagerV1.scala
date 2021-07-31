package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagmanagerV1 {
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers")
  @js.native
  class ResourceAccountsContainers protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Environments")
  @js.native
  class ResourceAccountsContainersEnvironments protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersEnvironments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Folders")
  @js.native
  class ResourceAccountsContainersFolders protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Folders$Entities")
  @js.native
  class ResourceAccountsContainersFoldersEntities protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersFoldersEntities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Move_folders")
  @js.native
  class ResourceAccountsContainersMoveFolders protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersMoveFolders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Reauthorize_environments")
  @js.native
  class ResourceAccountsContainersReauthorizeEnvironments protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersReauthorizeEnvironments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Tags")
  @js.native
  class ResourceAccountsContainersTags protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersTags {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Triggers")
  @js.native
  class ResourceAccountsContainersTriggers protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersTriggers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Variables")
  @js.native
  class ResourceAccountsContainersVariables protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersVariables {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Containers$Versions")
  @js.native
  class ResourceAccountsContainersVersions protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsContainersVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tagmanager_v1.Resource$Accounts$Permissions")
  @js.native
  class ResourceAccountsPermissions protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.ResourceAccountsPermissions {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Tag Manager API
    *
    * Accesses Tag Manager accounts and containers.
    *
    * @example
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v1');
    *
    * @namespace tagmanager
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Tagmanager
    */
  @JSImport("googleapis", "tagmanager_v1.Tagmanager")
  @js.native
  class Tagmanager protected ()
    extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.Tagmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
