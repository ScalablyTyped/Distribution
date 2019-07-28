package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /** PEM encoded certificate. */
  var cert: String
  /** Domains certificate is valid for. */
  var domains: js.Array[String]
  /** PEM encoded certificate key. */
  var key: String
}

object Certificate {
  @scala.inline
  def apply(cert: String, domains: js.Array[String], key: String): Certificate = {
    val __obj = js.Dynamic.literal(cert = cert, domains = domains, key = key)
  
    __obj.asInstanceOf[Certificate]
  }
}

