package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDialogLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the title/tooltip for the close button in the dialog.
    *
    */
  var closeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the title/tooltip for the maximize button in the dialog.
    *
    */
  var maximizeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the title/tooltip for the minimize button in the dialog.
    *
    */
  var minimizeButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the title/tooltip for the pin button in the dialog.
    *
    */
  var pinButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the title/tooltip for the restore button in the dialog.
    *
    */
  var restoreButtonTitle: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the title/tooltip for the pin button in the dialog.
    *
    */
  var unpinButtonTitle: js.UndefOr[String] = js.native
}

object IgDialogLocale {
  @scala.inline
  def apply(): IgDialogLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDialogLocale]
  }
  @scala.inline
  implicit class IgDialogLocaleOps[Self <: IgDialogLocale] (val x: Self) extends AnyVal {
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
    def setCloseButtonTitle(value: String): Self = this.set("closeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonTitle: Self = this.set("closeButtonTitle", js.undefined)
    @scala.inline
    def setMaximizeButtonTitle(value: String): Self = this.set("maximizeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizeButtonTitle: Self = this.set("maximizeButtonTitle", js.undefined)
    @scala.inline
    def setMinimizeButtonTitle(value: String): Self = this.set("minimizeButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizeButtonTitle: Self = this.set("minimizeButtonTitle", js.undefined)
    @scala.inline
    def setPinButtonTitle(value: String): Self = this.set("pinButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinButtonTitle: Self = this.set("pinButtonTitle", js.undefined)
    @scala.inline
    def setRestoreButtonTitle(value: String): Self = this.set("restoreButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreButtonTitle: Self = this.set("restoreButtonTitle", js.undefined)
    @scala.inline
    def setUnpinButtonTitle(value: String): Self = this.set("unpinButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpinButtonTitle: Self = this.set("unpinButtonTitle", js.undefined)
  }
  
}

