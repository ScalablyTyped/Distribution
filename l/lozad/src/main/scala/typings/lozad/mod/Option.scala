package typings.lozad.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var load: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  
  var loaded: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  
  var rootMargin: js.UndefOr[String] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: /* element */ Element => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoaded(value: /* element */ Element => Unit): Self = this.set("loaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setRootMargin(value: String): Self = this.set("rootMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMargin: Self = this.set("rootMargin", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
