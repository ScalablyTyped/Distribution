package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuestAuthentication extends Authentication

object GuestAuthentication {
  @scala.inline
  def apply(scheme: java.lang.String): GuestAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[GuestAuthentication]
  }
}

