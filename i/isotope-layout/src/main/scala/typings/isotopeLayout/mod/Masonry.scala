package typings.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Masonry extends js.Object {
  
  var columnWidth: js.UndefOr[Double | String] = js.native
  
  var fitWidth: js.UndefOr[Boolean] = js.native
  
  var gutter: js.UndefOr[Double | String] = js.native
}
object Masonry {
  
  @scala.inline
  def apply(): Masonry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Masonry]
  }
  
  @scala.inline
  implicit class MasonryOps[Self <: Masonry] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: Double | String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setFitWidth(value: Boolean): Self = this.set("fitWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitWidth: Self = this.set("fitWidth", js.undefined)
    
    @scala.inline
    def setGutter(value: Double | String): Self = this.set("gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
  }
}
