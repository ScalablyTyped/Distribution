package typings.layuiSrc.layui

import typings.layuiSrc.layuiSrcStrings.audio
import typings.layuiSrc.layuiSrcStrings.file
import typings.layuiSrc.layuiSrcStrings.images
import typings.layuiSrc.layuiSrcStrings.video
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadOption extends js.Object {
  var accept: js.UndefOr[images | file | video | audio] = js.native
  var acceptMime: js.UndefOr[String] = js.native
  var allDone: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  var auto: js.UndefOr[Boolean] = js.native
  var before: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  var bindAction: js.UndefOr[String | HTMLElement] = js.native
  var choose: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  var data: js.UndefOr[js.Object] = js.native
  var done: js.UndefOr[
    js.Function3[/* res */ js.Object, /* index */ Double, /* upload */ js.Function0[Unit], Unit]
  ] = js.native
  var drag: js.UndefOr[Boolean] = js.native
  var elem: js.UndefOr[String | HTMLElement] = js.native
  var error: js.UndefOr[js.Function2[/* index */ Double, /* upload */ js.Function0[Unit], Unit]] = js.native
  var exts: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var header: js.UndefOr[js.Object] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var number: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object UploadOption {
  @scala.inline
  def apply(): UploadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOption]
  }
  @scala.inline
  implicit class UploadOptionOps[Self <: UploadOption] (val x: Self) extends AnyVal {
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
    def setAccept(value: images | file | video | audio): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptMime(value: String): Self = this.set("acceptMime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptMime: Self = this.set("acceptMime", js.undefined)
    @scala.inline
    def setAllDone(value: /* obj */ js.Object => Unit): Self = this.set("allDone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAllDone: Self = this.set("allDone", js.undefined)
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setBefore(value: /* obj */ js.Object => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBindAction(value: String | HTMLElement): Self = this.set("bindAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindAction: Self = this.set("bindAction", js.undefined)
    @scala.inline
    def setChoose(value: /* obj */ js.Object => Unit): Self = this.set("choose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChoose: Self = this.set("choose", js.undefined)
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDone(value: (/* res */ js.Object, /* index */ Double, /* upload */ js.Function0[Unit]) => Unit): Self = this.set("done", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    @scala.inline
    def setError(value: (/* index */ Double, /* upload */ js.Function0[Unit]) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExts(value: String): Self = this.set("exts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExts: Self = this.set("exts", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

