package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfunctionsV1beta2 {
  
  /**
    * Cloud Functions API
    *
    * Manages lightweight user-provided functions executed in response to events.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v1beta2');
    *
    * @namespace cloudfunctions
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Cloudfunctions
    */
  @JSImport("googleapis", "cloudfunctions_v1beta2.Cloudfunctions")
  @js.native
  class Cloudfunctions protected ()
    extends typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2.Cloudfunctions {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudfunctions_v1beta2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudfunctions_v1beta2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudfunctions_v1beta2.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudfunctions_v1beta2.Resource$Projects$Locations$Functions")
  @js.native
  class ResourceProjectsLocationsFunctions protected ()
    extends typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2.ResourceProjectsLocationsFunctions {
    def this(context: APIRequestContext) = this()
  }
}
