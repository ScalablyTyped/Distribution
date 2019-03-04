package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var flash: scala.Boolean
  var flashVersion: scala.Double
  var iframe: scala.Boolean
}

object Features {
  @scala.inline
  def apply(flash: scala.Boolean, flashVersion: scala.Double, iframe: scala.Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash, flashVersion = flashVersion, iframe = iframe)
  
    __obj.asInstanceOf[Features]
  }
}

