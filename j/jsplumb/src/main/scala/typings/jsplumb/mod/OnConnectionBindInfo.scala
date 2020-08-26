package typings.jsplumb.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnConnectionBindInfo extends js.Object {
  var connection: Connection = js.native
  //- the source Endpoint in the Connection
  var newSourceEndpoint: Endpoint = js.native
  var newSourceId: String = js.native
  //- the targetEndpoint in the Connection
  var newTargetEndpoint: Endpoint = js.native
  var newTargetId: String = js.native
  // - id of the source element in the Connection
  var originalSourceId: String = js.native
  // - id of the target element in the Connection
  var originalTargetId: String = js.native
  var source: Element = js.native
  //- the target element in the Connection
  var sourceEndpoint: Endpoint = js.native
  // the new Connection.you can register listeners on this etc.
  var sourceId: String = js.native
  // - the source element in the Connection
  var target: Element = js.native
  var targetEndpoint: Endpoint = js.native
  var targetId: String = js.native
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
  @scala.inline
  implicit class OnConnectionBindInfoOps[Self <: OnConnectionBindInfo] (val x: Self) extends AnyVal {
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
    def setNewSourceEndpoint(value: Endpoint): Self = this.set("newSourceEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewSourceId(value: String): Self = this.set("newSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTargetEndpoint(value: Endpoint): Self = this.set("newTargetEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewTargetId(value: String): Self = this.set("newTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalSourceId(value: String): Self = this.set("originalSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalTargetId(value: String): Self = this.set("originalTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Element): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceEndpoint(value: Endpoint): Self = this.set("sourceEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetEndpoint(value: Endpoint): Self = this.set("targetEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
  }
  
}

