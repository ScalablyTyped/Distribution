package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentProvenanceParent extends StObject {
  
  /**
    * The id of the parent provenance.
    */
  var id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The index of the parent item in the corresponding item list (eg. list of entities, properties within entities, etc.) in the parent revision.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The index of the index into current revision's parent_ids list.
    */
  var revision: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentProvenanceParent {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentProvenanceParent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentProvenanceParent]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentProvenanceParent](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
