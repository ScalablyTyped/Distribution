package typings.atKeystonejsEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Root extends js.Object {
  var root: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
}

object Anon_Root {
  @scala.inline
  def apply(root: String = null, transport: String = null): Anon_Root = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Root]
  }
}

