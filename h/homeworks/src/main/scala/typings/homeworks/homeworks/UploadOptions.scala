package typings.homeworks.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
@js.native
trait UploadOptions extends js.Object {
  var beforeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var complete: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dest: js.UndefOr[String] = js.native
  var error: js.UndefOr[
    js.Function3[
      /* xhr */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* error */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var extensions: js.UndefOr[js.Any] = js.native
  var isBtn: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* state */ js.UndefOr[js.Any], 
      /* xhr */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: String = js.native
}

object UploadOptions {
  @scala.inline
  def apply(url: String): UploadOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeStart(value: () => Unit): Self = this.set("beforeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeStart: Self = this.set("beforeStart", js.undefined)
    @scala.inline
    def setComplete(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setError(
      value: (/* xhr */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* error */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExtensions(value: js.Any): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setIsBtn(value: Boolean): Self = this.set("isBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBtn: Self = this.set("isBtn", js.undefined)
    @scala.inline
    def setSuccess(
      value: (/* data */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* xhr */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("success", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

