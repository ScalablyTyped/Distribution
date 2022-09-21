package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessLevel extends StObject {
  
  /**
    * A `BasicLevel` composed of `Conditions`.
    */
  var basic: js.UndefOr[SchemaBasicLevel] = js.undefined
  
  /**
    * A `CustomLevel` written in the Common Expression Language.
    */
  var custom: js.UndefOr[SchemaCustomLevel] = js.undefined
  
  /**
    * Description of the `AccessLevel` and its use. Does not affect behavior.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id\}/accessLevels/{short_name\}`. The maximum length // of the `short_name` component is 50 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human readable title. Must be unique within the Policy.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessLevel {
  
  inline def apply(): SchemaAccessLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLevel]
  }
  
  extension [Self <: SchemaAccessLevel](x: Self) {
    
    inline def setBasic(value: SchemaBasicLevel): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    inline def setCustom(value: SchemaCustomLevel): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
