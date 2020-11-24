package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGridGridOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables/disables rendering of alternating row styles (odd and even rows receive different styling). Note that if a custom jQuery template is set, this has no effect and CSS for the row should be adjusted manually in the template contents.
    */
  var alternateRowStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * Caption text that will be shown above the pivot grid header.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * Default column width that will be set for all columns.
    */
  var defaultColumnWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Enables/disables rendering of ui-state-hover classes when the mouse is over a record. This can be useful in templating scenarios, for example, where we don't want to apply hover styling to templated content.
    */
  var enableHoverStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of grid features definitions. The supported features are Resizing and Tooltips. Each feature goes with its separate options that are documented for the feature accordingly.
    *
    */
  var features: js.UndefOr[IgPivotGridGridOptionsFeatures] = js.native
  
  /**
    * Headers will be fixed if this option is set to true, and only the grid data will be scrollable.
    *
    */
  var fixedHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * Initial tabIndex attribute that will be set on the container element.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
}
object IgPivotGridGridOptions {
  
  @scala.inline
  def apply(): IgPivotGridGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridGridOptions]
  }
  
  @scala.inline
  implicit class IgPivotGridGridOptionsOps[Self <: IgPivotGridGridOptions] (val x: Self) extends AnyVal {
    
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
    def setAlternateRowStyles(value: Boolean): Self = this.set("alternateRowStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateRowStyles: Self = this.set("alternateRowStyles", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDefaultColumnWidth(value: String | Double): Self = this.set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumnWidth: Self = this.set("defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setEnableHoverStyles(value: Boolean): Self = this.set("enableHoverStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableHoverStyles: Self = this.set("enableHoverStyles", js.undefined)
    
    @scala.inline
    def setFeatures(value: IgPivotGridGridOptionsFeatures): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFixedHeaders(value: Boolean): Self = this.set("fixedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeaders: Self = this.set("fixedHeaders", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
