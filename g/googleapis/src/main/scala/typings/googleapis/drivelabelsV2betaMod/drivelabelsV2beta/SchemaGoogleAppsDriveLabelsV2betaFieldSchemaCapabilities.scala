package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaFieldSchemaCapabilities extends StObject {
  
  /**
    * Whether the user can delete this field. The user must have permission and the field must be deprecated.
    */
  var canDelete: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can disable this field. The user must have permission and this field must not already be disabled.
    */
  var canDisable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can enable this field. The user must have permission and this field must be disabled.
    */
  var canEnable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user can change this field.
    */
  var canUpdate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaFieldSchemaCapabilities {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaFieldSchemaCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaFieldSchemaCapabilities]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaFieldSchemaCapabilities](x: Self) {
    
    inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteNull: Self = StObject.set(x, "canDelete", null)
    
    inline def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
    
    inline def setCanDisable(value: Boolean): Self = StObject.set(x, "canDisable", value.asInstanceOf[js.Any])
    
    inline def setCanDisableNull: Self = StObject.set(x, "canDisable", null)
    
    inline def setCanDisableUndefined: Self = StObject.set(x, "canDisable", js.undefined)
    
    inline def setCanEnable(value: Boolean): Self = StObject.set(x, "canEnable", value.asInstanceOf[js.Any])
    
    inline def setCanEnableNull: Self = StObject.set(x, "canEnable", null)
    
    inline def setCanEnableUndefined: Self = StObject.set(x, "canEnable", js.undefined)
    
    inline def setCanUpdate(value: Boolean): Self = StObject.set(x, "canUpdate", value.asInstanceOf[js.Any])
    
    inline def setCanUpdateNull: Self = StObject.set(x, "canUpdate", null)
    
    inline def setCanUpdateUndefined: Self = StObject.set(x, "canUpdate", js.undefined)
  }
}
