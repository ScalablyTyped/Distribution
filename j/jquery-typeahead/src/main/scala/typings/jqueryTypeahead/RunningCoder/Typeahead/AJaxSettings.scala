package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQueryXHR
import typings.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AJaxSettings
  extends AjaxSettings[js.Any] {
  var always: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.native
  var done: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[JQuery], 
      /* textStatus */ js.UndefOr[String], 
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      Unit
    ]
  ] = js.native
  var fail: js.UndefOr[
    js.Function3[
      /* jqXHR */ js.UndefOr[JQueryXHR], 
      /* textStatus */ js.UndefOr[String], 
      /* errorThrown */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var path: js.UndefOr[String] = js.native
  var `then`: js.UndefOr[
    js.Function2[/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], Unit]
  ] = js.native
}

object AJaxSettings {
  @scala.inline
  def apply(): AJaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AJaxSettings]
  }
  @scala.inline
  implicit class AJaxSettingsOps[Self <: AJaxSettings] (val x: Self) extends AnyVal {
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
    def setAlways(
      value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
    ): Self = this.set("always", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    @scala.inline
    def setDone(
      value: (/* data */ js.UndefOr[JQuery], /* textStatus */ js.UndefOr[String], /* jqXHR */ js.UndefOr[JQueryXHR]) => Unit
    ): Self = this.set("done", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setFail(
      value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String], /* errorThrown */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("fail", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setThen(value: (/* jqXHR */ js.UndefOr[JQueryXHR], /* textStatus */ js.UndefOr[String]) => Unit): Self = this.set("then", js.Any.fromFunction2(value))
    @scala.inline
    def deleteThen: Self = this.set("then", js.undefined)
  }
  
}

