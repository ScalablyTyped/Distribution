package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAwsAccessKey extends StObject {
  
  /**
    * Required. AWS access key ID.
    */
  var accessKeyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. AWS secret access key. This field is not returned in RPC responses.
    */
  var secretAccessKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaAwsAccessKey {
  
  inline def apply(): SchemaAwsAccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsAccessKey]
  }
  
  extension [Self <: SchemaAwsAccessKey](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdNull: Self = StObject.set(x, "accessKeyId", null)
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyNull: Self = StObject.set(x, "secretAccessKey", null)
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
  }
}
