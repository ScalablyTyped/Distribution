package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containeranalysisV1beta1 {
  
  /**
    * Container Analysis API
    *
    * An implementation of the Grafeas API, which stores, and enables querying
    * and retrieval of critical metadata about all of your software artifacts.
    *
    * @example
    * const {google} = require('googleapis');
    * const containeranalysis = google.containeranalysis('v1beta1');
    *
    * @namespace containeranalysis
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Containeranalysis
    */
  @JSImport("googleapis", "containeranalysis_v1beta1.Containeranalysis")
  @js.native
  class Containeranalysis protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1beta1.Resource$Projects$Notes")
  @js.native
  class ResourceProjectsNotes protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsNotes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1beta1.Resource$Projects$Notes$Occurrences")
  @js.native
  class ResourceProjectsNotesOccurrences protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsNotesOccurrences {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1beta1.Resource$Projects$Occurrences")
  @js.native
  class ResourceProjectsOccurrences protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsOccurrences {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "containeranalysis_v1beta1.Resource$Projects$Scanconfigs")
  @js.native
  class ResourceProjectsScanconfigs protected ()
    extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsScanconfigs {
    def this(context: APIRequestContext) = this()
  }
}
