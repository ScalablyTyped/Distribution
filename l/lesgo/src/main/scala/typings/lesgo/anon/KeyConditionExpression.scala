package typings.lesgo.anon

import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExpressionAttributeValueMap
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyExpression
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import typings.lesgo.lesgoStrings.COUNT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyConditionExpression extends StObject {
  
  var ExpressionAttributeValues: ExpressionAttributeValueMap
  
  var KeyConditionExpression: KeyExpression
  
  var Select: COUNT
  
  var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
}
object KeyConditionExpression {
  
  inline def apply(
    ExpressionAttributeValues: ExpressionAttributeValueMap,
    KeyConditionExpression: KeyExpression,
    TableName: TableName
  ): KeyConditionExpression = {
    val __obj = js.Dynamic.literal(ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any], KeyConditionExpression = KeyConditionExpression.asInstanceOf[js.Any], Select = "COUNT", TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyConditionExpression]
  }
  
  extension [Self <: KeyConditionExpression](x: Self) {
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setKeyConditionExpression(value: KeyExpression): Self = StObject.set(x, "KeyConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: COUNT): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
