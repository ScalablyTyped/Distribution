package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/videointelligence/v1beta2", "videointelligence_v1beta2.Videointelligence")
@js.native
class Videointelligence protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var videos: ResourceVideos = js.native
}
