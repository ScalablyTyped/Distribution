package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsublite/v1", "pubsublite_v1.Resource$Admin$Projects$Locations")
@js.native
open class ResourceAdminProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceAdminProjectsLocationsOperations = js.native
  
  var reservations: ResourceAdminProjectsLocationsReservations = js.native
  
  var subscriptions: ResourceAdminProjectsLocationsSubscriptions = js.native
  
  var topics: ResourceAdminProjectsLocationsTopics = js.native
}
