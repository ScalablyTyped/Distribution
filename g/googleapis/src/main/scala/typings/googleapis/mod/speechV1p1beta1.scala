package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speechV1p1beta1 {
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Projects$Operations$Manualrecognitiontasks")
  @js.native
  class ResourceProjectsOperationsManualrecognitiontasks protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceProjectsOperationsManualrecognitiontasks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "speech_v1p1beta1.Resource$Speech")
  @js.native
  class ResourceSpeech protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.ResourceSpeech {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Speech-to-Text API
    *
    * Converts audio to text by applying powerful neural network models.
    *
    * @example
    * const {google} = require('googleapis');
    * const speech = google.speech('v1p1beta1');
    *
    * @namespace speech
    * @type {Function}
    * @version v1p1beta1
    * @variation v1p1beta1
    * @param {object=} options Options for Speech
    */
  @JSImport("googleapis", "speech_v1p1beta1.Speech")
  @js.native
  class Speech protected ()
    extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
