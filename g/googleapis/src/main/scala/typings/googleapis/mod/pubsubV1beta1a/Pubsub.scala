package typings.googleapis.mod.pubsubV1beta1a

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Pub/Sub API
  *
  * Provides reliable, many-to-many, asynchronous messaging between
  * applications.
  *
  * @example
  * const {google} = require('googleapis');
  * const pubsub = google.pubsub('v1beta1a');
  *
  * @namespace pubsub
  * @type {Function}
  * @version v1beta1a
  * @variation v1beta1a
  * @param {object=} options Options for Pubsub
  */
@JSImport("googleapis", "pubsub_v1beta1a.Pubsub")
@js.native
class Pubsub protected ()
  extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

