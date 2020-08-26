package typings.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSplitPane extends js.Object {
  /**
    * The content `id` of the split-pane's main content.
    */
  var contentId: js.UndefOr[String] = js.native
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: Boolean = js.native
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: String | Boolean = js.native
}

object IonSplitPane {
  @scala.inline
  def apply(disabled: Boolean, when: String | Boolean): IonSplitPane = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSplitPane]
  }
  @scala.inline
  implicit class IonSplitPaneOps[Self <: IonSplitPane] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhen(value: String | Boolean): Self = this.set("when", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
  }
  
}

