package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigVariableTemplate extends StObject {
  
  /**
    * Authorization code link options. To be populated if `ValueType` is `AUTHORIZATION_CODE`
    */
  var authorizationCodeLink: js.UndefOr[SchemaAuthorizationCodeLink] = js.undefined
  
  /**
    * Description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of the parameter.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enum options. To be populated if `ValueType` is `ENUM`
    */
  var enumOptions: js.UndefOr[js.Array[SchemaEnumOption]] = js.undefined
  
  /**
    * Key of the config variable.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag represents that this `ConfigVariable` must be provided for a connection.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Role grant configuration for the config variable.
    */
  var roleGrant: js.UndefOr[SchemaRoleGrant] = js.undefined
  
  /**
    * State of the config variable.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Regular expression in RE2 syntax used for validating the `value` of a `ConfigVariable`.
    */
  var validationRegex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the parameter: string, int, bool etc. consider custom type for the benefit for the validation.
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigVariableTemplate {
  
  inline def apply(): SchemaConfigVariableTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigVariableTemplate]
  }
  
  extension [Self <: SchemaConfigVariableTemplate](x: Self) {
    
    inline def setAuthorizationCodeLink(value: SchemaAuthorizationCodeLink): Self = StObject.set(x, "authorizationCodeLink", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeLinkUndefined: Self = StObject.set(x, "authorizationCodeLink", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnumOptions(value: js.Array[SchemaEnumOption]): Self = StObject.set(x, "enumOptions", value.asInstanceOf[js.Any])
    
    inline def setEnumOptionsUndefined: Self = StObject.set(x, "enumOptions", js.undefined)
    
    inline def setEnumOptionsVarargs(value: SchemaEnumOption*): Self = StObject.set(x, "enumOptions", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRoleGrant(value: SchemaRoleGrant): Self = StObject.set(x, "roleGrant", value.asInstanceOf[js.Any])
    
    inline def setRoleGrantUndefined: Self = StObject.set(x, "roleGrant", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setValidationRegex(value: String): Self = StObject.set(x, "validationRegex", value.asInstanceOf[js.Any])
    
    inline def setValidationRegexNull: Self = StObject.set(x, "validationRegex", null)
    
    inline def setValidationRegexUndefined: Self = StObject.set(x, "validationRegex", js.undefined)
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
