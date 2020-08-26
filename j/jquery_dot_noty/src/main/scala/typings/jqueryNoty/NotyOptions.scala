package typings.jqueryNoty

import typings.jqueryNoty.jqueryNotyStrings.backdrop
import typings.jqueryNoty.jqueryNotyStrings.button
import typings.jqueryNoty.jqueryNotyStrings.click
import typings.jqueryNoty.jqueryNotyStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotyOptions extends js.Object {
  var animation: js.UndefOr[NotyAnimationOptions] = js.native
  /** an array of buttons, for creating confirmation dialogs. */
  var buttons: js.UndefOr[js.Any] = js.native
  var callback: js.UndefOr[NotyCallbackOptions] = js.native
  /** backdrop click will close all notifications */
  var closeWith: js.UndefOr[js.Array[click | button | hover | backdrop]] = js.native
  /** If you want to use queue feature set this true. */
  var dismissQueue: js.UndefOr[Boolean] = js.native
  /** adds notification to the beginning of queue when set to true */
  var force: js.UndefOr[Boolean] = js.native
  /** if true closes all notifications and shows itself */
  var killer: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[String] = js.native
  /** You can set max visible notification for dismissQueue true option */
  var maxVisible: js.UndefOr[Double] = js.native
  /** if true adds an overlay */
  var modal: js.UndefOr[Boolean] = js.native
  /** displays a progress bar */
  var progressBar: js.UndefOr[Boolean] = js.native
  /** The note`s optional template like '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>' */
  var template: js.UndefOr[String] = js.native
  /** Text to show. Can be html or string. */
  var text: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  /** Delay for closing event. Set false for sticky notifications */
  var timeout: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object NotyOptions {
  @scala.inline
  def apply(): NotyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyOptions]
  }
  @scala.inline
  implicit class NotyOptionsOps[Self <: NotyOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: NotyAnimationOptions): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCallback(value: NotyCallbackOptions): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCloseWithVarargs(value: (click | button | hover | backdrop)*): Self = this.set("closeWith", js.Array(value :_*))
    @scala.inline
    def setCloseWith(value: js.Array[click | button | hover | backdrop]): Self = this.set("closeWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseWith: Self = this.set("closeWith", js.undefined)
    @scala.inline
    def setDismissQueue(value: Boolean): Self = this.set("dismissQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissQueue: Self = this.set("dismissQueue", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setKiller(value: Boolean): Self = this.set("killer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKiller: Self = this.set("killer", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMaxVisible(value: Double): Self = this.set("maxVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVisible: Self = this.set("maxVisible", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

