package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An **entity entry** for an associated entity type.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2EntityTypeEntity extends StObject {
  
  /**
    * Required. A collection of value synonyms. For example, if the entity type
    * is *vegetable*, and `value` is *scallions*, a synonym could be *green
    * onions*.  For `KIND_LIST` entity types:  *   This collection must contain
    * exactly one synonym equal to `value`.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. The primary value associated with this entity entry. For
    * example, if the entity type is *vegetable*, the value could be
    * *scallions*.  For `KIND_MAP` entity types:  *   A canonical value to be
    * used in place of synonyms.  For `KIND_LIST` entity types:  *   A string
    * that can contain references to other entity types (with or     without
    * aliases).
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2EntityTypeEntity {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2EntityTypeEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2EntityTypeEntity]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2EntityTypeEntityMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2EntityTypeEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
