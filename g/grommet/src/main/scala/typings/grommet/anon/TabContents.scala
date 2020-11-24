package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabContents extends js.Object {
  
  var tabContents: js.UndefOr[String] = js.native
}
object TabContents {
  
  @scala.inline
  def apply(): TabContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContents]
  }
  
  @scala.inline
  implicit class TabContentsOps[Self <: TabContents] (val x: Self) extends AnyVal {
    
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
    def setTabContents(value: String): Self = this.set("tabContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabContents: Self = this.set("tabContents", js.undefined)
  }
}
