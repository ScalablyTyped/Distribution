package typings.mailparser.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Address object.
  */
trait AddressObject extends _HeaderValue {
  /**
  	 * A formatted address string for HTML context.
  	 */
  var html: String
  /**
  	 * A formatted address string for plaintext context.
  	 */
  var text: String
  /**
  	 * An array with address details.
  	 */
  var value: js.Array[EmailAddress]
}

object AddressObject {
  @scala.inline
  def apply(html: String, text: String, value: js.Array[EmailAddress]): AddressObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressObject]
  }
}

