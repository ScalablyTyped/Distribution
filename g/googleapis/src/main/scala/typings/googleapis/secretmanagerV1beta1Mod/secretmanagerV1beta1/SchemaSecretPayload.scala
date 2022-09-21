package typings.googleapis.secretmanagerV1beta1Mod.secretmanagerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretPayload extends StObject {
  
  /**
    * The secret data. Must be no larger than 64KiB.
    */
  var data: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecretPayload {
  
  inline def apply(): SchemaSecretPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretPayload]
  }
  
  extension [Self <: SchemaSecretPayload](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
