package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchema
  extends StObject
     with DataSourceSchema {
  
  var axes: js.UndefOr[Any] = js.undefined
  
  var catalogs: js.UndefOr[Any] = js.undefined
  
  var cube: js.UndefOr[Any] = js.undefined
  
  var cubes: js.UndefOr[Any] = js.undefined
  
  var dimensions: js.UndefOr[Any] = js.undefined
  
  var hierarchies: js.UndefOr[Any] = js.undefined
  
  var levels: js.UndefOr[Any] = js.undefined
  
  var measures: js.UndefOr[Any] = js.undefined
}
object PivotSchema {
  
  inline def apply(): PivotSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotSchema]
  }
  
  extension [Self <: PivotSchema](x: Self) {
    
    inline def setAxes(value: Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setCatalogs(value: Any): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCube(value: Any): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    inline def setCubes(value: Any): Self = StObject.set(x, "cubes", value.asInstanceOf[js.Any])
    
    inline def setCubesUndefined: Self = StObject.set(x, "cubes", js.undefined)
    
    inline def setDimensions(value: Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setHierarchies(value: Any): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    inline def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    inline def setLevels(value: Any): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setMeasures(value: Any): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
  }
}
