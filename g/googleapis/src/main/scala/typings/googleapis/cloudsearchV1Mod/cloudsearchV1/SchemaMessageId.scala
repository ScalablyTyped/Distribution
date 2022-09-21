package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageId extends StObject {
  
  /**
    * Opaque, server-assigned ID of the Message. While this ID is guaranteed to be unique within the Space, it's not guaranteed to be globally unique.
    */
  var messageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the Message's immediate parent.
    */
  var parentId: js.UndefOr[SchemaMessageParentId] = js.undefined
}
object SchemaMessageId {
  
  inline def apply(): SchemaMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageId]
  }
  
  extension [Self <: SchemaMessageId](x: Self) {
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdNull: Self = StObject.set(x, "messageId", null)
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setParentId(value: SchemaMessageParentId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
  }
}
