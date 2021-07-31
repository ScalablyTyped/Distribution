package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicenetworkingV1beta {
  
  @JSImport("googleapis", "servicenetworking_v1beta.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicenetworking_v1beta.Resource$Services")
  @js.native
  class ResourceServices protected ()
    extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "servicenetworking_v1beta.Resource$Services$Connections")
  @js.native
  class ResourceServicesConnections protected ()
    extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceServicesConnections {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Service Networking API
    *
    * Provides automatic management of network configurations necessary for
    * certain services.
    *
    * @example
    * const {google} = require('googleapis');
    * const servicenetworking = google.servicenetworking('v1beta');
    *
    * @namespace servicenetworking
    * @type {Function}
    * @version v1beta
    * @variation v1beta
    * @param {object=} options Options for Servicenetworking
    */
  @JSImport("googleapis", "servicenetworking_v1beta.Servicenetworking")
  @js.native
  class Servicenetworking protected ()
    extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
