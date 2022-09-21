package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubV1beta1a {
  
  @JSImport("googleapis", "pubsub_v1beta1a.Pubsub")
  @js.native
  open class Pubsub protected ()
    extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta1a.Resource$Subscriptions")
  @js.native
  open class ResourceSubscriptions protected ()
    extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceSubscriptions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "pubsub_v1beta1a.Resource$Topics")
  @js.native
  open class ResourceTopics protected ()
    extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceTopics {
    def this(context: APIRequestContext) = this()
  }
}
