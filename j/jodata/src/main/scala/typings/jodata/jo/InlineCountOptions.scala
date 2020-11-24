package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineCountOptions extends js.Object {
  
  def allPages(): typings.jodata.jo = js.native
  
  def none(): typings.jodata.jo = js.native
}
object InlineCountOptions {
  
  @scala.inline
  def apply(allPages: () => typings.jodata.jo, none: () => typings.jodata.jo): InlineCountOptions = {
    val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
    __obj.asInstanceOf[InlineCountOptions]
  }
  
  @scala.inline
  implicit class InlineCountOptionsOps[Self <: InlineCountOptions] (val x: Self) extends AnyVal {
    
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
    def setAllPages(value: () => typings.jodata.jo): Self = this.set("allPages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNone(value: () => typings.jodata.jo): Self = this.set("none", js.Any.fromFunction0(value))
  }
}
