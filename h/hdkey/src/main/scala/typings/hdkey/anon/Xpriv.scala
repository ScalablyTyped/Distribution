package typings.hdkey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xpriv extends js.Object {
  var xpriv: String
  var xpub: String
}

object Xpriv {
  @scala.inline
  def apply(xpriv: String, xpub: String): Xpriv = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpriv]
  }
}

