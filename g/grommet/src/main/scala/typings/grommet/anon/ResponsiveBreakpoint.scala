package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveBreakpoint extends js.Object {
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var responsiveBreakpoint: js.UndefOr[String] = js.native
}
object ResponsiveBreakpoint {
  
  @scala.inline
  def apply(): ResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveBreakpoint]
  }
  
  @scala.inline
  implicit class ResponsiveBreakpointOps[Self <: ResponsiveBreakpoint] (val x: Self) extends AnyVal {
    
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
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setResponsiveBreakpoint(value: String): Self = this.set("responsiveBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveBreakpoint: Self = this.set("responsiveBreakpoint", js.undefined)
  }
}
