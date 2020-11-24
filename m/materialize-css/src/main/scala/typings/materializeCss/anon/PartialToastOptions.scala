package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ToastOptions> */
@js.native
trait PartialToastOptions extends js.Object {
  
  var activationPercent: js.UndefOr[Double] = js.native
  
  var classes: js.UndefOr[String] = js.native
  
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var displayLength: js.UndefOr[Double] = js.native
  
  var html: js.UndefOr[String] = js.native
  
  var inDuration: js.UndefOr[Double] = js.native
  
  var outDuration: js.UndefOr[Double] = js.native
}
object PartialToastOptions {
  
  @scala.inline
  def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  
  @scala.inline
  implicit class PartialToastOptionsOps[Self <: PartialToastOptions] (val x: Self) extends AnyVal {
    
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
    def setActivationPercent(value: Double): Self = this.set("activationPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationPercent: Self = this.set("activationPercent", js.undefined)
    
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCompleteCallback(value: () => Unit): Self = this.set("completeCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCompleteCallback: Self = this.set("completeCallback", js.undefined)
    
    @scala.inline
    def setDisplayLength(value: Double): Self = this.set("displayLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLength: Self = this.set("displayLength", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInDuration: Self = this.set("inDuration", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutDuration: Self = this.set("outDuration", js.undefined)
  }
}
