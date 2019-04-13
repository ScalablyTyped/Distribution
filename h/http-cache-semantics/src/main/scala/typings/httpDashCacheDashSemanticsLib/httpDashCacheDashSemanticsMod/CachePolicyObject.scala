package typings
package httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachePolicyObject extends js.Object {
  var a: scala.Boolean
  var ch: scala.Double
  var h: js.UndefOr[java.lang.String] = js.undefined
  var imm: scala.Double
  var m: java.lang.String
  var reqcc: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var reqh: Headers | scala.Null
  var rescc: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var resh: Headers
  var sh: scala.Boolean
  var st: scala.Double
  var t: scala.Double
  var u: js.UndefOr[java.lang.String] = js.undefined
  var v: scala.Double
}

object CachePolicyObject {
  @scala.inline
  def apply(
    a: scala.Boolean,
    ch: scala.Double,
    imm: scala.Double,
    m: java.lang.String,
    reqcc: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    rescc: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    resh: Headers,
    sh: scala.Boolean,
    st: scala.Double,
    t: scala.Double,
    v: scala.Double,
    h: java.lang.String = null,
    reqh: Headers = null,
    u: java.lang.String = null
  ): CachePolicyObject = {
    val __obj = js.Dynamic.literal(a = a, ch = ch, imm = imm, m = m, reqcc = reqcc, rescc = rescc, resh = resh, sh = sh, st = st, t = t, v = v)
    if (h != null) __obj.updateDynamic("h")(h)
    if (reqh != null) __obj.updateDynamic("reqh")(reqh)
    if (u != null) __obj.updateDynamic("u")(u)
    __obj.asInstanceOf[CachePolicyObject]
  }
}

