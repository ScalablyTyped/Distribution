package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumnMovingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies caption for the move first dropdown button.
    *
    */
  var dropDownMoveFirstText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for the move last dropdown button.
    *
    */
  var dropDownMoveLastText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for the move left dropdown button.
    *
    */
  var dropDownMoveLeftText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for the move right dropdown button.
    *
    */
  var dropDownMoveRightText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption text for the feature chooser submenu button.
    *
    */
  var featureChooserSubmenuText: js.UndefOr[String] = js.native
  
  /**
    * Specifies the apply button text.
    *
    */
  var movingDialogButtonApplyText: js.UndefOr[String] = js.native
  
  /**
    * Specifies the cancel button text.
    *
    */
  var movingDialogButtonCancelText: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for each move up button in the column moving dialog.
    *
    */
  var movingDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption for each move down button in the column moving dialog.
    *
    */
  var movingDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption text for the column moving dialog.
    *
    */
  var movingDialogCaptionText: js.UndefOr[String] = js.native
  
  /**
    * Specifies title for close dialog button.
    *
    */
  var movingDialogCloseButtonTitle: js.UndefOr[String] = js.native
  
  /**
    * Specifies caption text for the feature chooser entry.
    *
    */
  var movingDialogDisplayText: js.UndefOr[String] = js.native
  
  /**
    * Specifies text for drop tooltip in column moving dialog.
    *
    */
  var movingDialogDropTooltipText: js.UndefOr[String] = js.native
  
  /**
    * Specifies tooltip text for the move indicator.
    *
    */
  var movingToolTipMove: js.UndefOr[String] = js.native
}
object IgGridColumnMovingLocale {
  
  @scala.inline
  def apply(): IgGridColumnMovingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMovingLocale]
  }
  
  @scala.inline
  implicit class IgGridColumnMovingLocaleOps[Self <: IgGridColumnMovingLocale] (val x: Self) extends AnyVal {
    
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
    def setDropDownMoveFirstText(value: String): Self = this.set("dropDownMoveFirstText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownMoveFirstText: Self = this.set("dropDownMoveFirstText", js.undefined)
    
    @scala.inline
    def setDropDownMoveLastText(value: String): Self = this.set("dropDownMoveLastText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownMoveLastText: Self = this.set("dropDownMoveLastText", js.undefined)
    
    @scala.inline
    def setDropDownMoveLeftText(value: String): Self = this.set("dropDownMoveLeftText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownMoveLeftText: Self = this.set("dropDownMoveLeftText", js.undefined)
    
    @scala.inline
    def setDropDownMoveRightText(value: String): Self = this.set("dropDownMoveRightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownMoveRightText: Self = this.set("dropDownMoveRightText", js.undefined)
    
    @scala.inline
    def setFeatureChooserSubmenuText(value: String): Self = this.set("featureChooserSubmenuText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureChooserSubmenuText: Self = this.set("featureChooserSubmenuText", js.undefined)
    
    @scala.inline
    def setMovingDialogButtonApplyText(value: String): Self = this.set("movingDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogButtonApplyText: Self = this.set("movingDialogButtonApplyText", js.undefined)
    
    @scala.inline
    def setMovingDialogButtonCancelText(value: String): Self = this.set("movingDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogButtonCancelText: Self = this.set("movingDialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionButtonAsc(value: String): Self = this.set("movingDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogCaptionButtonAsc: Self = this.set("movingDialogCaptionButtonAsc", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionButtonDesc(value: String): Self = this.set("movingDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogCaptionButtonDesc: Self = this.set("movingDialogCaptionButtonDesc", js.undefined)
    
    @scala.inline
    def setMovingDialogCaptionText(value: String): Self = this.set("movingDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogCaptionText: Self = this.set("movingDialogCaptionText", js.undefined)
    
    @scala.inline
    def setMovingDialogCloseButtonTitle(value: String): Self = this.set("movingDialogCloseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogCloseButtonTitle: Self = this.set("movingDialogCloseButtonTitle", js.undefined)
    
    @scala.inline
    def setMovingDialogDisplayText(value: String): Self = this.set("movingDialogDisplayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogDisplayText: Self = this.set("movingDialogDisplayText", js.undefined)
    
    @scala.inline
    def setMovingDialogDropTooltipText(value: String): Self = this.set("movingDialogDropTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingDialogDropTooltipText: Self = this.set("movingDialogDropTooltipText", js.undefined)
    
    @scala.inline
    def setMovingToolTipMove(value: String): Self = this.set("movingToolTipMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingToolTipMove: Self = this.set("movingToolTipMove", js.undefined)
  }
}
