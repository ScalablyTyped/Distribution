package typings.googleapis.mod.pubsubV1beta2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Pub/Sub API
  *
  * Provides reliable, many-to-many, asynchronous messaging between
  * applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const pubsub = google.pubsub('v1beta2');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis", "pubsub_v1beta2.Pubsub")
@js.native
class Pubsub protected ()
  extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
