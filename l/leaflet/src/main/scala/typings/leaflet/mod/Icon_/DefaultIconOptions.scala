package typings.leaflet.mod.Icon_

import typings.leaflet.mod.BaseIconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultIconOptions extends BaseIconOptions {
  
  var imagePath: js.UndefOr[String] = js.native
}
object DefaultIconOptions {
  
  @scala.inline
  def apply(): DefaultIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultIconOptions]
  }
  
  @scala.inline
  implicit class DefaultIconOptionsOps[Self <: DefaultIconOptions] (val x: Self) extends AnyVal {
    
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
    def setImagePath(value: String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
  }
}
