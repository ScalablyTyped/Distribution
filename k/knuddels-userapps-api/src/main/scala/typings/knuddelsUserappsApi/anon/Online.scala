package typings.knuddelsUserappsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Online extends js.Object {
  
  var ascending: js.UndefOr[Boolean] = js.native
  
  var maximumCount: js.UndefOr[Double] = js.native
  
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.native
  
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.native
  
  var online: js.UndefOr[Boolean] = js.native
}
object Online {
  
  @scala.inline
  def apply(): Online = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Online]
  }
  
  @scala.inline
  implicit class OnlineOps[Self <: Online] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    
    @scala.inline
    def setMaximumCount(value: Double): Self = this.set("maximumCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumCount: Self = this.set("maximumCount", js.undefined)
    
    @scala.inline
    def setOnEnd(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = this.set("onEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnline: Self = this.set("online", js.undefined)
  }
}
