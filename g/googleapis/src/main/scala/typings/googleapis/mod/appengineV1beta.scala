package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appengineV1beta {
  
  /**
    * App Engine Admin API
    *
    * Provisions and manages developers&#39; App Engine applications.
    *
    * @example
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1beta');
    *
    * @namespace appengine
    * @type {Function}
    * @version v1beta
    * @variation v1beta
    * @param {object=} options Options for Appengine
    */
  @JSImport("googleapis", "appengine_v1beta.Appengine")
  @js.native
  class Appengine protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps")
  @js.native
  class ResourceApps protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceApps {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Authorizedcertificates")
  @js.native
  class ResourceAppsAuthorizedcertificates protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsAuthorizedcertificates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Authorizeddomains")
  @js.native
  class ResourceAppsAuthorizeddomains protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsAuthorizeddomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Domainmappings")
  @js.native
  class ResourceAppsDomainmappings protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsDomainmappings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Firewall")
  @js.native
  class ResourceAppsFirewall protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsFirewall {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Firewall$Ingressrules")
  @js.native
  class ResourceAppsFirewallIngressrules protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsFirewallIngressrules {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Locations")
  @js.native
  class ResourceAppsLocations protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Operations")
  @js.native
  class ResourceAppsOperations protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Services")
  @js.native
  class ResourceAppsServices protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Services$Versions")
  @js.native
  class ResourceAppsServicesVersions protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsServicesVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "appengine_v1beta.Resource$Apps$Services$Versions$Instances")
  @js.native
  class ResourceAppsServicesVersionsInstances protected ()
    extends typings.googleapis.appengineV1betaMod.appengineV1beta.ResourceAppsServicesVersionsInstances {
    def this(context: APIRequestContext) = this()
  }
}
