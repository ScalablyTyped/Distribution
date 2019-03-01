package typings
package jsshaLib.jsshaMod.jsSHANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
}

object EncodingOptions {
  @scala.inline
  def apply(encoding: java.lang.String = null): EncodingOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[EncodingOptions]
  }
}

