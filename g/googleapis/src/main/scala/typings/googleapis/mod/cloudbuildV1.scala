package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudbuildV1 {
  
  /**
    * Cloud Build API
    *
    * Creates and manages builds on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
    *
    * @namespace cloudbuild
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudbuild
    */
  @JSImport("googleapis", "cloudbuild_v1.Cloudbuild")
  @js.native
  class Cloudbuild protected ()
    extends typings.googleapis.cloudbuildV1Mod.cloudbuildV1.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.cloudbuildV1Mod.cloudbuildV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudbuildV1Mod.cloudbuildV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1.Resource$Projects$Builds")
  @js.native
  class ResourceProjectsBuilds protected ()
    extends typings.googleapis.cloudbuildV1Mod.cloudbuildV1.ResourceProjectsBuilds {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1.Resource$Projects$Triggers")
  @js.native
  class ResourceProjectsTriggers protected ()
    extends typings.googleapis.cloudbuildV1Mod.cloudbuildV1.ResourceProjectsTriggers {
    def this(context: APIRequestContext) = this()
  }
}
