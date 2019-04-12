package typings
package atHapiPodiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var tags: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Channel {
  @scala.inline
  def apply(
    name: java.lang.String,
    channel: java.lang.String = null,
    tags: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal(name = name)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Channel]
  }
}

