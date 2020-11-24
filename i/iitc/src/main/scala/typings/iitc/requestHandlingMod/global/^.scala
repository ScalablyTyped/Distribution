package typings.iitc.requestHandlingMod.global

import typings.jquery.JQuery.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object ^ extends js.Object {
  
  var activeRequests: js.Array[jqXHR[js.Any]] = js.native
  
  /** failed data requests calls */
  var failedRequestCount: Double = js.native
  
  var requests: Requests_ = js.native
  
  var statusCachedMapTiles: Double = js.native
  
  var statusErrorMapTiles: Double = js.native
  
  var statusStaleMapTiles: Double = js.native
  
  var statusSuccessMapTiles: Double = js.native
  
  var statusTotalMapTiles: Double = js.native
}
