package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveModeChangedEventUIParam extends js.Object {
  
  /**
    * Gets the newly assumed mode.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the igGridResponsive widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the previously assumed mode.
    */
  var previousMode: js.UndefOr[String] = js.native
}
object ResponsiveModeChangedEventUIParam {
  
  @scala.inline
  def apply(): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ResponsiveModeChangedEventUIParamOps[Self <: ResponsiveModeChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPreviousMode(value: String): Self = this.set("previousMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousMode: Self = this.set("previousMode", js.undefined)
  }
}
