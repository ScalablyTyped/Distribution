package typings.grommet.anon

import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.componentsGridMod.AreasType
import typings.grommet.componentsGridMod.GridColumnsType
import typings.grommet.componentsGridMod.GridGapType
import typings.grommet.componentsGridMod.GridSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Areas extends StObject {
  
  var actions: js.UndefOr[BoxProps] = js.undefined
  
  var areas: js.UndefOr[AreasType] = js.undefined
  
  var breakpoints: js.UndefOr[js.Array[String]] = js.undefined
  
  var columns: js.UndefOr[GridColumnsType] = js.undefined
  
  var gap: js.UndefOr[GridGapType] = js.undefined
  
  var rows: js.UndefOr[GridSizeType] = js.undefined
}
object Areas {
  
  inline def apply(): Areas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Areas]
  }
  
  extension [Self <: Areas](x: Self) {
    
    inline def setActions(value: BoxProps): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setAreas(value: AreasType): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    inline def setAreasVarargs(value: (js.Array[String] | End)*): Self = StObject.set(x, "areas", js.Array(value*))
    
    inline def setBreakpoints(value: js.Array[String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: String*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setColumns(value: GridColumnsType): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGap(value: GridGapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setRows(value: GridSizeType): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: String*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
