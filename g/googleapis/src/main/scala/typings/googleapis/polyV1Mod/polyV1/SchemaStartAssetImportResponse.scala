package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartAssetImportResponse extends StObject {
  
  /**
    * The id of newly created asset. If this is empty when the operation is complete it means the import failed. Please refer to the assetImportMessages field to understand what went wrong.
    */
  var assetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the asset import.
    */
  var assetImportId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The message from the asset import. This will contain any warnings (or - in the case of failure - errors) that occurred during import.
    */
  var assetImportMessages: js.UndefOr[js.Array[SchemaAssetImportMessage]] = js.undefined
  
  /**
    * The publish URL for the asset.
    */
  var publishUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaStartAssetImportResponse {
  
  inline def apply(): SchemaStartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartAssetImportResponse]
  }
  
  extension [Self <: SchemaStartAssetImportResponse](x: Self) {
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdNull: Self = StObject.set(x, "assetId", null)
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setAssetImportId(value: String): Self = StObject.set(x, "assetImportId", value.asInstanceOf[js.Any])
    
    inline def setAssetImportIdNull: Self = StObject.set(x, "assetImportId", null)
    
    inline def setAssetImportIdUndefined: Self = StObject.set(x, "assetImportId", js.undefined)
    
    inline def setAssetImportMessages(value: js.Array[SchemaAssetImportMessage]): Self = StObject.set(x, "assetImportMessages", value.asInstanceOf[js.Any])
    
    inline def setAssetImportMessagesUndefined: Self = StObject.set(x, "assetImportMessages", js.undefined)
    
    inline def setAssetImportMessagesVarargs(value: SchemaAssetImportMessage*): Self = StObject.set(x, "assetImportMessages", js.Array(value*))
    
    inline def setPublishUrl(value: String): Self = StObject.set(x, "publishUrl", value.asInstanceOf[js.Any])
    
    inline def setPublishUrlNull: Self = StObject.set(x, "publishUrl", null)
    
    inline def setPublishUrlUndefined: Self = StObject.set(x, "publishUrl", js.undefined)
  }
}
