package typings.materialUiCore.tablelvl2ContextMod

import typings.materialUiCore.materialUiCoreStrings.body
import typings.materialUiCore.materialUiCoreStrings.footer
import typings.materialUiCore.materialUiCoreStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tablelvl2ContextProps extends js.Object {
  
  var variant: head | body | footer = js.native
}
object Tablelvl2ContextProps {
  
  @scala.inline
  def apply(variant: head | body | footer): Tablelvl2ContextProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tablelvl2ContextProps]
  }
  
  @scala.inline
  implicit class Tablelvl2ContextPropsOps[Self <: Tablelvl2ContextProps] (val x: Self) extends AnyVal {
    
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
    def setVariant(value: head | body | footer): Self = this.set("variant", value.asInstanceOf[js.Any])
  }
}
