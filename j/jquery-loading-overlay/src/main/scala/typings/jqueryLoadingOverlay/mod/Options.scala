package typings.jqueryLoadingOverlay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  loadingClass :string,   overlayClass :string,   spinnerClass :string,   iconClass :string,   textClass :string,   loadingText :string}> */
@js.native
trait Options extends js.Object {
  
  var iconClass: js.UndefOr[String] = js.native
  
  var loadingClass: js.UndefOr[String] = js.native
  
  var loadingText: js.UndefOr[String] = js.native
  
  var overlayClass: js.UndefOr[String] = js.native
  
  var spinnerClass: js.UndefOr[String] = js.native
  
  var textClass: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setLoadingClass(value: String): Self = this.set("loadingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingClass: Self = this.set("loadingClass", js.undefined)
    
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    
    @scala.inline
    def setOverlayClass(value: String): Self = this.set("overlayClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClass: Self = this.set("overlayClass", js.undefined)
    
    @scala.inline
    def setSpinnerClass(value: String): Self = this.set("spinnerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinnerClass: Self = this.set("spinnerClass", js.undefined)
    
    @scala.inline
    def setTextClass(value: String): Self = this.set("textClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClass: Self = this.set("textClass", js.undefined)
  }
}
