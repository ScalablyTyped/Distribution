package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubV1beta1a {
  
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
  
  @JSImport("googleapis", "pubsub_v1beta1a.Resource$Subscriptions")
  @js.native
  class ResourceSubscriptions protected ()
    extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceSubscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta1a.Resource$Topics")
  @js.native
  class ResourceTopics protected ()
    extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceTopics {
    def this(context: APIRequestContext) = this()
  }
}
