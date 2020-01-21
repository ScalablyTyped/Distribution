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
  def apply(topicName: String = null): SchemaResellernotifyResource = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResellernotifyResource]
  }
}

