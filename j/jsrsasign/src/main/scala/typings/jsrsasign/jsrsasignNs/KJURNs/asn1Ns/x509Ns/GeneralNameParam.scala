package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralNameParam extends js.Object {
  var certissuer: js.UndefOr[String] = js.undefined
  var certsubj: js.UndefOr[String] = js.undefined
  var dn: js.UndefOr[String] = js.undefined
  var dns: js.UndefOr[String] = js.undefined
  var ldapdn: js.UndefOr[String] = js.undefined
  var rfc822: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object GeneralNameParam {
  @scala.inline
  def apply(
    certissuer: String = null,
    certsubj: String = null,
    dn: String = null,
    dns: String = null,
    ldapdn: String = null,
    rfc822: String = null,
    uri: String = null
  ): GeneralNameParam = {
    val __obj = js.Dynamic.literal()
    if (certissuer != null) __obj.updateDynamic("certissuer")(certissuer)
    if (certsubj != null) __obj.updateDynamic("certsubj")(certsubj)
    if (dn != null) __obj.updateDynamic("dn")(dn)
    if (dns != null) __obj.updateDynamic("dns")(dns)
    if (ldapdn != null) __obj.updateDynamic("ldapdn")(ldapdn)
    if (rfc822 != null) __obj.updateDynamic("rfc822")(rfc822)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[GeneralNameParam]
  }
}

