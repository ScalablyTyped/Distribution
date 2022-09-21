package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingImportErrorContext extends StObject {
  
  /**
    * The detailed content which caused the error on importing a catalog item.
    */
  var catalogItem: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Storage file path of the import source. Can be set for batch operation error.
    */
  var gcsPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line number of the content in file. Should be empty for permission or batch operation error.
    */
  var lineNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operation resource name of the LRO.
    */
  var operationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The detailed content which caused the error on importing a product.
    */
  var product: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The detailed content which caused the error on importing a user event.
    */
  var userEvent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailLoggingImportErrorContext {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingImportErrorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingImportErrorContext]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingImportErrorContext](x: Self) {
    
    inline def setCatalogItem(value: String): Self = StObject.set(x, "catalogItem", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemNull: Self = StObject.set(x, "catalogItem", null)
    
    inline def setCatalogItemUndefined: Self = StObject.set(x, "catalogItem", js.undefined)
    
    inline def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    inline def setGcsPathNull: Self = StObject.set(x, "gcsPath", null)
    
    inline def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
    
    inline def setLineNumber(value: String): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberNull: Self = StObject.set(x, "lineNumber", null)
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameNull: Self = StObject.set(x, "operationName", null)
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductNull: Self = StObject.set(x, "product", null)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setUserEvent(value: String): Self = StObject.set(x, "userEvent", value.asInstanceOf[js.Any])
    
    inline def setUserEventNull: Self = StObject.set(x, "userEvent", null)
    
    inline def setUserEventUndefined: Self = StObject.set(x, "userEvent", js.undefined)
  }
}
