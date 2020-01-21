package typings.jsplumb.mod

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
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionMadeEventInfo]
  }
}

