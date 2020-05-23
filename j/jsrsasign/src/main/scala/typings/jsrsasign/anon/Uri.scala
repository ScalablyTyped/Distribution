package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var array: js.UndefOr[js.Array[ASN1Object]] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Uri {
  @scala.inline
  def apply(array: js.Array[ASN1Object] = null, uri: String = null): Uri = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
}

