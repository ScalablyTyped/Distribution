package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentRevision extends StObject {
  
  /**
    * If the change was made by a person specify the name or id of that person.
    */
  var agent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that the revision was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human Review information of this revision.
    */
  var humanReview: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview] = js.undefined
  
  /**
    * Id of the revision. Unique within the context of the document.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The revisions that this revision is based on. This can include one or more parent (when documents are merged.) This field represents the index into the `revisions` field.
    */
  var parent: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The revisions that this revision is based on. Must include all the ids that have anything to do with this revision - eg. there are `provenance.parent.revision` fields that index into this field.
    */
  var parentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If the annotation was made by processor identify the processor by its resource name.
    */
  var processor: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentRevision {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentRevision]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentRevision](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentNull: Self = StObject.set(x, "agent", null)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setHumanReview(value: SchemaGoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview): Self = StObject.set(x, "humanReview", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewUndefined: Self = StObject.set(x, "humanReview", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParent(value: js.Array[Double]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentIds(value: js.Array[String]): Self = StObject.set(x, "parentIds", value.asInstanceOf[js.Any])
    
    inline def setParentIdsNull: Self = StObject.set(x, "parentIds", null)
    
    inline def setParentIdsUndefined: Self = StObject.set(x, "parentIds", js.undefined)
    
    inline def setParentIdsVarargs(value: String*): Self = StObject.set(x, "parentIds", js.Array(value*))
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Double*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorNull: Self = StObject.set(x, "processor", null)
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
  }
}
