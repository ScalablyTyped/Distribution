package typings.jqueryLazyload.JQueryLazyLoad

import typings.jqueryLazyload.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var appear: js.UndefOr[(js.Function2[/* elementsLeft */ Double, /* options */ this.type, Unit]) | Null] = js.native
  
  var container: js.UndefOr[JQuery] = js.native
  
  var data_attribute: js.UndefOr[String] = js.native
  
  var effect: js.UndefOr[String] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var failure_limit: js.UndefOr[Double] = js.native
  
  var load: js.UndefOr[
    js.Function2[/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[this.type], Unit]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var skip_invisible: js.UndefOr[Boolean] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
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
    def setAppear(value: (/* elementsLeft */ Double, Options) => Unit): Self = this.set("appear", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setAppearNull: Self = this.set("appear", null)
    
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setData_attribute(value: String): Self = this.set("data_attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_attribute: Self = this.set("data_attribute", js.undefined)
    
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setFailure_limit(value: Double): Self = this.set("failure_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure_limit: Self = this.set("failure_limit", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[Options]) => Unit): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSkip_invisible(value: Boolean): Self = this.set("skip_invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip_invisible: Self = this.set("skip_invisible", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
