package typings.lgtv2.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var clientKey: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var reconnect: js.UndefOr[Double] = js.native
  var saveKey: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit], 
      Unit
    ]
  ] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    @scala.inline
    def setReconnect(value: Double): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    @scala.inline
    def setSaveKey(
      value: (/* key */ String, /* callback */ js.Function1[/* error */ js.UndefOr[ErrnoException | Null], Unit]) => Unit
    ): Self = this.set("saveKey", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSaveKey: Self = this.set("saveKey", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

