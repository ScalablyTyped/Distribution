package typings.atHapiPodium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var name: String
  var tags: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_Channel {
  @scala.inline
  def apply(name: String, channel: String = null, tags: String | js.Array[String] = null): Anon_Channel = {
    val __obj = js.Dynamic.literal(name = name)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Channel]
  }
}

