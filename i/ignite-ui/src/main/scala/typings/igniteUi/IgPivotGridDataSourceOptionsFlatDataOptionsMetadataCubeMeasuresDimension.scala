package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A caption for the measures dimension.
    * The default value is "Measures".
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * An array of measure metadata objects.
    */
  var measures: js.UndefOr[
    js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]
  ] = js.undefined
  
  /**
    * A unique name for the measures dimension.
    * The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
    * [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension {
  
  @scala.inline
  def apply(): IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension]
  }
  
  @scala.inline
  implicit class IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMutableBuilder[Self <: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setMeasures(value: js.Array[IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setMeasuresVarargs(value: IgPivotGridDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimensionMeasure*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
