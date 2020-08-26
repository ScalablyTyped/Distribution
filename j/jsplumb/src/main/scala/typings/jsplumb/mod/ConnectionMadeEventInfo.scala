package typings.jsplumb.mod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionMadeEventInfo extends js.Object {
  var connection: Connection = js.native
  var source: HTMLDivElement = js.native
  var sourceEndpoint: Endpoint = js.native
  var sourceId: String = js.native
  var target: HTMLDivElement = js.native
  var targetEndpoint: Endpoint = js.native
  var targetId: String = js.native
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
  @scala.inline
  implicit class ConnectionMadeEventInfoOps[Self <: ConnectionMadeEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: HTMLDivElement): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceEndpoint(value: Endpoint): Self = this.set("sourceEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HTMLDivElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetEndpoint(value: Endpoint): Self = this.set("targetEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

