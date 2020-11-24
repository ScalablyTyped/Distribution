package typings.googleapis.mod.videointelligenceV1p2beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
  * const videointelligence = google.videointelligence('v1p2beta1');
  *
  * @namespace videointelligence
  * @type {Function}
  * @version v1p2beta1
  * @variation v1p2beta1
  * @param {object=} options Options for Videointelligence
  */
@JSImport("googleapis", "videointelligence_v1p2beta1.Videointelligence")
@js.native
class Videointelligence protected ()
  extends typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Videointelligence {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
