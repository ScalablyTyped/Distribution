package typings.jqueryForm

import typings.jquery.JQuery.AjaxSettings
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFormOptions
  extends AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ this.type, Boolean]] = js.native
  var beforeSubmit: js.UndefOr[
    js.Function3[/* formData */ js.Array[_], /* $form */ JQuery, /* options */ this.type, Boolean]
  ] = js.native
  var clearForm: js.UndefOr[Boolean] = js.native
  var forceSync: js.UndefOr[Boolean] = js.native
  var iframe: js.UndefOr[Boolean] = js.native
  var iframeSrc: js.UndefOr[String] = js.native
  var iframeTarget: js.UndefOr[js.Any] = js.native
  var replaceTarget: js.UndefOr[Boolean] = js.native
  var resetForm: js.UndefOr[Boolean] = js.native
  var semantic: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Any] = js.native
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent[EventTarget], 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.native
}

object JQueryFormOptions {
  @scala.inline
  def apply(): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFormOptions]
  }
  @scala.inline
  implicit class JQueryFormOptionsOps[Self <: JQueryFormOptions] (val x: Self) extends AnyVal {
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
    def setBeforeSerialize(value: (/* $form */ JQuery, JQueryFormOptions) => Boolean): Self = this.set("beforeSerialize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSerialize: Self = this.set("beforeSerialize", js.undefined)
    @scala.inline
    def setBeforeSubmit(value: (/* formData */ js.Array[_], /* $form */ JQuery, JQueryFormOptions) => Boolean): Self = this.set("beforeSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeSubmit: Self = this.set("beforeSubmit", js.undefined)
    @scala.inline
    def setClearForm(value: Boolean): Self = this.set("clearForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearForm: Self = this.set("clearForm", js.undefined)
    @scala.inline
    def setForceSync(value: Boolean): Self = this.set("forceSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSync: Self = this.set("forceSync", js.undefined)
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setIframeSrc(value: String): Self = this.set("iframeSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeSrc: Self = this.set("iframeSrc", js.undefined)
    @scala.inline
    def setIframeTarget(value: js.Any): Self = this.set("iframeTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeTarget: Self = this.set("iframeTarget", js.undefined)
    @scala.inline
    def setReplaceTarget(value: Boolean): Self = this.set("replaceTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceTarget: Self = this.set("replaceTarget", js.undefined)
    @scala.inline
    def setResetForm(value: Boolean): Self = this.set("resetForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetForm: Self = this.set("resetForm", js.undefined)
    @scala.inline
    def setSemantic(value: Boolean): Self = this.set("semantic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemantic: Self = this.set("semantic", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUploadProgress(
      value: (/* event */ ProgressEvent[EventTarget], /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Unit
    ): Self = this.set("uploadProgress", js.Any.fromFunction4(value))
    @scala.inline
    def deleteUploadProgress: Self = this.set("uploadProgress", js.undefined)
  }
  
}

