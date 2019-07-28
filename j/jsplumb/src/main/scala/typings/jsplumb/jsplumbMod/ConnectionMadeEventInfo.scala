package typings.jsplumb.jsplumbMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionMadeEventInfo extends js.Object {
  var connection: Connection
  var source: HTMLDivElement
  var sourceEndpoint: Endpoint
  var sourceId: String
  var target: HTMLDivElement
  var targetEndpoint: Endpoint
  var targetId: String
}

object ConnectionMadeEventInfo {
  @scala.inline
  def apply(
    connection: Connection,
    source: HTMLDivElement,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: HTMLDivElement,
    targetEndpoint: Endpoint,
    targetId: String
  ): ConnectionMadeEventInfo = {
    val __obj = js.Dynamic.literal(connection = connection, source = source, sourceEndpoint = sourceEndpoint, sourceId = sourceId, target = target, targetEndpoint = targetEndpoint, targetId = targetId)
  
    __obj.asInstanceOf[ConnectionMadeEventInfo]
  }
}

