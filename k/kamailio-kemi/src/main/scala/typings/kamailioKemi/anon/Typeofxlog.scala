package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofxlog extends js.Object {
  def xalert(lmsg: String): Double = js.native
  def xcrit(lmsg: String): Double = js.native
  def xdbg(lmsg: String): Double = js.native
  def xerr(lmsg: String): Double = js.native
  def xinfo(lmsg: String): Double = js.native
  def xlog(slevel: String, lmsg: String): Double = js.native
  def xnotice(lmsg: String): Double = js.native
  def xwarn(lmsg: String): Double = js.native
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
  @scala.inline
  implicit class TypeofxlogOps[Self <: Typeofxlog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXalert(value: String => Double): Self = this.set("xalert", js.Any.fromFunction1(value))
    @scala.inline
    def setXcrit(value: String => Double): Self = this.set("xcrit", js.Any.fromFunction1(value))
    @scala.inline
    def setXdbg(value: String => Double): Self = this.set("xdbg", js.Any.fromFunction1(value))
    @scala.inline
    def setXerr(value: String => Double): Self = this.set("xerr", js.Any.fromFunction1(value))
    @scala.inline
    def setXinfo(value: String => Double): Self = this.set("xinfo", js.Any.fromFunction1(value))
    @scala.inline
    def setXlog(value: (String, String) => Double): Self = this.set("xlog", js.Any.fromFunction2(value))
    @scala.inline
    def setXnotice(value: String => Double): Self = this.set("xnotice", js.Any.fromFunction1(value))
    @scala.inline
    def setXwarn(value: String => Double): Self = this.set("xwarn", js.Any.fromFunction1(value))
  }
  
}

