package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingStrokeColor extends js.Object {
  
  var loadingStrokeColor: js.UndefOr[String] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
}
object LoadingStrokeColor {
  
  @scala.inline
  def apply(): LoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingStrokeColor]
  }
  
  @scala.inline
  implicit class LoadingStrokeColorOps[Self <: LoadingStrokeColor] (val x: Self) extends AnyVal {
    
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
    def setLoadingStrokeColor(value: String): Self = this.set("loadingStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingStrokeColor: Self = this.set("loadingStrokeColor", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
}
