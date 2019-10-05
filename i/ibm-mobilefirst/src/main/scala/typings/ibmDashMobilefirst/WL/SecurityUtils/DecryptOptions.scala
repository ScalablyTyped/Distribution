package typings.ibmDashMobilefirst.WL.SecurityUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOptions extends js.Object {
  var ct: String
  var key: String
  var lv: String
  var src: String
  var v: String
}

object DecryptOptions {
  @scala.inline
  def apply(ct: String, key: String, lv: String, src: String, v: String): DecryptOptions = {
    val __obj = js.Dynamic.literal(ct = ct, key = key, lv = lv, src = src, v = v)
  
    __obj.asInstanceOf[DecryptOptions]
  }
}

