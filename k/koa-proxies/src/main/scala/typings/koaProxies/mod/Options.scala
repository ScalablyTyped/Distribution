package typings.koaProxies.mod

import org.scalablytyped.runtime.StringDictionary
import typings.httpProxy.mod.ServerOptions
import typings.koa.mod.DefaultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ServerOptions {
  var events: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.native
  var logs: js.UndefOr[Boolean] = js.native
  var rewrite: js.UndefOr[js.Function2[/* url */ String, /* ctx */ DefaultContext, String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEvents(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setLogs(value: Boolean): Self = this.set("logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    @scala.inline
    def setRewrite(value: (/* url */ String, /* ctx */ DefaultContext) => String): Self = this.set("rewrite", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
  }
  
}

