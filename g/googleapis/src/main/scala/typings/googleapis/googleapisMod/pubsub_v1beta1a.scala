package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "pubsub_v1beta1a")
@js.native
object pubsub_v1beta1a extends js.Object {
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
  @js.native
  class Pubsub protected ()
    extends typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Pubsub {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Subscriptions protected ()
    extends typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Resource$Subscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Topics protected ()
    extends typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a.Resource$Topics {
    def this(context: APIRequestContext) = this()
  }
  
}

