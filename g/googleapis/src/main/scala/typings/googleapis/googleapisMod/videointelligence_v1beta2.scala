package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "videointelligence_v1beta2")
@js.native
object videointelligence_v1beta2 extends js.Object {
  @js.native
  class Resource$Videos protected ()
    extends typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2.Resource$Videos {
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
    * const videointelligence = google.videointelligence('v1beta2');
    *
    * @namespace videointelligence
    * @type {Function}
    * @version v1beta2
    * @variation v1beta2
    * @param {object=} options Options for Videointelligence
    */
  @js.native
  class Videointelligence protected ()
    extends typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2.Videointelligence {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

