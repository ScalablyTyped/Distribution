package typings.insertCss.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertCssOptions extends js.Object {
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var prepend: js.UndefOr[Boolean] = js.native
}
object InsertCssOptions {
  
  @scala.inline
  def apply(): InsertCssOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertCssOptions]
  }
  
  @scala.inline
  implicit class InsertCssOptionsOps[Self <: InsertCssOptions] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
  }
}
