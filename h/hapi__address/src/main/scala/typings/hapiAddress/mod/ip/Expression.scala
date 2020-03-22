package typings.hapiAddress.mod.ip

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  /**
    * The CIDR mode.
    */
  var cidr: Cidr
  /**
    * The raw regular expression string.
    */
  var raw: String
  /**
    * The regular expression.
    */
  var regex: RegExp
  /**
    * The array of versions allowed.
    */
  var versions: js.Array[Version]
}

object Expression {
  @scala.inline
  def apply(cidr: Cidr, raw: String, regex: RegExp, versions: js.Array[Version]): Expression = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Expression]
  }
}

