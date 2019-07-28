package typings.graphqlDashTools

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: Record[String, _] = null): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Anon_Extensions]
  }
}

