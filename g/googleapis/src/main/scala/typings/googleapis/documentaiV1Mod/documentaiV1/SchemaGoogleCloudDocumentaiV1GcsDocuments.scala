package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1GcsDocuments extends StObject {
  
  /**
    * The list of documents.
    */
  var documents: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1GcsDocument]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1GcsDocuments {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1GcsDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1GcsDocuments]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1GcsDocuments](x: Self) {
    
    inline def setDocuments(value: js.Array[SchemaGoogleCloudDocumentaiV1GcsDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: SchemaGoogleCloudDocumentaiV1GcsDocument*): Self = StObject.set(x, "documents", js.Array(value*))
  }
}
