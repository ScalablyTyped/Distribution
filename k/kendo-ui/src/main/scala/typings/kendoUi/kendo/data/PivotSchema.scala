package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotSchema
  extends StObject
     with DataSourceSchema {
  
  var axes: js.UndefOr[js.Any] = js.undefined
  
  var catalogs: js.UndefOr[js.Any] = js.undefined
  
  var cube: js.UndefOr[js.Any] = js.undefined
  
  var cubes: js.UndefOr[js.Any] = js.undefined
  
  var dimensions: js.UndefOr[js.Any] = js.undefined
  
  var hierarchies: js.UndefOr[js.Any] = js.undefined
  
  var levels: js.UndefOr[js.Any] = js.undefined
  
  var measures: js.UndefOr[js.Any] = js.undefined
}
object PivotSchema {
  
  @scala.inline
  def apply(): PivotSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotSchema]
  }
  
  @scala.inline
  implicit class PivotSchemaMutableBuilder[Self <: PivotSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setCatalogs(value: js.Any): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    @scala.inline
    def setCube(value: js.Any): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    @scala.inline
    def setCubes(value: js.Any): Self = StObject.set(x, "cubes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubesUndefined: Self = StObject.set(x, "cubes", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Any): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setHierarchies(value: js.Any): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Any): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setMeasures(value: js.Any): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
  }
}
