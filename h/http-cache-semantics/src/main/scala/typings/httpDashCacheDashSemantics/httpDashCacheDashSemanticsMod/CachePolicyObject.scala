package typings.httpDashCacheDashSemantics.httpDashCacheDashSemanticsMod

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
    val __obj = js.Dynamic.literal(a = a, ch = ch, imm = imm, m = m, reqcc = reqcc, rescc = rescc, resh = resh, sh = sh, st = st, t = t, v = v)
    if (h != null) __obj.updateDynamic("h")(h)
    if (reqh != null) __obj.updateDynamic("reqh")(reqh)
    if (u != null) __obj.updateDynamic("u")(u)
    __obj.asInstanceOf[CachePolicyObject]
  }
}

