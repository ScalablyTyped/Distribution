package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAzureBlobStorageData extends StObject {
  
  /**
    * Required. Input only. Credentials used to authenticate API requests to Azure. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
    */
  var azureCredentials: js.UndefOr[SchemaAzureCredentials] = js.undefined
  
  /**
    * Required. The container to transfer from the Azure Storage account.
    */
  var container: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the Azure Storage account.
    */
  var storageAccount: js.UndefOr[String | Null] = js.undefined
}
object SchemaAzureBlobStorageData {
  
  inline def apply(): SchemaAzureBlobStorageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAzureBlobStorageData]
  }
  
  extension [Self <: SchemaAzureBlobStorageData](x: Self) {
    
    inline def setAzureCredentials(value: SchemaAzureCredentials): Self = StObject.set(x, "azureCredentials", value.asInstanceOf[js.Any])
    
    inline def setAzureCredentialsUndefined: Self = StObject.set(x, "azureCredentials", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
    
    inline def setStorageAccountNull: Self = StObject.set(x, "storageAccount", null)
    
    inline def setStorageAccountUndefined: Self = StObject.set(x, "storageAccount", js.undefined)
  }
}
