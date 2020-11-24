package typings.grommet.dataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sections[TBody, THeader, TFooter, TPinned] extends js.Object {
  
  var body: js.UndefOr[TBody] = js.native
  
  var footer: js.UndefOr[TFooter] = js.native
  
  var header: js.UndefOr[THeader] = js.native
  
  var pinned: js.UndefOr[TPinned] = js.native
}
object Sections {
  
  @scala.inline
  def apply[TBody, THeader, TFooter, TPinned](): Sections[TBody, THeader, TFooter, TPinned] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sections[TBody, THeader, TFooter, TPinned]]
  }
  
  @scala.inline
  implicit class SectionsOps[Self <: Sections[_, _, _, _], TBody, THeader, TFooter, TPinned] (val x: Self with (Sections[TBody, THeader, TFooter, TPinned])) extends AnyVal {
    
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
    def setBody(value: TBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setFooter(value: TFooter): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: THeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setPinned(value: TPinned): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
  }
}
