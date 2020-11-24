package typings.handsontable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipRender extends js.Object {
  
  var skipRender: js.UndefOr[Boolean] = js.native
}
object SkipRender {
  
  @scala.inline
  def apply(): SkipRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipRender]
  }
  
  @scala.inline
  implicit class SkipRenderOps[Self <: SkipRender] (val x: Self) extends AnyVal {
    
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
    def setSkipRender(value: Boolean): Self = this.set("skipRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipRender: Self = this.set("skipRender", js.undefined)
  }
}
