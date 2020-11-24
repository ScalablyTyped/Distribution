package typings.gridstack.gridstackDdMod

import typings.gridstack.typesMod.GridItemHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDDropOpt extends js.Object {
  
  /** function or class type that this grid will accept as dropped items (see GridStackOptions.acceptWidgets) */
  var accept: js.UndefOr[js.Function1[/* el */ GridItemHTMLElement, Boolean]] = js.native
}
object DDDropOpt {
  
  @scala.inline
  def apply(): DDDropOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DDDropOpt]
  }
  
  @scala.inline
  implicit class DDDropOptOps[Self <: DDDropOpt] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: /* el */ GridItemHTMLElement => Boolean): Self = this.set("accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
  }
}
