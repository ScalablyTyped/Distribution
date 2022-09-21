package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatusProto extends StObject {
  
  /**
    * The canonical error code (see codes.proto) that most closely corresponds to this status. May be missing.
    */
  var canonicalCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Numeric code drawn from the space specified below. Often, this is the canonical error space, and code is drawn from google3/util/task/codes.proto
    */
  var code: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Detail message
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * message_set associates an arbitrary proto message with the status.
    */
  var messageSet: js.UndefOr[SchemaMessageSet] = js.undefined
  
  /**
    * The following are usually only present when code != 0 Space to which this status belongs
    */
  var space: js.UndefOr[String | Null] = js.undefined
}
object SchemaStatusProto {
  
  inline def apply(): SchemaStatusProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusProto]
  }
  
  extension [Self <: SchemaStatusProto](x: Self) {
    
    inline def setCanonicalCode(value: Double): Self = StObject.set(x, "canonicalCode", value.asInstanceOf[js.Any])
    
    inline def setCanonicalCodeNull: Self = StObject.set(x, "canonicalCode", null)
    
    inline def setCanonicalCodeUndefined: Self = StObject.set(x, "canonicalCode", js.undefined)
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageSet(value: SchemaMessageSet): Self = StObject.set(x, "messageSet", value.asInstanceOf[js.Any])
    
    inline def setMessageSetUndefined: Self = StObject.set(x, "messageSet", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceNull: Self = StObject.set(x, "space", null)
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
