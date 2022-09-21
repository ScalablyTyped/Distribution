package typings.happyguestmxWebUtilities

import org.scalablytyped.runtime.StringDictionary
import typings.happyguestmxWebUtilities.mod.ComparisonOperator
import typings.happyguestmxWebUtilities.mod.FormErrorFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeValueList extends StObject {
    
    var AttributeValueList: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ComparisonOperator: typings.happyguestmxWebUtilities.mod.ComparisonOperator
  }
  object AttributeValueList {
    
    inline def apply(ComparisonOperator: ComparisonOperator): AttributeValueList = {
      val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeValueList]
    }
    
    extension [Self <: AttributeValueList](x: Self) {
      
      inline def setAttributeValueList(value: js.Array[Any]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
      
      inline def setAttributeValueListVarargs(value: Any*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
      
      inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    var fields: FormErrorFields
  }
  object Fields {
    
    inline def apply(fields: FormErrorFields): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: FormErrorFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemCollectionKey extends StObject {
    
    var ItemCollectionKey: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var SizeEstimateRangeGB: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ItemCollectionKey {
    
    inline def apply(): ItemCollectionKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemCollectionKey]
    }
    
    extension [Self <: ItemCollectionKey](x: Self) {
      
      inline def setItemCollectionKey(value: StringDictionary[Any]): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
      
      inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
      
      inline def setSizeEstimateRangeGB(value: js.Array[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
      
      inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
      
      inline def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value*))
    }
  }
}
