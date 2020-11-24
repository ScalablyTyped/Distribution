package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ScrollSpyOptions> */
@js.native
trait PartialScrollSpyOptions extends js.Object {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  
  var scrollOffset: js.UndefOr[Double] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
}
object PartialScrollSpyOptions {
  
  @scala.inline
  def apply(): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
  
  @scala.inline
  implicit class PartialScrollSpyOptionsOps[Self <: PartialScrollSpyOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setGetActiveElement(value: /* id */ String => String): Self = this.set("getActiveElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetActiveElement: Self = this.set("getActiveElement", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
}
