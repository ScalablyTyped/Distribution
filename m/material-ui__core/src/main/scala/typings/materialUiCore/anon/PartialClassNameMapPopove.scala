package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Popover/Popover.PopoverClassKey>> */
trait PartialClassNameMapPopove extends StObject {
  
  var paper: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapPopove {
  
  inline def apply(): PartialClassNameMapPopove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapPopove]
  }
  
  extension [Self <: PartialClassNameMapPopove](x: Self) {
    
    inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
  }
}
