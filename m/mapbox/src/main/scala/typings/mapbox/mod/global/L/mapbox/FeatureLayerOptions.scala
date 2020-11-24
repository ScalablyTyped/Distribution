package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerOptions extends js.Object {
  
  var filter: js.UndefOr[FilterFunction] = js.native
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}
object FeatureLayerOptions {
  
  @scala.inline
  def apply(): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerOptions]
  }
  
  @scala.inline
  implicit class FeatureLayerOptionsOps[Self <: FeatureLayerOptions] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: /* feature */ js.Any => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSanitizer(value: /* template */ String => String): Self = this.set("sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
  }
}
