package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3DocumentId extends StObject {
  
  var gcsManagedDocId: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId] = js.undefined
  
  /**
    * Points to a specific revision of the document if set.
    */
  var revisionReference: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3RevisionReference] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3DocumentId {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3DocumentId]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3DocumentId](x: Self) {
    
    inline def setGcsManagedDocId(value: SchemaGoogleCloudDocumentaiUiv1beta3DocumentIdGCSManagedDocumentId): Self = StObject.set(x, "gcsManagedDocId", value.asInstanceOf[js.Any])
    
    inline def setGcsManagedDocIdUndefined: Self = StObject.set(x, "gcsManagedDocId", js.undefined)
    
    inline def setRevisionReference(value: SchemaGoogleCloudDocumentaiUiv1beta3RevisionReference): Self = StObject.set(x, "revisionReference", value.asInstanceOf[js.Any])
    
    inline def setRevisionReferenceUndefined: Self = StObject.set(x, "revisionReference", js.undefined)
  }
}
