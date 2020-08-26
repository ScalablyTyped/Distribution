package typings.koaViews.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoRender extends js.Object {
  /*
    * autoRender the result into ctx.body, defaults to true
    */
  var autoRender: js.UndefOr[Boolean] = js.native
  /*
    * replace consolidate as default engine source
    */
  var engineSource: js.UndefOr[js.Any] = js.native
  /*
    * default extension for your views
    */
  var extension: js.UndefOr[String] = js.native
  /*
    * map a file extension to an engine
    */
  var map: js.UndefOr[js.Any] = js.native
  /*
    * these options will get passed to the view engine
    */
  var options: js.UndefOr[js.Any] = js.native
}

object AutoRender {
  @scala.inline
  def apply(): AutoRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRender]
  }
  @scala.inline
  implicit class AutoRenderOps[Self <: AutoRender] (val x: Self) extends AnyVal {
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
    def setAutoRender(value: Boolean): Self = this.set("autoRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRender: Self = this.set("autoRender", js.undefined)
    @scala.inline
    def setEngineSource(value: js.Any): Self = this.set("engineSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineSource: Self = this.set("engineSource", js.undefined)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

