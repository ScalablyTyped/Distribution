package typings.lesgo.anon

import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.PutItemInputAttributeMap
import typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var Item: PutItemInputAttributeMap
  
  var TableName: typings.awsSdk.libDynamodbDocumentClientMod.DocumentClient.TableName
}
object Item {
  
  inline def apply(Item: PutItemInputAttributeMap, TableName: TableName): Item = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: PutItemInputAttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
