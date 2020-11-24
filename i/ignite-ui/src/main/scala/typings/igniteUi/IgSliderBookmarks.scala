package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSliderBookmarks
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Get or set a custom css class to be applied to the bookmark anchor element.
    */
  var css: js.UndefOr[String] = js.native
  
  /**
    * Get or set whether the bookmark is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Get or set the bookmark title. Show in tooltip on hover.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Get or set the bookmark value. Should be between slider min and max values.
    */
  var value: js.UndefOr[Double] = js.native
}
object IgSliderBookmarks {
  
  @scala.inline
  def apply(): IgSliderBookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSliderBookmarks]
  }
  
  @scala.inline
  implicit class IgSliderBookmarksOps[Self <: IgSliderBookmarks] (val x: Self) extends AnyVal {
    
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
