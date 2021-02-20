package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composerV1beta1 {
  
  /**
    * Cloud Composer API
    *
    * Manages Apache Airflow environments on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const composer = google.composer('v1beta1');
    *
    * @namespace composer
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Composer
    */
  @JSImport("googleapis", "composer_v1beta1.Composer")
  @js.native
  class Composer protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.Composer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "composer_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1beta1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1beta1.Resource$Projects$Locations$Environments")
  @js.native
  class ResourceProjectsLocationsEnvironments protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.ResourceProjectsLocationsEnvironments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1beta1.Resource$Projects$Locations$Imageversions")
  @js.native
  class ResourceProjectsLocationsImageversions protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.ResourceProjectsLocationsImageversions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "composer_v1beta1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.composerV1beta1Mod.composerV1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
