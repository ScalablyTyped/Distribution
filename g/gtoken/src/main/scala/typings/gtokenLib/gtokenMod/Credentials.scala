package typings
package gtokenLib.gtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var clientEmail: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(privateKey: java.lang.String, clientEmail: java.lang.String = null): Credentials = {
    val __obj = js.Dynamic.literal(privateKey = privateKey)
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail)
    __obj.asInstanceOf[Credentials]
  }
}

