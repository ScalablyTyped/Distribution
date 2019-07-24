package typings
package k6Lib.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /** PEM encoded certificate. */
  var cert: java.lang.String
  /** Domains certificate is valid for. */
  var domains: js.Array[java.lang.String]
  /** PEM encoded certificate key. */
  var key: java.lang.String
}

object Certificate {
  @scala.inline
  def apply(cert: java.lang.String, domains: js.Array[java.lang.String], key: java.lang.String): Certificate = {
    val __obj = js.Dynamic.literal(cert = cert, domains = domains, key = key)
  
    __obj.asInstanceOf[Certificate]
  }
}

