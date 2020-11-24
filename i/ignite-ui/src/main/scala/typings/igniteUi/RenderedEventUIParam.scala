package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderedEventUIParam extends js.Object {
  
  /**
    * Used to get a reference to the main/top combo element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get a reference to the combo performing rendering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object RenderedEventUIParam {
  
  @scala.inline
  def apply(): RenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedEventUIParam]
  }
  
  @scala.inline
  implicit class RenderedEventUIParamOps[Self <: RenderedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
