package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the cube.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * An array of dimension metadata objects.
    */
  var dimensions: js.UndefOr[
    js.Array[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension]
  ] = js.undefined
  
  /**
    * An object providing information about the measures' root node.
    */
  var measuresDimension: js.UndefOr[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  
  /**
    * Optional="false" A unique name for the cube.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube {
  
  inline def apply(): IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube]
  }
  
  extension [Self <: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCube](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDimensions(value: js.Array[IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setMeasuresDimension(value: IgPivotDataSelectorDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension): Self = StObject.set(x, "measuresDimension", value.asInstanceOf[js.Any])
    
    inline def setMeasuresDimensionUndefined: Self = StObject.set(x, "measuresDimension", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
