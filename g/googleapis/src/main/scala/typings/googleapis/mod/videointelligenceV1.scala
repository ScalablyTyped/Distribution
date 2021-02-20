package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videointelligenceV1 {
  
  @JSImport("googleapis", "videointelligence_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.videointelligenceV1Mod.videointelligenceV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "videointelligence_v1.Resource$Videos")
  @js.native
  class ResourceVideos protected ()
    extends typings.googleapis.videointelligenceV1Mod.videointelligenceV1.ResourceVideos {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Video Intelligence API
    *
    * Detects objects, explicit content, and scene changes in videos. It also
    * specifies the region for annotation and transcribes speech to text.
    * Supports both asynchronous API and streaming API.
    *
    * @example
    * const {google} = require('googleapis');
    * const videointelligence = google.videointelligence('v1');
    *
    * @namespace videointelligence
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Videointelligence
    */
  @JSImport("googleapis", "videointelligence_v1.Videointelligence")
  @js.native
  class Videointelligence protected ()
    extends typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
