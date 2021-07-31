package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" An aggregator function called when each cell is evaluated.
    * Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
    */
  var aggregator: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A caption for the measure.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
    */
  var displayFolder: js.UndefOr[String] = js.undefined
  
  /**
    * Optional="false" A unique name for the measure.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure {
  
  @scala.inline
  def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasureMutableBuilder[Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregator(value: js.Function): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorUndefined: Self = StObject.set(x, "aggregator", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDisplayFolder(value: String): Self = StObject.set(x, "displayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFolderUndefined: Self = StObject.set(x, "displayFolder", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
