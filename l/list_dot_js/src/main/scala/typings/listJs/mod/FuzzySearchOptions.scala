package typings.listJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FuzzySearchOptions extends js.Object {
  
  var distance: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var multiSearch: js.UndefOr[Boolean] = js.native
  
  var searchClass: js.UndefOr[String] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object FuzzySearchOptions {
  
  @scala.inline
  def apply(): FuzzySearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FuzzySearchOptions]
  }
  
  @scala.inline
  implicit class FuzzySearchOptionsOps[Self <: FuzzySearchOptions] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMultiSearch(value: Boolean): Self = this.set("multiSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSearch: Self = this.set("multiSearch", js.undefined)
    
    @scala.inline
    def setSearchClass(value: String): Self = this.set("searchClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchClass: Self = this.set("searchClass", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
