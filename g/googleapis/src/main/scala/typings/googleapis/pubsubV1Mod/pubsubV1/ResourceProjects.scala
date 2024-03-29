package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var schemas: ResourceProjectsSchemas = js.native
  
  var snapshots: ResourceProjectsSnapshots = js.native
  
  var subscriptions: ResourceProjectsSubscriptions = js.native
  
  var topics: ResourceProjectsTopics = js.native
}
