package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.pemtohex")
@js.native
object pemtohex extends js.Object {
  /**
    * get hexadecimal string from PEM format data
    * @param s PEM formatted string
    * @param sHead PEM header string without BEGIN/END(OPTION)
    * @return hexadecimal string data of PEM contents
    * @description
    * This static method gets a hexacedimal string of contents
    * from PEM format data. You can explicitly specify PEM header
    * by sHead argument.
    * Any space characters such as white space or new line
    * will be omitted.
    * NOTE: Now `KEYUTIL.getHexFromPEM` and `X509.pemToHex`
    * have been deprecated since jsrsasign 7.2.1.
    * Please use this method instead.
    * @example
    * pemtohex("-----BEGIN PUBLIC KEY...") → "3082..."
    * pemtohex("-----BEGIN CERTIFICATE...", "CERTIFICATE") → "3082..."
    * pemtohex(" \r\n-----BEGIN DSA PRIVATE KEY...") → "3082..."
    */
  def apply(s: String): String = js.native
  def apply(s: String, sHead: String): String = js.native
}

