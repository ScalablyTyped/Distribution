package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" An aggregator function called when each cell is evaluated.
    *                                 Returns a value for the cell. If the returned value is null, no cell will be created in for the data source result.
    */
  var aggregator: js.UndefOr[js.Function] = js.native
  
  /**
    * A caption for the measure.
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * The path used when displaying the measure in the user interface. Nested folders are indicated by a backslash (\).
    */
  var displayFolder: js.UndefOr[String] = js.native
  
  /**
    * Optional="false" A unique name for the measure.
    */
  var name: js.UndefOr[String] = js.native
}
object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure {
  
  @scala.inline
  def apply(): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]
  }
  
  @scala.inline
  implicit class OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasureMutableBuilder[Self <: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure] (val x: Self) extends AnyVal {
    
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
