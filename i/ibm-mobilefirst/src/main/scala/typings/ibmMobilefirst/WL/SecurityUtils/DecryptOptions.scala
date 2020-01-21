package typings.ibmMobilefirst.WL.SecurityUtils

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
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lv = lv.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecryptOptions]
  }
}

