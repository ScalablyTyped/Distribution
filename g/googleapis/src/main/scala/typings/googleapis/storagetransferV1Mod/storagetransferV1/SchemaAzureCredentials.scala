package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAzureCredentials extends StObject {
  
  /**
    * Required. Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
    */
  var sasToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAzureCredentials {
  
  inline def apply(): SchemaAzureCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAzureCredentials]
  }
  
  extension [Self <: SchemaAzureCredentials](x: Self) {
    
    inline def setSasToken(value: String): Self = StObject.set(x, "sasToken", value.asInstanceOf[js.Any])
    
    inline def setSasTokenNull: Self = StObject.set(x, "sasToken", null)
    
    inline def setSasTokenUndefined: Self = StObject.set(x, "sasToken", js.undefined)
  }
}
