package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId extends StObject {
  
  /**
    * Optional. Id of the document (indexed) managed by Content Warehouse.
    */
  var cwDocId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The Cloud Storage uri where the actual document is stored.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId](x: Self) {
    
    inline def setCwDocId(value: String): Self = StObject.set(x, "cwDocId", value.asInstanceOf[js.Any])
    
    inline def setCwDocIdNull: Self = StObject.set(x, "cwDocId", null)
    
    inline def setCwDocIdUndefined: Self = StObject.set(x, "cwDocId", js.undefined)
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
