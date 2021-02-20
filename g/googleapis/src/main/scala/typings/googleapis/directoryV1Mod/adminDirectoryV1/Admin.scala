package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Admin")
@js.native
class Admin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var asps: ResourceAsps = js.native
  
  var channels: ResourceChannels = js.native
  
  var chromeosdevices: ResourceChromeosdevices = js.native
  
  var context: APIRequestContext = js.native
  
  var customers: ResourceCustomers = js.native
  
  var domainAliases: ResourceDomainaliases = js.native
  
  var domains: ResourceDomains = js.native
  
  var groups: ResourceGroups = js.native
  
  var members: ResourceMembers = js.native
  
  var mobiledevices: ResourceMobiledevices = js.native
  
  var notifications: ResourceNotifications = js.native
  
  var orgunits: ResourceOrgunits = js.native
  
  var privileges: ResourcePrivileges = js.native
  
  var resolvedAppAccessSettings: ResourceResolvedappaccesssettings = js.native
  
  var resources: ResourceResources = js.native
  
  var roleAssignments: ResourceRoleassignments = js.native
  
  var roles: ResourceRoles = js.native
  
  var schemas: ResourceSchemas = js.native
  
  var tokens: ResourceTokens = js.native
  
  var users: ResourceUsers = js.native
  
  var verificationCodes: ResourceVerificationcodes = js.native
}
