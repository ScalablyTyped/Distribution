package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessageParentId extends StObject {
  
  /**
    * ID of the Topic this Message is posted to. NEXT TAG : 5
    */
  var topicId: js.UndefOr[SchemaTopicId] = js.undefined
}
object SchemaMessageParentId {
  
  inline def apply(): SchemaMessageParentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessageParentId]
  }
  
  extension [Self <: SchemaMessageParentId](x: Self) {
    
    inline def setTopicId(value: SchemaTopicId): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
  }
}
