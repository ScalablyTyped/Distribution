package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a session entity type.  Extends or replaces a developer entity
  * type at the user session level (we refer to the entity types defined at the
  * agent level as &quot;developer entity types&quot;).  Note: session entity
  * types apply to all queries, regardless of the language.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SessionEntityType extends StObject {
  
  /**
    * Required. The collection of entities associated with this session entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  
  /**
    * Required. Indicates whether the additional data should override or
    * supplement the developer entity type definition.
    */
  var entityOverrideMode: js.UndefOr[String] = js.native
  
  /**
    * Required. The unique identifier of this session entity type. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.  `&lt;Entity Type
    * Display Name&gt;` must be the display name of an existing entity type in
    * the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2SessionEntityType {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SessionEntityType]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SessionEntityTypeMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2SessionEntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setEntityOverrideMode(value: String): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
