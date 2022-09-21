package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/ToggleButtonGroup/ToggleButtonGroup.ToggleButtonGroupClassKey>> */
trait PartialClassNameMapToggle extends StObject {
  
  var grouped: js.UndefOr[String] = js.undefined
  
  var groupedHorizontal: js.UndefOr[String] = js.undefined
  
  var groupedVertical: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var vertical: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapToggle {
  
  inline def apply(): PartialClassNameMapToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToggle]
  }
  
  extension [Self <: PartialClassNameMapToggle](x: Self) {
    
    inline def setGrouped(value: String): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    inline def setGroupedHorizontal(value: String): Self = StObject.set(x, "groupedHorizontal", value.asInstanceOf[js.Any])
    
    inline def setGroupedHorizontalUndefined: Self = StObject.set(x, "groupedHorizontal", js.undefined)
    
    inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    inline def setGroupedVertical(value: String): Self = StObject.set(x, "groupedVertical", value.asInstanceOf[js.Any])
    
    inline def setGroupedVerticalUndefined: Self = StObject.set(x, "groupedVertical", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
