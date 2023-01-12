package typings.lesgo.anon

import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ExpressionAttributeValueMap
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.KeyExpression
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionAttributeValues extends StObject {
  
  var ExpressionAttributeValues: ExpressionAttributeValueMap
  
  var KeyConditionExpression: KeyExpression
  
  var ProjectionExpression: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.ProjectionExpression
  
  var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
}
object ExpressionAttributeValues {
  
  inline def apply(
    ExpressionAttributeValues: ExpressionAttributeValueMap,
    KeyConditionExpression: KeyExpression,
    ProjectionExpression: ProjectionExpression,
    TableName: TableName
  ): ExpressionAttributeValues = {
    val __obj = js.Dynamic.literal(ExpressionAttributeValues = ExpressionAttributeValues.asInstanceOf[js.Any], KeyConditionExpression = KeyConditionExpression.asInstanceOf[js.Any], ProjectionExpression = ProjectionExpression.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionAttributeValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpressionAttributeValues] (val x: Self) extends AnyVal {
    
    inline def setExpressionAttributeValues(value: ExpressionAttributeValueMap): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setKeyConditionExpression(value: KeyExpression): Self = StObject.set(x, "KeyConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpression(value: ProjectionExpression): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
