package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceusageV1 {
  
  @JSImport("googleapis", "serviceusage_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "serviceusage_v1.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Usage API
    *
    * Enables services that service consumers want to use on Google Cloud
    * Platform, lists the available or enabled services, or disables services
    * that service consumers no longer use.
    *
    * @example
    * const {google} = require('googleapis');
    * const serviceusage = google.serviceusage('v1');
    *
    * @namespace serviceusage
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Serviceusage
    */
  @JSImport("googleapis", "serviceusage_v1.Serviceusage")
  @js.native
  class Serviceusage protected ()
    extends typings.googleapis.serviceusageV1Mod.serviceusageV1.Serviceusage {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
