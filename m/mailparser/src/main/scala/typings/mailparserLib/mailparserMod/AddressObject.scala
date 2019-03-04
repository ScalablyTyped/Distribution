package typings
package mailparserLib.mailparserMod

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
  var html: java.lang.String
  /**
  	 * A formatted address string for plaintext context.
  	 */
  var text: java.lang.String
  /**
  	 * An array with address details.
  	 */
  var value: js.Array[EmailAddress]
}

object AddressObject {
  @scala.inline
  def apply(html: java.lang.String, text: java.lang.String, value: js.Array[EmailAddress]): AddressObject = {
    val __obj = js.Dynamic.literal(html = html, text = text, value = value)
  
    __obj.asInstanceOf[AddressObject]
  }
}

