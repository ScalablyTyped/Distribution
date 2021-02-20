package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminDirectoryV1 {
  
  /**
    * Admin Directory API
    *
    * Manages enterprise resources such as users and groups, administrative
    * notifications, security features, and more.
    *
    * @example
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * @namespace admin
    * @type {Function}
    * @version directory_v1
    * @variation directory_v1
    * @param {object=} options Options for Admin
    */
  @JSImport("googleapis", "admin_directory_v1.Admin")
  @js.native
  class Admin protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Asps")
  @js.native
  class ResourceAsps protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceAsps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Chromeosdevices")
  @js.native
  class ResourceChromeosdevices protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceChromeosdevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Customers")
  @js.native
  class ResourceCustomers protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceCustomers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Domainaliases")
  @js.native
  class ResourceDomainaliases protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceDomainaliases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Domains")
  @js.native
  class ResourceDomains protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceDomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Groups")
  @js.native
  class ResourceGroups protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Groups$Aliases")
  @js.native
  class ResourceGroupsAliases protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceGroupsAliases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Members")
  @js.native
  class ResourceMembers protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceMembers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Mobiledevices")
  @js.native
  class ResourceMobiledevices protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceMobiledevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Notifications")
  @js.native
  class ResourceNotifications protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceNotifications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Orgunits")
  @js.native
  class ResourceOrgunits protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceOrgunits {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Privileges")
  @js.native
  class ResourcePrivileges protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourcePrivileges {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Resolvedappaccesssettings")
  @js.native
  class ResourceResolvedappaccesssettings protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceResolvedappaccesssettings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Resources")
  @js.native
  class ResourceResources protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceResources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Resources$Buildings")
  @js.native
  class ResourceResourcesBuildings protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceResourcesBuildings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Resources$Calendars")
  @js.native
  class ResourceResourcesCalendars protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceResourcesCalendars {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Resources$Features")
  @js.native
  class ResourceResourcesFeatures protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceResourcesFeatures {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Roleassignments")
  @js.native
  class ResourceRoleassignments protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceRoleassignments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Roles")
  @js.native
  class ResourceRoles protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceRoles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Schemas")
  @js.native
  class ResourceSchemas protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceSchemas {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Tokens")
  @js.native
  class ResourceTokens protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceTokens {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Users")
  @js.native
  class ResourceUsers protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceUsers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Users$Aliases")
  @js.native
  class ResourceUsersAliases protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceUsersAliases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Users$Photos")
  @js.native
  class ResourceUsersPhotos protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceUsersPhotos {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_directory_v1.Resource$Verificationcodes")
  @js.native
  class ResourceVerificationcodes protected ()
    extends typings.googleapis.directoryV1Mod.adminDirectoryV1.ResourceVerificationcodes {
    def this(context: APIRequestContext) = this()
  }
}
