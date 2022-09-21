package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubV1beta2 {
  
  @JSImport("googleapis", "pubsub_v1beta2.Pubsub")
  @js.native
  open class Pubsub protected ()
    extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta2.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta2.Resource$Projects$Subscriptions")
  @js.native
  open class ResourceProjectsSubscriptions protected ()
    extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsSubscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta2.Resource$Projects$Topics")
  @js.native
  open class ResourceProjectsTopics protected ()
    extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsTopics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta2.Resource$Projects$Topics$Subscriptions")
  @js.native
  open class ResourceProjectsTopicsSubscriptions protected ()
    extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsTopicsSubscriptions {
    def this(context: APIRequestContext) = this()
  }
}
