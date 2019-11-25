package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionParam extends js.Object {
  var accessLocation: UriParam
  var accessMethod: ObjectIdentifierParam
}

object ExtensionParam {
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: ObjectIdentifierParam): ExtensionParam = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionParam]
  }
}

