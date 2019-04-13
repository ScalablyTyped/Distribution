package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionMadeEventInfo extends js.Object {
  var connection: Connection
  var source: stdLib.HTMLDivElement
  var sourceEndpoint: Endpoint
  var sourceId: java.lang.String
  var target: stdLib.HTMLDivElement
  var targetEndpoint: Endpoint
  var targetId: java.lang.String
}

object ConnectionMadeEventInfo {
  @scala.inline
  def apply(
    connection: Connection,
    source: stdLib.HTMLDivElement,
    sourceEndpoint: Endpoint,
    sourceId: java.lang.String,
    target: stdLib.HTMLDivElement,
    targetEndpoint: Endpoint,
    targetId: java.lang.String
  ): ConnectionMadeEventInfo = {
    val __obj = js.Dynamic.literal(connection = connection, source = source, sourceEndpoint = sourceEndpoint, sourceId = sourceId, target = target, targetEndpoint = targetEndpoint, targetId = targetId)
  
    __obj.asInstanceOf[ConnectionMadeEventInfo]
  }
}

