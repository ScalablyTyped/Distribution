package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSOAuthDef extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var version: String | Double
}

object HelloJSOAuthDef {
  @scala.inline
  def apply(version: String | Double, auth: String = null): HelloJSOAuthDef = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSOAuthDef]
  }
}

