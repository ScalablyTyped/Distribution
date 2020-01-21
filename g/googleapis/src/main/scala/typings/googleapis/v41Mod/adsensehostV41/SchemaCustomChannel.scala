package typings.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCustomChannel extends js.Object {
  /**
    * Code of this custom channel, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Unique identifier of this custom channel. This should be considered an
    * opaque identifier; it is not safe to rely on it being in any particular
    * format.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsensehost#customChannel.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this custom channel.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCustomChannel {
  @scala.inline
  def apply(code: String = null, id: String = null, kind: String = null, name: String = null): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomChannel]
  }
}

