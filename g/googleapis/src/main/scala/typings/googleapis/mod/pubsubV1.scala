package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubV1 {
  
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
  @JSImport("googleapis", "pubsub_v1.Pubsub")
  @js.native
  class Pubsub protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.Pubsub {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects$Snapshots")
  @js.native
  class ResourceProjectsSnapshots protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsSnapshots {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects$Subscriptions")
  @js.native
  class ResourceProjectsSubscriptions protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsSubscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects$Topics")
  @js.native
  class ResourceProjectsTopics protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects$Topics$Snapshots")
  @js.native
  class ResourceProjectsTopicsSnapshots protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopicsSnapshots {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1.Resource$Projects$Topics$Subscriptions")
  @js.native
  class ResourceProjectsTopicsSubscriptions protected ()
    extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopicsSubscriptions {
    def this(context: APIRequestContext) = this()
  }
}
