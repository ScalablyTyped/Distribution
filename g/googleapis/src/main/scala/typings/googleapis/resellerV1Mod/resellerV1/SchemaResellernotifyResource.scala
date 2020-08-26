package typings.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for resellernotify response.
  */
@js.native
trait SchemaResellernotifyResource extends js.Object {
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.native
}

object SchemaResellernotifyResource {
  @scala.inline
  def apply(): SchemaResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResellernotifyResource]
  }
  @scala.inline
  implicit class SchemaResellernotifyResourceOps[Self <: SchemaResellernotifyResource] (val x: Self) extends AnyVal {
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
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
  
}

