package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMessagePartHeader extends js.Object {
  /**
    * The name of the header before the : separator. For example, To.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the header after the : separator. For example,
    * someuser@example.com.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMessagePartHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaMessagePartHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMessagePartHeader]
  }
}

