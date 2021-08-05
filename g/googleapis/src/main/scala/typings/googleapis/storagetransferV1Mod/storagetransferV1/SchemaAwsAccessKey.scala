package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AWS access key (see [AWS Security
  * Credentials](http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)).
  */
trait SchemaAwsAccessKey extends StObject {
  
  /**
    * AWS access key ID. Required.
    */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * AWS secret access key. This field is not returned in RPC responses.
    * Required.
    */
  var secretAccessKey: js.UndefOr[String] = js.undefined
}
object SchemaAwsAccessKey {
  
  inline def apply(): SchemaAwsAccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAwsAccessKey]
  }
  
  extension [Self <: SchemaAwsAccessKey](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
  }
}
