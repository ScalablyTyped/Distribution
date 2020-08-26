package typings.jqueryJoyride.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTML segments for tip layout
  */
@js.native
trait JoyrideTemplate extends js.Object {
  /**
    * Button template
    * @member {string}
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Exposed Cover template
    * @member {string}
    */
  var exposeCover: js.UndefOr[String] = js.native
  /**
    * Link template
    * @member {string}
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Modal template
    * @member {string}
    */
  var modal: js.UndefOr[String] = js.native
  /**
    * Timer template
    * @member {string}
    */
  var timer: js.UndefOr[String] = js.native
  /**
    * Tip template
    * @member {string}
    */
  var tip: js.UndefOr[String] = js.native
  /**
    * Wrapper template
    * @member {string}
    */
  var wrapper: js.UndefOr[String] = js.native
}

object JoyrideTemplate {
  @scala.inline
  def apply(): JoyrideTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideTemplate]
  }
  @scala.inline
  implicit class JoyrideTemplateOps[Self <: JoyrideTemplate] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setExposeCover(value: String): Self = this.set("exposeCover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposeCover: Self = this.set("exposeCover", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setModal(value: String): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setTimer(value: String): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    @scala.inline
    def setTip(value: String): Self = this.set("tip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

