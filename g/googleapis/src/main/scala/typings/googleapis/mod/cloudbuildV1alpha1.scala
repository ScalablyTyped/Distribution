package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudbuildV1alpha1 {
  
  /**
    * Cloud Build API
    *
    * Creates and manages builds on Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1alpha1');
    *
    * @namespace cloudbuild
    * @type {Function}
    * @version v1alpha1
    * @variation v1alpha1
    * @param {object=} options Options for Cloudbuild
    */
  @JSImport("googleapis", "cloudbuild_v1alpha1.Cloudbuild")
  @js.native
  class Cloudbuild protected ()
    extends typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha1.Resource$Projects$Workerpools")
  @js.native
  class ResourceProjectsWorkerpools protected ()
    extends typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1.ResourceProjectsWorkerpools {
    def this(context: APIRequestContext) = this()
  }
}
