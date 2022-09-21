package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StringDictionary
import typings.happyguestmxWebUtilities.anon.ItemCollectionKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutItemOutput extends StObject {
  
  var Attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var ConsumedCapacity: js.UndefOr[js.Object] = js.undefined
  
  var ItemCollectionMetrics: js.UndefOr[ItemCollectionKey] = js.undefined
}
object PutItemOutput {
  
  inline def apply(): PutItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutItemOutput]
  }
  
  extension [Self <: PutItemOutput](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setConsumedCapacity(value: js.Object): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setItemCollectionMetrics(value: ItemCollectionKey): Self = StObject.set(x, "ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionMetricsUndefined: Self = StObject.set(x, "ItemCollectionMetrics", js.undefined)
  }
}
