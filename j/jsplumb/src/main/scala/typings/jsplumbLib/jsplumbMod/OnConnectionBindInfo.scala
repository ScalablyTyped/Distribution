package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnConnectionBindInfo extends js.Object {
  var connection: Connection
  //- the source Endpoint in the Connection
  var newSourceEndpoint: Endpoint
  var newSourceId: java.lang.String
  //- the targetEndpoint in the Connection
  var newTargetEndpoint: Endpoint
  var newTargetId: java.lang.String
  // - id of the source element in the Connection
  var originalSourceId: java.lang.String
  // - id of the target element in the Connection
  var originalTargetId: java.lang.String
  var source: stdLib.Element
  //- the target element in the Connection
  var sourceEndpoint: Endpoint
  // the new Connection.you can register listeners on this etc.
  var sourceId: java.lang.String
  // - the source element in the Connection
  var target: stdLib.Element
  var targetEndpoint: Endpoint
  var targetId: java.lang.String
}

object OnConnectionBindInfo {
  @scala.inline
  def apply(
    connection: Connection,
    newSourceEndpoint: Endpoint,
    newSourceId: java.lang.String,
    newTargetEndpoint: Endpoint,
    newTargetId: java.lang.String,
    originalSourceId: java.lang.String,
    originalTargetId: java.lang.String,
    source: stdLib.Element,
    sourceEndpoint: Endpoint,
    sourceId: java.lang.String,
    target: stdLib.Element,
    targetEndpoint: Endpoint,
    targetId: java.lang.String
  ): OnConnectionBindInfo = {
    val __obj = js.Dynamic.literal(connection = connection, newSourceEndpoint = newSourceEndpoint, newSourceId = newSourceId, newTargetEndpoint = newTargetEndpoint, newTargetId = newTargetId, originalSourceId = originalSourceId, originalTargetId = originalTargetId, source = source, sourceEndpoint = sourceEndpoint, sourceId = sourceId, target = target, targetEndpoint = targetEndpoint, targetId = targetId)
  
    __obj.asInstanceOf[OnConnectionBindInfo]
  }
}

