package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topic resource.
  */
@js.native
trait SchemaTopic extends js.Object {
  /**
    * Name of the topic.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaTopic {
  @scala.inline
  def apply(name: String = null): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTopic]
  }
}

