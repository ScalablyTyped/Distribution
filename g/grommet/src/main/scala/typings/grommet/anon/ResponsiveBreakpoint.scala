package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveBreakpoint extends StObject {
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
}
object ResponsiveBreakpoint {
  
  @scala.inline
  def apply(): ResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveBreakpoint]
  }
  
  @scala.inline
  implicit class ResponsiveBreakpointMutableBuilder[Self <: ResponsiveBreakpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setResponsiveBreakpoint(value: String): Self = StObject.set(x, "responsiveBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveBreakpointUndefined: Self = StObject.set(x, "responsiveBreakpoint", js.undefined)
  }
}
