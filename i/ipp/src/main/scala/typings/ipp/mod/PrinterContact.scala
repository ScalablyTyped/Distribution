package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterContact extends js.Object {
  var `contact-name`: js.UndefOr[String] = js.undefined
  var `contact-uri`: js.UndefOr[String] = js.undefined
  var `contact-vcard`: js.UndefOr[js.Array[String]] = js.undefined
}

object PrinterContact {
  @scala.inline
  def apply(
    `contact-name`: String = null,
    `contact-uri`: String = null,
    `contact-vcard`: js.Array[String] = null
  ): PrinterContact = {
    val __obj = js.Dynamic.literal()
    if (`contact-name` != null) __obj.updateDynamic("contact-name")(`contact-name`.asInstanceOf[js.Any])
    if (`contact-uri` != null) __obj.updateDynamic("contact-uri")(`contact-uri`.asInstanceOf[js.Any])
    if (`contact-vcard` != null) __obj.updateDynamic("contact-vcard")(`contact-vcard`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterContact]
  }
}

