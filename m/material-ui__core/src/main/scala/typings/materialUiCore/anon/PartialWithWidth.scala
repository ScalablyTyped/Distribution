package typings.materialUiCore.anon

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidth> */
trait PartialWithWidth extends StObject {
  
  var width: js.UndefOr[Breakpoint] = js.undefined
}
object PartialWithWidth {
  
  @scala.inline
  def apply(): PartialWithWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithWidth]
  }
  
  @scala.inline
  implicit class PartialWithWidthMutableBuilder[Self <: PartialWithWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
