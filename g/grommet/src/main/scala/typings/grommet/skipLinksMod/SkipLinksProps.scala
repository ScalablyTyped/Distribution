package typings.grommet.skipLinksMod

import typings.grommet.anon.SkipTo
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipLinksProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var messages: js.UndefOr[SkipTo] = js.native
}
object SkipLinksProps {
  
  @scala.inline
  def apply(): SkipLinksProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipLinksProps]
  }
  
  @scala.inline
  implicit class SkipLinksPropsOps[Self <: SkipLinksProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setMessages(value: SkipTo): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
}
