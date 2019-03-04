package typings
package hellojsLib.hellojsMod.helloNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSOAuthDef extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String | scala.Double
}

object HelloJSOAuthDef {
  @scala.inline
  def apply(version: java.lang.String | scala.Double, auth: java.lang.String = null): HelloJSOAuthDef = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[HelloJSOAuthDef]
  }
}

