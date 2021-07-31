package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mlV1 {
  
  /**
    * Cloud Machine Learning Engine
    *
    * An API to enable creating and using machine learning models.
    *
    * @example
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
    *
    * @namespace ml
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Ml
    */
  @JSImport("googleapis", "ml_v1.Ml")
  @js.native
  class Ml protected ()
    extends typings.googleapis.mlV1Mod.mlV1.Ml {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects$Jobs")
  @js.native
  class ResourceProjectsJobs protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjectsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects$Models")
  @js.native
  class ResourceProjectsModels protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjectsModels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects$Models$Versions")
  @js.native
  class ResourceProjectsModelsVersions protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjectsModelsVersions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ml_v1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.mlV1Mod.mlV1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
