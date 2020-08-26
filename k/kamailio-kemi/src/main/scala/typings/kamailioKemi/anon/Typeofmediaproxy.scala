package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmediaproxy extends js.Object {
  def end_media_session(): Double = js.native
  def engage_media_proxy(): Double = js.native
  def use_media_proxy(): Double = js.native
}

object Typeofmediaproxy {
  @scala.inline
  def apply(end_media_session: () => Double, engage_media_proxy: () => Double, use_media_proxy: () => Double): Typeofmediaproxy = {
    val __obj = js.Dynamic.literal(end_media_session = js.Any.fromFunction0(end_media_session), engage_media_proxy = js.Any.fromFunction0(engage_media_proxy), use_media_proxy = js.Any.fromFunction0(use_media_proxy))
    __obj.asInstanceOf[Typeofmediaproxy]
  }
  @scala.inline
  implicit class TypeofmediaproxyOps[Self <: Typeofmediaproxy] (val x: Self) extends AnyVal {
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
    def setEnd_media_session(value: () => Double): Self = this.set("end_media_session", js.Any.fromFunction0(value))
    @scala.inline
    def setEngage_media_proxy(value: () => Double): Self = this.set("engage_media_proxy", js.Any.fromFunction0(value))
    @scala.inline
    def setUse_media_proxy(value: () => Double): Self = this.set("use_media_proxy", js.Any.fromFunction0(value))
  }
  
}

