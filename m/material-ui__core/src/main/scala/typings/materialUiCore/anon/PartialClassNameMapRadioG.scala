package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey>> */
trait PartialClassNameMapRadioG extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapRadioG {
  
  inline def apply(): PartialClassNameMapRadioG = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapRadioG]
  }
  
  extension [Self <: PartialClassNameMapRadioG](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
