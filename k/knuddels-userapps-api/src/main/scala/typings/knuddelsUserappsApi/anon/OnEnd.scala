package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEnd extends js.Object {
  
  var onEnd: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
  
  var onStart: js.UndefOr[
    js.Function2[/* accessibleUserCount */ Double, /* key */ js.UndefOr[String], Unit]
  ] = js.native
  
  var online: js.UndefOr[Boolean] = js.native
}
object OnEnd {
  
  @scala.inline
  def apply(): OnEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnd]
  }
  
  @scala.inline
  implicit class OnEndOps[Self <: OnEnd] (val x: Self) extends AnyVal {
    
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
    def setOnEnd(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = this.set("onEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* accessibleUserCount */ Double, /* key */ js.UndefOr[String]) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnline: Self = this.set("online", js.undefined)
  }
}
