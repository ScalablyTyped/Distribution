package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StringDictionary
import typings.happyguestmxWebUtilities.anon.AttributeValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanInput extends StObject {
  
  var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  var ConditionalOperator: js.UndefOr[String] = js.undefined
  
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  var ExclusiveStartKey: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var ExpressionAttributeNames: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var ExpressionAttributeValues: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var FilterExpression: js.UndefOr[String] = js.undefined
  
  var IndexName: js.UndefOr[String] = js.undefined
  
  var Limit: js.UndefOr[Double] = js.undefined
  
  var ProjectionExpression: js.UndefOr[String] = js.undefined
  
  var ReturnConsumedCapacity: js.UndefOr[String] = js.undefined
  
  var ScanFilter: js.UndefOr[StringDictionary[AttributeValueList]] = js.undefined
  
  var Segment: js.UndefOr[Double] = js.undefined
  
  var Select: js.UndefOr[String] = js.undefined
  
  var TableName: String
  
  var TotalSegments: js.UndefOr[Double] = js.undefined
}
object ScanInput {
  
  inline def apply(TableName: String): ScanInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanInput]
  }
  
  extension [Self <: ScanInput](x: Self) {
    
    inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
    
    inline def setConditionalOperator(value: String): Self = StObject.set(x, "ConditionalOperator", value.asInstanceOf[js.Any])
    
    inline def setConditionalOperatorUndefined: Self = StObject.set(x, "ConditionalOperator", js.undefined)
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setExclusiveStartKey(value: StringDictionary[Any]): Self = StObject.set(x, "ExclusiveStartKey", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartKeyUndefined: Self = StObject.set(x, "ExclusiveStartKey", js.undefined)
    
    inline def setExpressionAttributeNames(value: StringDictionary[String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: StringDictionary[Any]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setReturnConsumedCapacity(value: String): Self = StObject.set(x, "ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setReturnConsumedCapacityUndefined: Self = StObject.set(x, "ReturnConsumedCapacity", js.undefined)
    
    inline def setScanFilter(value: StringDictionary[AttributeValueList]): Self = StObject.set(x, "ScanFilter", value.asInstanceOf[js.Any])
    
    inline def setScanFilterUndefined: Self = StObject.set(x, "ScanFilter", js.undefined)
    
    inline def setSegment(value: Double): Self = StObject.set(x, "Segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "Segment", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTotalSegments(value: Double): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
    
    inline def setTotalSegmentsUndefined: Self = StObject.set(x, "TotalSegments", js.undefined)
  }
}
