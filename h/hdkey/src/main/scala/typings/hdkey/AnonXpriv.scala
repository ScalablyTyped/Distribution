package typings.hdkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXpriv extends js.Object {
  var xpriv: String
  var xpub: String
}

object AnonXpriv {
  @scala.inline
  def apply(xpriv: String, xpub: String): AnonXpriv = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXpriv]
  }
}

