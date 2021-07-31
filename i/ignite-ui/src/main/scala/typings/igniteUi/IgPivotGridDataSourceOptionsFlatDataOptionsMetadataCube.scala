package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube
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
  var dimensions: js.UndefOr[js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]] = js.undefined
  
  /**
    * An object providing information about the measures' root node.
    */
  var measuresDimension: js.UndefOr[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  
  /**
    * Optional="false" A unique name for the cube.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMutableBuilder[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMeasuresDimension(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension): Self = StObject.set(x, "measuresDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresDimensionUndefined: Self = StObject.set(x, "measuresDimension", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
