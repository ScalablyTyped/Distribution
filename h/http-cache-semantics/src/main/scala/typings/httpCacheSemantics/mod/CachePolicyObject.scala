package typings.httpCacheSemantics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachePolicyObject extends js.Object {
  var a: Boolean
  var ch: Double
  var h: js.UndefOr[String] = js.undefined
  var imm: Double
  var m: String
  var reqcc: StringDictionary[String]
  var reqh: Headers | Null
  var rescc: StringDictionary[String]
  var resh: Headers
  var sh: Boolean
  var st: Double
  var t: Double
  var u: js.UndefOr[String] = js.undefined
  var v: Double
}

object CachePolicyObject {
  @scala.inline
  def apply(
    a: Boolean,
    ch: Double,
    imm: Double,
    m: String,
    reqcc: StringDictionary[String],
    rescc: StringDictionary[String],
    resh: Headers,
    sh: Boolean,
    st: Double,
    t: Double,
    v: Double,
    h: String = null,
    reqh: Headers = null,
    u: String = null
  ): CachePolicyObject = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], ch = ch.asInstanceOf[js.Any], imm = imm.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], reqcc = reqcc.asInstanceOf[js.Any], rescc = rescc.asInstanceOf[js.Any], resh = resh.asInstanceOf[js.Any], sh = sh.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], reqh = reqh.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (u != null) __obj.updateDynamic("u")(u.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyObject]
  }
}

