package typings.jsplumb.jsplumbMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnConnectionBindInfo extends js.Object {
  var connection: Connection
  //- the source Endpoint in the Connection
  var newSourceEndpoint: Endpoint
  var newSourceId: String
  //- the targetEndpoint in the Connection
  var newTargetEndpoint: Endpoint
  var newTargetId: String
  // - id of the source element in the Connection
  var originalSourceId: String
  // - id of the target element in the Connection
  var originalTargetId: String
  var source: Element
  //- the target element in the Connection
  var sourceEndpoint: Endpoint
  // the new Connection.you can register listeners on this etc.
  var sourceId: String
  // - the source element in the Connection
  var target: Element
  var targetEndpoint: Endpoint
  var targetId: String
}

object OnConnectionBindInfo {
  @scala.inline
  def apply(
    connection: Connection,
    newSourceEndpoint: Endpoint,
    newSourceId: String,
    newTargetEndpoint: Endpoint,
    newTargetId: String,
    originalSourceId: String,
    originalTargetId: String,
    source: Element,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: Element,
    targetEndpoint: Endpoint,
    targetId: String
  ): OnConnectionBindInfo = {
    val __obj = js.Dynamic.literal(connection = connection, newSourceEndpoint = newSourceEndpoint, newSourceId = newSourceId, newTargetEndpoint = newTargetEndpoint, newTargetId = newTargetId, originalSourceId = originalSourceId, originalTargetId = originalTargetId, source = source, sourceEndpoint = sourceEndpoint, sourceId = sourceId, target = target, targetEndpoint = targetEndpoint, targetId = targetId)
  
    __obj.asInstanceOf[OnConnectionBindInfo]
  }
}

