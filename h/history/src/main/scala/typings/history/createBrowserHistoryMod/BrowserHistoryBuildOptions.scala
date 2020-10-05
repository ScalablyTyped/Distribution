package typings.history.createBrowserHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserHistoryBuildOptions extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var forceRefresh: js.UndefOr[Boolean] = js.native
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit], Unit]
  ] = js.native
  var keyLength: js.UndefOr[Double] = js.native
}

object BrowserHistoryBuildOptions {
  @scala.inline
  def apply(): BrowserHistoryBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserHistoryBuildOptions]
  }
  @scala.inline
  implicit class BrowserHistoryBuildOptionsOps[Self <: BrowserHistoryBuildOptions] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setForceRefresh(value: Boolean): Self = this.set("forceRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRefresh: Self = this.set("forceRefresh", js.undefined)
    @scala.inline
    def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* result */ Boolean, Unit]) => Unit): Self = this.set("getUserConfirmation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetUserConfirmation: Self = this.set("getUserConfirmation", js.undefined)
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
  }
  
}

