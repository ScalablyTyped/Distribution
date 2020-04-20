package typings.gun.mod.Gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'pub' | 'priv' | 'epub' | 'epriv', string> */
trait CryptoKeyPair extends js.Object {
  var epriv: String
  var epub: String
  var priv: String
  var pub: String
}

object CryptoKeyPair {
  @scala.inline
  def apply(epriv: String, epub: String, priv: String, pub: String): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(epriv = epriv.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], priv = priv.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
}

