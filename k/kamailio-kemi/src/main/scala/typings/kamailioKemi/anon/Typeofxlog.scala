package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxlog extends js.Object {
  def xalert(lmsg: String): Double
  def xcrit(lmsg: String): Double
  def xdbg(lmsg: String): Double
  def xerr(lmsg: String): Double
  def xinfo(lmsg: String): Double
  def xlog(slevel: String, lmsg: String): Double
  def xnotice(lmsg: String): Double
  def xwarn(lmsg: String): Double
}

object Typeofxlog {
  @scala.inline
  def apply(
    xalert: String => Double,
    xcrit: String => Double,
    xdbg: String => Double,
    xerr: String => Double,
    xinfo: String => Double,
    xlog: (String, String) => Double,
    xnotice: String => Double,
    xwarn: String => Double
  ): Typeofxlog = {
    val __obj = js.Dynamic.literal(xalert = js.Any.fromFunction1(xalert), xcrit = js.Any.fromFunction1(xcrit), xdbg = js.Any.fromFunction1(xdbg), xerr = js.Any.fromFunction1(xerr), xinfo = js.Any.fromFunction1(xinfo), xlog = js.Any.fromFunction2(xlog), xnotice = js.Any.fromFunction1(xnotice), xwarn = js.Any.fromFunction1(xwarn))
    __obj.asInstanceOf[Typeofxlog]
  }
}

