package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Pub/Sub API
  *
  * Provides reliable, many-to-many, asynchronous messaging between
  * applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const pubsub = google.pubsub('v1');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Pubsub")
@js.native
class Pubsub protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
