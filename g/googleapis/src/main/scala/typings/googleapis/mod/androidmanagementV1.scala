package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidmanagementV1 {
  
  /**
    * Android Management API
    *
    * The Android Management API provides remote enterprise management of Android
    * devices and apps.
    *
    * @example
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * @namespace androidmanagement
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Androidmanagement
    */
  @JSImport("googleapis", "androidmanagement_v1.Androidmanagement")
  @js.native
  class Androidmanagement protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.Androidmanagement {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises")
  @js.native
  class ResourceEnterprises protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprises {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Applications")
  @js.native
  class ResourceEnterprisesApplications protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesApplications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Devices")
  @js.native
  class ResourceEnterprisesDevices protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesDevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Devices$Operations")
  @js.native
  class ResourceEnterprisesDevicesOperations protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesDevicesOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Enrollmenttokens")
  @js.native
  class ResourceEnterprisesEnrollmenttokens protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesEnrollmenttokens {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Policies")
  @js.native
  class ResourceEnterprisesPolicies protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesPolicies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Webapps")
  @js.native
  class ResourceEnterprisesWebapps protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesWebapps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Enterprises$Webtokens")
  @js.native
  class ResourceEnterprisesWebtokens protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceEnterprisesWebtokens {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "androidmanagement_v1.Resource$Signupurls")
  @js.native
  class ResourceSignupurls protected ()
    extends typings.googleapis.androidmanagementV1Mod.androidmanagementV1.ResourceSignupurls {
    def this(context: APIRequestContext) = this()
  }
}
