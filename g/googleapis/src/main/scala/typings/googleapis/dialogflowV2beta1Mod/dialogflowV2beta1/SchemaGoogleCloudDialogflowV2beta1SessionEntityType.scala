package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

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
trait SchemaGoogleCloudDialogflowV2beta1SessionEntityType extends StObject {
  
  /**
    * Required. The collection of entities associated with this session entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.native
  
  /**
    * Required. Indicates whether the additional data should override or
    * supplement the developer entity type definition.
    */
  var entityOverrideMode: js.UndefOr[String] = js.native
  
  /**
    * Required. The unique identifier of this session entity type. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`, or
    * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
    * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
    * ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`. If `Environment ID`
    * is not specified, we assume default &#39;draft&#39; environment. If `User
    * ID` is not specified, we assume default &#39;-&#39; user.  `&lt;Entity
    * Type Display Name&gt;` must be the display name of an existing entity
    * type in the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1SessionEntityType {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1SessionEntityTypeMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1SessionEntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
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
