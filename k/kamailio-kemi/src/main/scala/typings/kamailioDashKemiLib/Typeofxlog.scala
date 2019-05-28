package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxlog extends js.Object {
  def xalert(lmsg: java.lang.String): scala.Double
  def xcrit(lmsg: java.lang.String): scala.Double
  def xdbg(lmsg: java.lang.String): scala.Double
  def xerr(lmsg: java.lang.String): scala.Double
  def xinfo(lmsg: java.lang.String): scala.Double
  def xlog(slevel: java.lang.String, lmsg: java.lang.String): scala.Double
  def xnotice(lmsg: java.lang.String): scala.Double
  def xwarn(lmsg: java.lang.String): scala.Double
}

object Typeofxlog {
  @scala.inline
  def apply(
    xalert: java.lang.String => scala.Double,
    xcrit: java.lang.String => scala.Double,
    xdbg: java.lang.String => scala.Double,
    xerr: java.lang.String => scala.Double,
    xinfo: java.lang.String => scala.Double,
    xlog: (java.lang.String, java.lang.String) => scala.Double,
    xnotice: java.lang.String => scala.Double,
    xwarn: java.lang.String => scala.Double
  ): Typeofxlog = {
    val __obj = js.Dynamic.literal(xalert = js.Any.fromFunction1(xalert), xcrit = js.Any.fromFunction1(xcrit), xdbg = js.Any.fromFunction1(xdbg), xerr = js.Any.fromFunction1(xerr), xinfo = js.Any.fromFunction1(xinfo), xlog = js.Any.fromFunction2(xlog), xnotice = js.Any.fromFunction1(xnotice), xwarn = js.Any.fromFunction1(xwarn))
  
    __obj.asInstanceOf[Typeofxlog]
  }
}

