package typings
package ibmDashMobilefirstLib.WLNs.SecurityUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOptions extends js.Object {
  var ct: java.lang.String
  var key: java.lang.String
  var lv: java.lang.String
  var src: java.lang.String
  var v: java.lang.String
}

object DecryptOptions {
  @scala.inline
  def apply(
    ct: java.lang.String,
    key: java.lang.String,
    lv: java.lang.String,
    src: java.lang.String,
    v: java.lang.String
  ): DecryptOptions = {
    val __obj = js.Dynamic.literal(ct = ct, key = key, lv = lv, src = src, v = v)
  
    __obj.asInstanceOf[DecryptOptions]
  }
}

