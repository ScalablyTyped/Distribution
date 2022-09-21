package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentProvenance extends StObject {
  
  /**
    * The Id of this operation. Needs to be unique within the scope of the revision.
    */
  var id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * References to the original elements that are replaced.
    */
  var parents: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentProvenanceParent]] = js.undefined
  
  /**
    * The index of the revision that produced this element.
    */
  var revision: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of provenance operation.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentProvenance {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentProvenance]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentProvenance](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParents(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2DocumentProvenanceParent]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    inline def setParentsVarargs(value: SchemaGoogleCloudDocumentaiV1beta2DocumentProvenanceParent*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
