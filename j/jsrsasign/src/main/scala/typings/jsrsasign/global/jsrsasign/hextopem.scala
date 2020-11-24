package typings.jsrsasign.global.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("jsrsasign.hextopem")
@js.native
object hextopem extends js.Object {
  
  /**
    * get PEM string from hexadecimal data and header string
    * @param dataHex hexadecimal string of PEM body
    * @param pemHeader PEM header string (ex. 'RSA PRIVATE KEY')
    * @return PEM formatted string of input data
    * @description
    * This function converts a hexadecimal string to a PEM string with
    * a specified header. Its line break will be CRLF("\r\n").
    * @example
    * hextopem('616161', 'RSA PRIVATE KEY') →
    * -----BEGIN PRIVATE KEY-----
    * YWFh
    * -----END PRIVATE KEY-----
    */
  def apply(dataHex: String, pemHeader: String): String = js.native
}
