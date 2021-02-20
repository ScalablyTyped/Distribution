package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicemanagementV1 {
  
  @JSImport("googleapis", "servicemanagement_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicemanagement_v1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicemanagement_v1.Resource$Services$Configs")
  @js.native
  class ResourceServicesConfigs protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.ResourceServicesConfigs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicemanagement_v1.Resource$Services$Consumers")
  @js.native
  class ResourceServicesConsumers protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.ResourceServicesConsumers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicemanagement_v1.Resource$Services$Rollouts")
  @js.native
  class ResourceServicesRollouts protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.ResourceServicesRollouts {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Management API
    *
    * Google Service Management allows service producers to publish their
    * services on Google Cloud Platform so that they can be discovered and used
    * by service consumers.
    *
    * @example
    * const {google} = require('googleapis');
    * const servicemanagement = google.servicemanagement('v1');
    *
    * @namespace servicemanagement
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Servicemanagement
    */
  @JSImport("googleapis", "servicemanagement_v1.Servicemanagement")
  @js.native
  class Servicemanagement protected ()
    extends typings.googleapis.servicemanagementV1Mod.servicemanagementV1.Servicemanagement {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
