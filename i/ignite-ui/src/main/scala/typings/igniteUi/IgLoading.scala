package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoading
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var cssClass: js.UndefOr[js.Any] = js.native
  
  var includeVerticalOffset: js.UndefOr[Boolean] = js.native
}
object IgLoading {
  
  @scala.inline
  def apply(): IgLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLoading]
  }
  
  @scala.inline
  implicit class IgLoadingOps[Self <: IgLoading] (val x: Self) extends AnyVal {
    
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
    def setCssClass(value: js.Any): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setIncludeVerticalOffset(value: Boolean): Self = this.set("includeVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeVerticalOffset: Self = this.set("includeVerticalOffset", js.undefined)
  }
}
