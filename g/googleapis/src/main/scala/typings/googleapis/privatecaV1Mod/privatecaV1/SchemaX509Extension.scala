package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaX509Extension extends StObject {
  
  /**
    * Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
    */
  var critical: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The OID for this X.509 extension.
    */
  var objectId: js.UndefOr[SchemaObjectId] = js.undefined
  
  /**
    * Required. The value of this X.509 extension.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaX509Extension {
  
  inline def apply(): SchemaX509Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaX509Extension]
  }
  
  extension [Self <: SchemaX509Extension](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalNull: Self = StObject.set(x, "critical", null)
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setObjectId(value: SchemaObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
