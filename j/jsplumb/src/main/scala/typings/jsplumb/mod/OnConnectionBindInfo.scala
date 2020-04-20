package typings.jsplumb.mod

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
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], newSourceEndpoint = newSourceEndpoint.asInstanceOf[js.Any], newSourceId = newSourceId.asInstanceOf[js.Any], newTargetEndpoint = newTargetEndpoint.asInstanceOf[js.Any], newTargetId = newTargetId.asInstanceOf[js.Any], originalSourceId = originalSourceId.asInstanceOf[js.Any], originalTargetId = originalTargetId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnConnectionBindInfo]
  }
}

