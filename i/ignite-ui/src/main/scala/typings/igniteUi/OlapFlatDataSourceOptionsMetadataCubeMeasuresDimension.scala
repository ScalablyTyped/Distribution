package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A caption for the measures dimension.
    *                             The default value is "Measures".
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * An array of measure metadata objects.
    */
  var measures: js.UndefOr[js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]] = js.undefined
  
  /**
    * A unique name for the measures dimension.
    *                             The default value is "Measures". This name is used to create the names of dimensions using the following pattern:
    *                             [<measuresDimensionMetadata.name>].[<measureMetadata.name>]
    */
  var name: js.UndefOr[String] = js.undefined
}
object OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension {
  
  inline def apply(): OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension]
  }
  
  extension [Self <: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimension](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setMeasures(value: js.Array[OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: OlapFlatDataSourceOptionsMetadataCubeMeasuresDimensionMeasure*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
