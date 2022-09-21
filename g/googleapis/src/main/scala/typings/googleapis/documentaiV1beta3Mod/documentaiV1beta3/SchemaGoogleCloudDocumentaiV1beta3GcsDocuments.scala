package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3GcsDocuments extends StObject {
  
  /**
    * The list of documents.
    */
  var documents: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3GcsDocument]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3GcsDocuments {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3GcsDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3GcsDocuments]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3GcsDocuments](x: Self) {
    
    inline def setDocuments(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3GcsDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3GcsDocument*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
