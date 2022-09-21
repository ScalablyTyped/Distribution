package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3SessionEntityType extends StObject {
  
  /**
    * Required. The collection of entities to override or supplement the custom entity type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3EntityTypeEntity]] = js.undefined
  
  /**
    * Required. Indicates whether the additional data should override or supplement the custom entity type definition.
    */
  var entityOverrideMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3SessionEntityType {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3SessionEntityType]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3SessionEntityType](x: Self) {
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDialogflowCxV3EntityTypeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowCxV3EntityTypeEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityOverrideMode(value: String): Self = StObject.set(x, "entityOverrideMode", value.asInstanceOf[js.Any])
    
    inline def setEntityOverrideModeNull: Self = StObject.set(x, "entityOverrideMode", null)
    
    inline def setEntityOverrideModeUndefined: Self = StObject.set(x, "entityOverrideMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
