package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ObjectIdentifierParam
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
    val __obj = js.Dynamic.literal(accessLocation = accessLocation, accessMethod = accessMethod)
  
    __obj.asInstanceOf[ExtensionParam]
  }
}

