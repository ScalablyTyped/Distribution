package typings.hdkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Xpriv extends js.Object {
  var xpriv: String
  var xpub: String
}

object Anon_Xpriv {
  @scala.inline
  def apply(xpriv: String, xpub: String): Anon_Xpriv = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Xpriv]
  }
}

