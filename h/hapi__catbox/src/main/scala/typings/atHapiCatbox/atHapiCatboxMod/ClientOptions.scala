package typings.atHapiCatbox.atHapiCatboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  /**
    * this will store items under keys that start with this value.
    */
  var partition: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(partition: String = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

