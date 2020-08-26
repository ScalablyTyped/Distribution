package typings.jsDataHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseHttpAdapter extends IBaseAdapter {
  var basePath: js.UndefOr[String] = js.native
  var forceTrailingSlash: js.UndefOr[Boolean] = js.native
  var http: js.UndefOr[js.Any] = js.native
  var httpConfig: js.UndefOr[IDict] = js.native
  var suffix: js.UndefOr[String] = js.native
  var useFetch: js.UndefOr[Boolean] = js.native
}

object IBaseHttpAdapter {
  @scala.inline
  def apply(): IBaseHttpAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseHttpAdapter]
  }
  @scala.inline
  implicit class IBaseHttpAdapterOps[Self <: IBaseHttpAdapter] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    @scala.inline
    def setForceTrailingSlash(value: Boolean): Self = this.set("forceTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceTrailingSlash: Self = this.set("forceTrailingSlash", js.undefined)
    @scala.inline
    def setHttp(value: js.Any): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setHttpConfig(value: IDict): Self = this.set("httpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpConfig: Self = this.set("httpConfig", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setUseFetch(value: Boolean): Self = this.set("useFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFetch: Self = this.set("useFetch", js.undefined)
  }
  
}

